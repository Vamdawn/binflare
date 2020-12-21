package chen.binflare.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * <code>user_credential inner join user_secret on user_credential.user_id = user_secret.user_id</code>
 */
@Data
@Entity
@Table(name = "user_credential")
public class UserCredentialSecretDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "credential_type")
    private Byte credentialType;

    @Column(name = "credential_value")
    private String credentialValue;

    @JoinColumn(name = "secret_type", table = "user_secret")
    private Byte secretType;

    @JoinColumn(name = "secret_value", table = "user_secret")
    private String secretValue;
}
