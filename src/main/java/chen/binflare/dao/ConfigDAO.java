package chen.binflare.dao;

import chen.binflare.entity.ConfigDO;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface ConfigDAO extends BaseRepository<ConfigDO, Integer> {

    Optional<ConfigDO> findByConfigKey(String key);

    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query("update ConfigDO set configValue = ?2 where configKey = ?1")
    void updateValueByKey(String key, String value);
}
