package chen.binflare.service;

import chen.binflare.dto.ResultDTO;

public interface AdminService {

    /**
     * update login public & private key
     *
     * @return result
     */
    ResultDTO updateUsersKeys();
}
