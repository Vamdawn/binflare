package chen.binflare.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "daily_bing_image")
public class DailyBingImageDo {

    @Id
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