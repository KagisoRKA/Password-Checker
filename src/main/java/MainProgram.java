import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.println("Set your password: ");
        String password = Obj.nextLine();
        try {
            System.out.println(PasswordChecker.passwordIsValid(password));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Password is ok?: " + PasswordChecker.passwordIsOk(password));
    }
}