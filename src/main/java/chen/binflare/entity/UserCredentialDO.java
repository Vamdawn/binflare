package chen.binflare.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "user_credential")
public class UserCredentialDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "credential_type")
    private Integer credentialType;

    @Column(name = "credential_uid")
    private Integer credentialUid;

    @Column(name = "credential_secret")
    private Integer credentialSecret;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "update_time")
    private LocalDateTime updateTime;
}
