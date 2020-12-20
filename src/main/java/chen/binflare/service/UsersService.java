package chen.binflare.service;

import chen.binflare.dto.users.CreateTokenRespDTO;

/**
 * User Service
 */
public interface UsersService {

    /**
     * Get AccessToken (user login)
     *
     * @param userName authorization username
     * @param passWord authorization password
     * @param userType authorization user type
     * @param passType authorization pass type
     * @return
     */
    CreateTokenRespDTO createAccessToken(String userName, String passWord, Integer userType, Integer passType);
}
