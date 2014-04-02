package mx.sekureco.aes;
import mx.sekureco.helper.Helper;
import mx.sekureco.helper.Helper;

/**
 * Created by Rachid on 3/30/2014.
 */
public class AES {
    byte[] key;
    byte[] plainBytes;
    byte[] cipherBytes;

    public AES(String key) {
        this.key= Helper.hexStringToByteArray(key);
    }

}
