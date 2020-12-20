package chen.binflare.dto.users;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "Response of get access token")
public class CreateTokenRespDTO implements Serializable {

    @ApiModelProperty(value = "account number")
    private String accountNo;

    @ApiModelProperty(value = "access token for apis")
    private String access_token;
}
