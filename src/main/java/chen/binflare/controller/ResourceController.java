package chen.binflare.controller;

import chen.binflare.common.dto.ResponseDTO;
import chen.binflare.dto.SplashResourceDTO;
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
    public ResponseDTO<SplashResourceDTO> getSplashResource() {
        return ResponseDTO.success(resourceService.getSplashResource());
    }
}
