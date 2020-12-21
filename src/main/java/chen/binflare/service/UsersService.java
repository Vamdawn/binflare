package chen.binflare.service;

import chen.binflare.dto.users.CreateTokenRespDTO;

/**
 * User Service
 */
public interface UsersService {

    /**
     * Get AccessToken (user login)
     *
     * @param userType authorization user type
     * @param userName authorization username
     * @param passType authorization pass type
     * @param passWord authorization password
     * @return
     */
    CreateTokenRespDTO createAccessToken(Integer userType, String userName, Integer passType, String passWord);
}
