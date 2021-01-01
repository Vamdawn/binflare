package chen.binflare.service.impl;

import chen.binflare.dto.users.CreateTokenRespDTO;
import chen.binflare.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UsersServiceImpl implements UsersService {

    @Override
    public CreateTokenRespDTO createAccessToken(Integer userType, String userName, Integer passType, String passWord) {
        return null;
    }
}
