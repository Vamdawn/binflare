package chen.binflare.service;

import chen.binflare.dto.UsersDTO;
import chen.binflare.exception.BaseException;

/**
 * Users Service
 */
public interface UsersService {

    /**
     * 获取用户信息
     *
     * @param id userId
     * @return userInfo
     */
    UsersDTO getUserInfo(Integer id) throws BaseException;
}
