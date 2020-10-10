package chen.binflare.controller;

import chen.binflare.commons.dto.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CommonController {

    @GetMapping("/ping")
    public ResponseDto<String> ping() {
        return ResponseDto.success("pong!");
    }
}
