package chen.binflare.dao;

import chen.binflare.commons.dao.BaseDao;
import chen.binflare.domain.DailyBingImageDo;

import java.time.LocalDate;
import java.util.Optional;

public interface DailyBingImageDao extends BaseDao<DailyBingImageDo, Integer> {

    Optional<DailyBingImageDo> findTopByDate(LocalDate date);
}
