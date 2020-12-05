package chen.binflare.dao;

import chen.binflare.entity.ConfigDO;

import java.util.Optional;

public interface ConfigDAO extends BaseRepository<ConfigDO, Integer> {

    Optional<ConfigDO> findByConfigKey(String key);
}
