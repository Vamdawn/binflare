package chen.binflare.controller;

import chen.binflare.commons.dto.ResponseDto;
import chen.binflare.dto.UserInfoDto;
import chen.binflare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/info")
    ResponseDto<UserInfoDto> getInfo(@RequestParam Integer id) {
        return ResponseDto.success(userService.getInfo(id));
    }
}
