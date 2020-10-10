package chen.binflare.service.impl;

import chen.binflare.dao.UserDao;
import chen.binflare.dto.UserInfoDto;
import chen.binflare.entity.UserDo;
import chen.binflare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserInfoDto getInfo(Integer id) {
        UserDo userDo = (id == null) ? null : userDao.findById(id).orElse(null);
        if (userDo != null) {
            return UserInfoDto.builder().name(userDo.getName()).build();
        }
        return UserInfoDto.builder().build();
    }
}
