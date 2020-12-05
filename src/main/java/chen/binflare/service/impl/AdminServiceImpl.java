package chen.binflare.service.impl;

import chen.binflare.dto.ResultDTO;
import chen.binflare.service.AdminService;
import chen.binflare.service.AuthInnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AuthInnerService authInnerService;

    /**
     * update login public & private key
     *
     * @return result
     */
    @Override
    public ResultDTO updateUsersKeys() {
        return ResultDTO.builder().result(authInnerService.refreshLoginKey()).build();
    }
}
