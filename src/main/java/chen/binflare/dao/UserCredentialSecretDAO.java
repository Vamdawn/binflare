package chen.binflare.dao;

import chen.binflare.entity.UserCredentialSecretDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserCredentialSecretDAO extends JpaRepository<UserCredentialSecretDO, Integer> {

    @Query(value = "SELECT uc.id, uc.user_id, uc.credential_type, uc.credential_value, us.secret_type, us.secret_value " +
            "FROM user_credential uc INNER JOIN user_secret us ON uc.user_id = us.user_id " +
            "WHERE uc.credential_type = :credentialType AND uc.credential_value = :credentialValue AND us.secret_type = :secretType AND us.secret_value = :secretValue", nativeQuery = true)
    UserCredentialSecretDO findByCredentialAndSecret(Byte credentialType, String credentialValue, Byte secretType, String secretValue);
}
