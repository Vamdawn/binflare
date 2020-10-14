package chen.binflare.service.impl;

import chen.binflare.dao.DailyBingImageDao;
import chen.binflare.domain.DailyBingImageDo;
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
                    DailyBingImageDo dailyBingImageDo = new DailyBingImageDo();
                    dailyBingImageDo.setImageDate(now);
                    dailyBingImageDo.setImageUrl(imageUrl);
                    dailyBingImageDao.save(dailyBingImageDo);
                }
            }
        } catch (Exception e) {
            log.error("[ERROR][Record][DailyBingImage]", e);
        }
    }
}
