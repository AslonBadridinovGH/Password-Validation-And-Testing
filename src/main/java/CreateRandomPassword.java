import java.util.Random;

public class CreateRandomPassword {

    public static void main(String[] args) {

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


}
