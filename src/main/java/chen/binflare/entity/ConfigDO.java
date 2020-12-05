package chen.binflare.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "config")
public class ConfigDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "config_key")
    private String configKey;

    @Column(name = "config_value")
    private String configValue;
}
