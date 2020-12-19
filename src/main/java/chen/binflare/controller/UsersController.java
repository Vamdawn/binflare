package chen.binflare.controller;

import chen.binflare.common.dto.ResponseDTO;
import chen.binflare.dto.UsersDTO;
import chen.binflare.exception.BaseException;
import chen.binflare.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/{id}")
    public ResponseDTO<UsersDTO> getUserInfo(@PathVariable Integer id) throws BaseException {
        return ResponseDTO.success(usersService.getUserInfo(id));
    }
}
