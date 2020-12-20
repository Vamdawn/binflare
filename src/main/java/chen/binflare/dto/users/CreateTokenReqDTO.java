package chen.binflare.dto.users;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel(description = "Request of get access token")
public class CreateTokenReqDTO implements Serializable {

    @NotNull(message = "user name cannot be null")
    @ApiModelProperty(value = "authorization username")
    private String userName;

    @ApiModelProperty(value = "authorization password")
    private String passWord;

    @NotNull(message = "user type cannot be null")
    @ApiModelProperty(value = "username type - 1: email.")
    private Integer userType;

    @ApiModelProperty(value = "password type - 1: password; 2: verification code.")
    private Integer passType;
}
