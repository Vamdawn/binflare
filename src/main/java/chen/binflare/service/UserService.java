package chen.binflare.service;

import chen.binflare.dto.UserInfoDto;

public interface UserService {

    /**
     * 获取用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    UserInfoDto getInfo(Integer id);
}
