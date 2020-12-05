package chen.binflare.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@ApiModel(description = "Common Result DTO")
public class ResultDTO {

    @ApiModelProperty(value = "excute result", required = true)
    private Boolean result;
}
