package chen.binflare.dto.users;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "获取访问凭据返回")
public class CreateTokenRespDTO implements Serializable {

    @ApiModelProperty(value = "用户编号")
    private String accountNo;

    @ApiModelProperty(value = "访问凭证")
    private String access_token;
}
