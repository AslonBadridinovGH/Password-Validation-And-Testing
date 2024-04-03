public class ImplementMethods {

    public static boolean passwordLengthTest(String s) {

        if (s.length()>=8){
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkDigit(String s){

        for (int i = 0; i < s.length(); i++) {

            char oneChar = s.charAt(i);

            if(oneChar>=48 && oneChar<=57){
                return true;
            }
        }
        return false;
    }

    public static boolean checkUpperLowerCase(String s){

        int a=0;
        int b=0;

        for (int i = 0; i < s.length(); i++) {

            char oneChar = s.charAt(i);

            if (oneChar>= 65 && oneChar<=90) {
                a++;
            } else if(oneChar>= 97 && oneChar<=122) {
                b++;
            }
        }

           return ( a>0 && b>0);
       }

    public static boolean checkWeakPassWord(String s){

        String [] array = {"123456", "12345.","password", "usr","12345678", "qwerty"};

        for (String string : array) {

            if (s.contains(string)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkSpecialCharacter(String password) {

        for (int i = password.length() - 1; i >= 0; i--) {

            char oneChar = password.charAt(i);
            String s = String.valueOf(oneChar);

            return ( (! checkUpperLowerCase(s)) && (!checkDigit(s)) );
        }

        return false;
    }
}
