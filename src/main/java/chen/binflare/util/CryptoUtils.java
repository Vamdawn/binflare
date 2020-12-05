package chen.binflare.util;

import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * a simple crypto util class.
 */
public class CryptoUtils {

    private CryptoUtils() {
        throw new UnsupportedOperationException();
    }

    /**
     * create RSAPrivateKey from key bytes
     *
     * @param encodedKey key bytes
     * @return RSAPrivateKey
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     */
    public static RSAPrivateKey createRsaPrivateKey(byte[] encodedKey) throws NoSuchAlgorithmException, InvalidKeySpecException {
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(encodedKey);
        return (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(pkcs8EncodedKeySpec);
    }

    /**
     * create RSAPublicKey from key bytes
     *
     * @param encodedKey key bytes
     * @return RSAPublicKey
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     */
    public static RSAPublicKey createRsaPublicKey(byte[] encodedKey) throws NoSuchAlgorithmException, InvalidKeySpecException {
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(encodedKey);
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(x509EncodedKeySpec);
    }

    /**
     * use default SecureRandom create KeyPair
     *
     * @param algorithm the standard string name of the algorithm.
     * @param keySize   the keysize. This is an algorithm-specific metric, such as modulus length, specified in number of bits.
     * @return the generated key pair
     * @throws NoSuchAlgorithmException if no Provider supports a KeyPairGeneratorSpi implementation for the specified algorithm.
     */
    public static KeyPair generateRandomKeyPair(String algorithm, int keySize) throws NoSuchAlgorithmException {
        SecureRandom secureRandom = new SecureRandom();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algorithm);
        keyPairGenerator.initialize(keySize, secureRandom);
        return keyPairGenerator.generateKeyPair();
    }
}
