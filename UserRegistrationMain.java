import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to User Registration Problem");
        UserValidations userValidations = new UserValidations();
        System.out.print("Enter the option: ");
        int option = scanner.nextInt();
       // userValidations.username();
       // userValidations.useremail();
        // userValidations.mobilenumber();
        //userValidations.userpassword();
        switch (option){
            case 1:
                userValidations.username();
            case 2:
                userValidations.useremail();
            case 3:
                userValidations.mobilenumber();
            case 4:
                userValidations.userpassword();
        }
    }
}
