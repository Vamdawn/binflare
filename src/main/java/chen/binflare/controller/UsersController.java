package chen.binflare.controller;

import chen.binflare.common.dto.ResponseDTO;
import chen.binflare.dto.users.CreateTokenReqDTO;
import chen.binflare.dto.users.CreateTokenRespDTO;
import chen.binflare.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/token")
    public ResponseDTO<CreateTokenRespDTO> createAccessToken(@RequestBody @Validated CreateTokenReqDTO createTokenReqDTO) {
        return ResponseDTO.success(usersService.createAccessToken(
                createTokenReqDTO.getUserType(), createTokenReqDTO.getUserName(),
                createTokenReqDTO.getPassType(), createTokenReqDTO.getPassWord()
        ));
    }
}
