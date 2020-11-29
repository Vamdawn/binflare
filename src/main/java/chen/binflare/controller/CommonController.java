package chen.binflare.controller;

import chen.binflare.common.dto.ResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CommonController {

    @GetMapping("/ping")
    public ResponseDTO<String> ping() {
        return ResponseDTO.success("pong!");
    }
}
