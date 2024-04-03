import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordTest {

    @Test
    public void hasMinLength8Test_whenPassword_thenReturnTrue(){

        // GIVEN
        String password = "12345678";

        //WHEN
        boolean actual = ImplementMethods.passwordLengthTest(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void hasDigitTest_whenPassword_thenReturnTrue(){

        // GIVEN
        String password = "123456789";

        //WHEN
        boolean actual = ImplementMethods.checkDigit(password);

        //THEN
        assertTrue(actual);
    }


    @Test
    public void hasMixedLettersCaseTest_whenPassword_thenReturnTrue(){
        // GIVEN
        String password = "12absABC";

        //WHEN
        boolean actual = ImplementMethods.checkUpperLowerCase(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void hasNotCommonPassword_whenPassword_thenReturnTrue(){
        // GIVEN
        String password = "123456789";

        //WHEN
        boolean actual = ImplementMethods.checkWeakPassWord(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void hasSpecialCharactersCaseTest_whenPassword_thenReturnTrue(){
        // GIVEN
        String password = "12absABC";

        //WHEN
        boolean actual = ImplementMethods.checkSpecialCharacter(password);

          //THEN
         assertTrue(actual);
    }


}