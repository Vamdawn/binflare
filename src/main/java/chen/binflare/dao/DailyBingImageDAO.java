package chen.binflare.dao;

import chen.binflare.entity.DailyBingImageDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

public interface DailyBingImageDAO extends JpaRepository<DailyBingImageDO, Integer> {

    Optional<DailyBingImageDO> findTopByImageDate(LocalDate imageDate);

    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query("update DailyBingImageDO set imageUrl = ?2 where imageDate = ?1")
    void updateImageUrlByImageDate(LocalDate imageDate, String imageUrl);
}
