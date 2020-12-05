package chen.binflare.util;

import org.junit.jupiter.api.Test;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

class CryptoUtilsTest {

    @Test
    void generateRandomKeyPair() throws NoSuchAlgorithmException {
        String ALGORITHM = "RSA";
        int KEYSIZE = 1024;
        KeyPair keyPair = CryptoUtils.generateRandomKeyPair(ALGORITHM, KEYSIZE);
        byte[] privateKey = keyPair.getPrivate().getEncoded();
        byte[] publicKey = keyPair.getPublic().getEncoded();
        System.out.println(Base64.getEncoder().encodeToString(privateKey));
        System.out.println(Base64.getEncoder().encodeToString(publicKey));
    }
}