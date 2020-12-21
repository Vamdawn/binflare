package chen.binflare.dao;

import chen.binflare.entity.UserCredentialDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialDAO extends JpaRepository<UserCredentialDO, Integer> {
}
