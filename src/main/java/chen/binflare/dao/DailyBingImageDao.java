package chen.binflare.dao;

import chen.binflare.commons.dao.BaseDao;
import chen.binflare.entity.DailyBingImageEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

public interface DailyBingImageDao extends BaseDao<DailyBingImageEntity, Integer> {

    Optional<DailyBingImageEntity> findTopByImageDate(LocalDate imageDate);

    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query("update DailyBingImageEntity set imageUrl = ?2 where imageDate = ?1")
    void updateImageUrlByImageDate(LocalDate imageDate, String imageUrl);
}
