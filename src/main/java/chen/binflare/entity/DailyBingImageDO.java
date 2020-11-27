package chen.binflare.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "daily_bing_image")
public class DailyBingImageDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "image_date")
    private LocalDate imageDate;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "update_time")
    private Timestamp updateTime;
}
