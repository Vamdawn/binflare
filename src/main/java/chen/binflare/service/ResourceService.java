package chen.binflare.service;

import chen.binflare.dto.SplashResourceDTO;

public interface ResourceService {

    /**
     * 获取当前首页资源
     * @return 首页资源
     */
    SplashResourceDTO getSplashResource();
}
