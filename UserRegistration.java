public class UserRegistration {

	public String isvalidfirstname(String firstname) {
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		if (firstname.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
	}
	public String isvalidlastname(String lastname) {
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		if (lastname.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
	}
	public String isvalidemailid(String email) {
		String  regex = "^[a-zA-Z0-9]+([.][a-zA-Z0-9]*)?[@][a-zA-Z0-9]+[.][a-z]{2,}([.][a-zA-Z]{2,})?$";
		if (email.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
	}
    public String isvalidmobilenumber(String mobileno) {
		String  regex = "^[1-9]{2}(\\s)[6-9]{1}[0-9]{9}";
		if (mobileno.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
	}
    public String isvalidpassword(String password)
	{
		//Regex to check valid password
		String  regex = "[A-Za-z0-9](?=.*[-+_!@#$%^&*.,?]{1}).{8,}";
		if (password.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
	}
}