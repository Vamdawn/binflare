package chen.binflare.dao;

import chen.binflare.entity.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserDO, Integer> {
}
