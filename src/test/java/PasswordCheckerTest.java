import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PasswordCheckerTest {
    @Test
    void passwordIsValid() {
        assertThrows(Exception.class, () -> PasswordChecker.passwordIsValid("P@ssword"));
    }
    @Test
    void passwordIsOk(){
        assertSame(false,PasswordChecker.passwordIsOk("P@ssw0rd"));
        assertSame(true,PasswordChecker.passwordIsOk("Passwords"));
    }
}