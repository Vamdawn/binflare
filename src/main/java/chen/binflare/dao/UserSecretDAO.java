package chen.binflare.dao;

import chen.binflare.entity.UserSecretDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSecretDAO extends JpaRepository<UserSecretDO, Integer> {
}
