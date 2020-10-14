package chen.binflare.service;

/**
 * 三方api服务
 */
public interface OpenApiService {

    /**
     * 查询今日Bing的图片 并存储到数据库
     */
    void recordDailyBingImage();
}
