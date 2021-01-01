package chen.binflare.dao;

import chen.binflare.entity.UserAuthDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthDAO extends JpaRepository<UserAuthDO, Long> {
}
