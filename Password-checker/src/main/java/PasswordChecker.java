import java.util.regex.*;
import java.util.Scanner;
class PasswordChecker {
    static String passwordIsValid(String password) {
        boolean DoesNotHaveSpecialCharacter = Pattern.matches("[a-zA-Z0-9]*", password);
        boolean hasNumericValue = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        String results;
        for (int i = 0; i < password.length(); i++) {
            char charInPassword = password.charAt(i);
            if (Character.isDigit(charInPassword)) {
                hasNumericValue = true;
            }
            if (Character.isUpperCase(charInPassword)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(charInPassword)) {
                hasLowerCase = true;
            }
        }
        if(password.length() == 0){
            results = "password should exist";
        } else if (password.length() <= 8) {
            results = "password should be longer than 8 characters";
        } else if (!hasLowerCase) {
            results = "password should have at least one lowercase letter";
        } else if (!hasUpperCase) {
            results = "password should have at least one uppercase letter";
        } else if (!hasNumericValue) {
            results = "password should at least have one digit";
        } else if (DoesNotHaveSpecialCharacter) {
            results = "password should have at least one special character";
        } else {
            results = "Password successfully set!!";
        }
        return results;
    }
    static Boolean passwordIsOk(String password) {
        boolean DoesNotHaveSpecialCharacter = Pattern.matches("[a-zA-Z0-9]*", password);
        boolean hasNumericValue = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        for (int i = 0; i < password.length(); i++) {
            char charInPassword = password.charAt(i);
            if (Character.isDigit(charInPassword)) {
                hasNumericValue = true;
            }
            if (Character.isUpperCase(charInPassword)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(charInPassword)) {
                hasLowerCase = true;
            }
        }
        boolean[] conditions = {password.length() > 8, password.length() != 0,!DoesNotHaveSpecialCharacter, hasNumericValue, hasUpperCase, hasLowerCase};
        int metConditions = 0;
        boolean result = false;
        //Checking if password meets condition 1 and 2
        if(password.length()<=8){
            return false;
        }else {
            for (boolean a : conditions) {
                if (a) {
                    metConditions++;
                }
            }
            if (metConditions >= 3) {
                result = true;
            }
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Set your password: ");
        String password = Obj.nextLine();
        System.out.println("Password is ok?: " +PasswordChecker.passwordIsOk(password));
        System.out.println(PasswordChecker.passwordIsValid(password));
    }
}
