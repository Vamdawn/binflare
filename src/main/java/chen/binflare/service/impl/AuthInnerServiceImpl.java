package chen.binflare.service.impl;

import chen.binflare.bo.AuthPayloadBO;
import chen.binflare.constant.ConfigConstants;
import chen.binflare.constant.CryptoConstants;
import chen.binflare.dao.ConfigDAO;
import chen.binflare.service.AuthInnerService;
import chen.binflare.util.CryptoUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.KeyPair;

/**
 * Authorization inner implemention
 */
@Slf4j
@Service
public class AuthInnerServiceImpl implements AuthInnerService {

    @Autowired
    private ConfigDAO configDAO;

    /**
     * refresh login public & private key
     *
     * @return result
     */
    @Override
    public boolean refreshLoginKey() {
        try {
            KeyPair keyPair = CryptoUtils.generateRandomKeyPair(CryptoConstants.LOGIN_KEY_ALGORITHM, CryptoConstants.LOGIN_KEY_SIZE);
            String privateKey = Base64.encodeBase64String(keyPair.getPrivate().getEncoded());
            String publicKey = Base64.encodeBase64String(keyPair.getPublic().getEncoded());
            configDAO.updateValueByKey(ConfigConstants.LOGIN_PRIVATE_KEY, privateKey);
            configDAO.updateValueByKey(ConfigConstants.LOGIN_PUBLIC_KEY, publicKey);
            return true;
        } catch (Exception e) {
            log.error("[FAIL][REFRESH KEY]", e);
            return false;
        }
    }

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
