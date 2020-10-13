package chen.binflare.controller;

import chen.binflare.commons.dto.ResponseDto;
import chen.binflare.dto.SplashResourceDto;
import chen.binflare.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resource")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/splash")
    public ResponseDto<SplashResourceDto> getSplashResource() {
        return ResponseDto.success(resourceService.getSplashResource());
    }
}
