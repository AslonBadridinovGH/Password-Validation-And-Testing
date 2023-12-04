import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordTest {

    @Test
    public void hasMinLength8Test_whenPassword_thenReturnTrue(){

        // GIVEN
        String password = "12345678";

        //WHEN
        boolean actual = PasswordC.passwordTest(password);

        //THEN
        assertTrue(actual);
    }


    @Test
    public void hasDigitTest_whenPassword_thenReturnTrue(){

        // GIVEN
        String password = "123456789";

        //WHEN
        boolean actual = PasswordC.checkDigit(password);

        //THEN
        assertTrue(actual);
    }
    @Test
    public void hasMixedLettersCaseTest_whenPassword_thenReturnTrue(){
        // GIVEN
        String password = "12absABC";

        //WHEN
        boolean actual = PasswordC.checkUpperLowerCase(password);

        //THEN
        assertTrue(actual);
    }
    @Test
    public void hasNotCommonPassword_whenPassword_thenReturnTrue(){
        // GIVEN
        String password = "123456789";

        //WHEN
        boolean actual = PasswordC.checkWeakPassWord(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void hasSpecialCharactersCaseTest_whenPassword_thenReturnTrue(){
        // GIVEN
        String password = "12absABC";

        //WHEN
        boolean actual = PasswordC.checkSpecialCharacter(password);

          //THEN
         assertTrue(actual);
    }

    public static void main(String[] args) {

      //       public static String randomPassword(){

            String upperC= "ABCDEFGHIJKLMNOPQSRTUWXYZ";
            String lowerC= "abcdefghijklmnopqrsuvxyz";
            String num= "123456789";
            String specialChars = ",.--___ä#+´ß0)(///&&&<:;-%$$";

            String mixed = upperC+lowerC+num+specialChars;
            Random random = new Random();

            char [] chars = new char[8];
            for (int i = 0; i < chars.length ; i++) {
                chars[i] = mixed.charAt(random.nextInt(mixed.length()));
            }
             System.out.println(chars);
        }

//  }

}