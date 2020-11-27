package chen.binflare.service.impl;

import chen.binflare.dao.DailyBingImageDAO;
import chen.binflare.dto.SplashResourceDTO;
import chen.binflare.entity.DailyBingImageDO;
import chen.binflare.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private DailyBingImageDAO dailyBingImageDao;

    @Override
    public SplashResourceDTO getSplashResource() {
        Optional<DailyBingImageDO> optionalDailyBingImageDo = dailyBingImageDao.findTopByImageDate(LocalDate.now());
        String imageUrl = null;
        if (optionalDailyBingImageDo.isPresent()) {
            DailyBingImageDO dailyBingImageDO = optionalDailyBingImageDo.get();
            imageUrl = dailyBingImageDO.getImageUrl();
        }
        return SplashResourceDTO.builder().imageUrl(imageUrl).build();
    }
}
