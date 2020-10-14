package chen.binflare.schedule;

import chen.binflare.service.OpenApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CircleTask {

    @Autowired
    private OpenApiService openApiService;

    @Scheduled(cron = "0 0 0/1 * * ?")
    public void refreshBingDaily() {
        openApiService.recordDailyBingImage();
    }
}
