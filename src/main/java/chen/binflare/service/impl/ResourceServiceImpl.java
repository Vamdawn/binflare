package chen.binflare.service.impl;

import chen.binflare.dao.DailyBingImageDao;
import chen.binflare.domain.DailyBingImageDo;
import chen.binflare.dto.SplashResourceDto;
import chen.binflare.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private DailyBingImageDao dailyBingImageDao;

    @Override
    public SplashResourceDto getSplashResource() {
        Optional<DailyBingImageDo> optionalDailyBingImageDo = dailyBingImageDao.findTopByDate(LocalDate.now());
        String imageUrl = null;
        if (optionalDailyBingImageDo.isPresent()) {
            DailyBingImageDo dailyBingImageDo = optionalDailyBingImageDo.get();
            imageUrl = dailyBingImageDo.getImageUrl();
        }
        return SplashResourceDto.builder().imageUrl(imageUrl).build();
    }
}
