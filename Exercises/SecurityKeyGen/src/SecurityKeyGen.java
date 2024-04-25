import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class SecurityKeyGen {

public static void main(String []args) throws NoSuchAlgorithmException {
    // Generate AES Key
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // 256-bit AES
        SecretKey secretKey = keyGen.generateKey();
        // Get key bytes
        byte[] keyBytes = secretKey.getEncoded();

        // Convert to hexadecimal
        StringBuilder hexKey = new StringBuilder();
        for (byte b : keyBytes) {
                hexKey.append(String.format("%02X", b));
        }

        System.out.println("Secret Key: " + hexKey.toString());
}

}
