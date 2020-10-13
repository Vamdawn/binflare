package chen.binflare.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "daily_bing_image")
public class DailyBingImageDo {

    @Id
    private Integer id;

    private LocalDate date;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "update_time")
    private Long updateTime;
}
