import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidations {
    static Scanner scanner = new Scanner(System.in);
    public static void UserName() {
        System.out.println("Enter First Name");
        Pattern pattern = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}");
        String firstName = scanner.next();
        Matcher matcher = pattern.matcher(firstName);
        if(matcher.matches()){
            System.out.println("Valid Name");
        }else
            System.out.println("Invalid Name");

    }

}
