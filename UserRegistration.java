import java.util.regex.Pattern;

public class UserRegistration {

	public String isvalidfirstname(String firstname) {
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		if (firstname.matches(regex))
            return "HAPPY";
        else
            return "SAD";
	}
	public String isvalidlastname(String lastname) {
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		if (lastname.matches(regex))
            return "HAPPY";
        else
            return "SAD";
	}
	public boolean isvalidemailid(String email) {
		String  regex = "^[a-z+.]+@(.+)$";
		return Pattern.matches(regex, email);
	}

    public String isvalidmobilenumber(String mobileno) {
		String  regex = "^[1-9]{2}(\\s)[6-9]{1}[0-9]{9}";
		if (mobileno.matches(regex))
            return "HAPPY";
        else
            return "SAD";
	}
    public String isvalidpassword(String password)
	{
		//Regex to check valid password
		String  regex = "[A-Za-z0-9](?=.*[-+_!@#$%^&*.,?]{1}).{8,}";
		if (password.matches(regex))
            return "HAPPY";
        else
            return "SAD";
	}
}