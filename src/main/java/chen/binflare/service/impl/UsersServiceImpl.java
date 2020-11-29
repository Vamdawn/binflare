package chen.binflare.service.impl;

import chen.binflare.dao.UserDAO;
import chen.binflare.dto.UsersDTO;
import chen.binflare.entity.UserDO;
import chen.binflare.exception.BaseException;
import chen.binflare.exception.Exceptions;
import chen.binflare.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserDAO userDAO;

    /**
     * 获取用户信息
     *
     * @param id userId
     * @return userInfo
     */
    @Override
    public UsersDTO getUserInfo(Long id) throws BaseException {
        Optional<UserDO> optionalUserDO = userDAO.findById(id);
        if (!optionalUserDO.isPresent()) {
            throw Exceptions.USER_NOT_FOUND.checked();
        }
        UserDO userDO = optionalUserDO.get();
        UsersDTO usersDTO = new UsersDTO();
        BeanUtils.copyProperties(userDO, usersDTO);
        return usersDTO;
    }
}
