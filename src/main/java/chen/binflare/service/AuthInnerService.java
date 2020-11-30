package chen.binflare.service;

import chen.binflare.bo.AuthPayloadBO;

/**
 * about authorization
 */
public interface AuthInnerService {

    /**
     * sign with common private key as jwt token
     *
     * @param authPayloadBO auth payload
     * @return jwt token
     */
    String jwtSign(AuthPayloadBO authPayloadBO);

    /**
     * verify the jwt token by public key
     *
     * @param jwtToken jwt token
     * @return isValid?
     */
    boolean jwtVerify(String jwtToken);
}
