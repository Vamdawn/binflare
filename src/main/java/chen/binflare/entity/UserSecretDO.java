package chen.binflare.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Table(name = "user_secret")
public class UserSecretDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "secret_type")
    private Byte secretType;

    @Column(name = "secret_value")
    private String secretValue;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;
}
