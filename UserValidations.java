import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidations {
    Scanner scanner = new Scanner(System.in);

    public void username() {
        System.out.println("Enter First Name");
        Pattern pattern = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
        String firstName = scanner.next();
        Matcher matcher = pattern.matcher(firstName);
        System.out.println("Enter Last Name");
        String lastName = scanner.next();
        Matcher matcher1 = pattern.matcher(lastName);
        if (matcher.matches()) {
            if (matcher1.matches())
                System.out.println("Valid Name");
        } else
            System.out.println("Invalid Name");

    }

    public void useremail() {
        String[] validemails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc11@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com",
                "abc@gmail.com.com", "abc+100@gmail.com"};
        String[] invalidemails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
                "abc123@gmail.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com",
                "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au",};
        for (String emails : validemails) {
            Pattern.matches("^[a-z+.]+@(.+)$",emails);
            System.out.println("Valid EmailId:");
        }
        for (String email : invalidemails) {
            Pattern.matches("^[a-z+.]+@(.+)$",email);
            System.out.println("Invalid EmailId");
        }
    }

    public void mobilenumber() {
        System.out.println("Enter Mobile Number");
        Pattern pattern = Pattern.compile("^[1-9]{2}(\\s)[6-9]{1}[0-9]{9}");
        String mobile = scanner.next();
        Matcher matcher = pattern.matcher(mobile);
        if (matcher.matches()) {
            System.out.println("Valid Mobile number");
        } else
            System.out.println("Invalid Mobile number");

    }

    public void userpassword() {
        System.out.println("Enter password");
        Pattern pattern = Pattern.compile("[A-Za-z0-9](?=.*[-+_!@#$%^&*.,?]{1}).{8,}");
        String password = scanner.next();
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid password");
        } else
            System.out.println("Invalid password");

    }

}
