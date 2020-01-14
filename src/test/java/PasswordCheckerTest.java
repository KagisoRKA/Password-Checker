import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PasswordCheckerTest {
    @Test
    void passwordIsValid() throws Exception {
        /* assertThrows expects the method passwordIsValid to throw an exception if one these conditions is not met.
            * password should exist
            * password should be longer than 8 characters
            * password should have at least one lowercase letter
            * password should have at least one uppercase letter
            * password should at least have one digit
            * password should have at least one special character
         */
        assertThrows(Exception.class, () -> PasswordChecker.passwordIsValid("P@word"));
        //assertEquals expects the method passwordIsValid to print out "Successfully set" if all conditions are met
        assertEquals("Successfully set",PasswordChecker.passwordIsValid("P@ssword2"));
    }
    @Test
    void passwordIsOk(){
        assertSame(false,PasswordChecker.passwordIsOk("P@ssw0rd"));
        assertSame(true,PasswordChecker.passwordIsOk("Passwords"));
    }
}