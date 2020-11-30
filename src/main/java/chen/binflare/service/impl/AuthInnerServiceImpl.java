package chen.binflare.service.impl;

import chen.binflare.bo.AuthPayloadBO;
import chen.binflare.service.AuthInnerService;

/**
 * Authorization inner implemention
 */
public class AuthInnerServiceImpl implements AuthInnerService {
    /**
     * sign with common private key as jwt token
     *
     * @param authPayloadBO auth payload
     * @return jwt token
     */
    @Override
    public String jwtSign(AuthPayloadBO authPayloadBO) {
        return null;
    }

    /**
     * verify the jwt token by public key
     *
     * @param jwtToken jwt token
     * @return isValid?
     */
    @Override
    public boolean jwtVerify(String jwtToken) {
        return false;
    }
}
