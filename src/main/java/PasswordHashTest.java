import junit.framework.TestCase;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Hop Dac Ho on 27/07/2016.
 */
public class PasswordHashTest extends TestCase {
    public void testMD5Hash() {
        String password = "123123";
        Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
        String hashedPassword = md5PasswordEncoder.encodePassword(password, null);
        System.out.println(hashedPassword);
    }

    public void testBCryptHash() {
        String password = "123123";
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = bCryptPasswordEncoder.encode(password);
        System.out.println(hashedPassword);
    }
}