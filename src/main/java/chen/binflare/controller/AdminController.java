package chen.binflare.controller;

import chen.binflare.common.dto.ResponseDTO;
import chen.binflare.dto.ResultDTO;
import chen.binflare.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PutMapping("/users/keys")
    public ResponseDTO<ResultDTO> updateUsersKeys() {
        return ResponseDTO.success(adminService.updateUsersKeys());
    }
}
