package chen.binflare.dto.users;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel(description = "获取访问凭据请求")
public class CreateTokenReqDTO implements Serializable {

    @NotNull(message = "user name cannot be null")
    @ApiModelProperty(value = "鉴权用户名")
    private String userName;

    @ApiModelProperty(value = "鉴权密码")
    private String passWord;

    @NotNull(message = "user type cannot be null")
    @ApiModelProperty(value = "鉴权账号类型")
    private Byte userType;

    @ApiModelProperty(value = "鉴权密码类型")
    private Byte passType;
}
