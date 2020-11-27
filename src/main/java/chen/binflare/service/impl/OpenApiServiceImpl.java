package chen.binflare.service.impl;

import chen.binflare.dao.DailyBingImageDao;
import chen.binflare.entity.DailyBingImageEntity;
import chen.binflare.service.OpenApiService;
import chen.binflare.utils.HttpUtils;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
public class OpenApiServiceImpl implements OpenApiService {

    @Autowired
    private DailyBingImageDao dailyBingImageDao;

    @Value("${com.bing.daily.image.url}")
    private String bingDailyImageUrl;

    @Value("${com.bing.base.url}")
    private String bingBaseUrl;

    @Override
    public void recordDailyBingImage() {
        Request request = new Request.Builder()
                .url(bingDailyImageUrl)
                .build();
        try (Response response = HttpUtils.CLIENT.newCall(request).execute()) {
            ResponseBody responseBody = response.body();
            if (responseBody != null) {
                String bodyString = responseBody.string();
                JSONObject jsonObject = JSONObject.parseObject(bodyString);
                String imagePath = jsonObject.getJSONArray("images").getJSONObject(0).getString("url");
                String imageUrl = bingBaseUrl + imagePath;

                LocalDate now = LocalDate.now();
                if (dailyBingImageDao.findTopByImageDate(now).isPresent()) {
                    dailyBingImageDao.updateImageUrlByImageDate(now, imageUrl);
                } else {
                    DailyBingImageEntity dailyBingImageEntity = new DailyBingImageEntity();
                    dailyBingImageEntity.setImageDate(now);
                    dailyBingImageEntity.setImageUrl(imageUrl);
                    dailyBingImageDao.save(dailyBingImageEntity);
                }
                log.info("[Refresh][DailyBingImage] - [date : {}][link : {}]", now, imageUrl);
            }
        } catch (Exception e) {
            log.error("[ERROR][Record][DailyBingImage]", e);
        }
    }
}
