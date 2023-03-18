import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	static Pattern firstName = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
	static Pattern lastName = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
	static Pattern email = Pattern.compile("^[a-zA-Z0-9]+([.][a-zA-Z0-9]*)?[@][a-zA-Z0-9]+[.][a-z]{2,}([.][a-zA-Z]{2,})?$");

	static Pattern mobileNumber = Pattern.compile("^[1-9]{2}(\\s)[6-9]{1}[0-9]{9}");

	static Pattern password = Pattern.compile("[A-Za-z0-9](?=.*[-+_!@#$%^&*.,?]{1}).{8,}");




	public boolean isvalidfirstname(String firstname) throws UserRegistrationException {
		try {
			Matcher matcher =firstName.matcher(firstname);
			return matcher.matches();
		}catch (NullPointerException e){
			throw new UserRegistrationException("Please enter valid first name");
		}
	}
	public boolean isvalidlastname(String lastname) throws UserRegistrationException {
		try {
			Matcher matcher =lastName.matcher(lastname);
			return matcher.matches();
		}catch (NullPointerException e){
			throw new UserRegistrationException("Please enter valid last name");
		}
	}
	public boolean isvalidemailid(String emails) throws UserRegistrationException {
		try {
			Matcher matcher =email.matcher(emails);
			return matcher.matches();
		}catch (NullPointerException e){
			throw new UserRegistrationException("Please enter valid email");
		}	}

    public boolean isvalidmobilenumber(String mobileno) throws UserRegistrationException {
		try {
			Matcher matcher =mobileNumber.matcher(mobileno);
			return matcher.matches();
		}catch (NullPointerException e){
			throw new UserRegistrationException("Please enter valid mobile number");
		}
	}
    public boolean isvalidpassword(String passwor) throws UserRegistrationException {
		try {
			Matcher matcher =password.matcher(passwor);
			return matcher.matches();
		}catch (NullPointerException e){
			throw new UserRegistrationException("Please enter valid password");
		}
	}
}