import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String firstname = userRegistration.isvalidfirstname("Shraddha");
        Assert.assertEquals("HAPPY", firstname);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnSad()
    {
        UserRegistration userRegistration = new UserRegistration();
        String firstname = userRegistration.isvalidfirstname("shr");
        Assert.assertEquals("SAD", firstname);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy()
    {
        UserRegistration userRegistration = new UserRegistration();
        String lastname = userRegistration.isvalidlastname("Sarode");
        Assert.assertEquals("HAPPY", lastname);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnSad()
    {
        UserRegistration userRegistration = new UserRegistration();
        String lastname = userRegistration.isvalidlastname("sar");
        Assert.assertEquals("SAD", lastname);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnHappy()
    {
        UserRegistration userRegistration = new UserRegistration();
        String emailId = userRegistration.isvalidemailid("shraddha11@gmail.com");
        Assert.assertEquals("HAPPY", emailId);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnSad()
    {
        UserRegistration userRegistration = new UserRegistration();
        String emailId = userRegistration.isvalidemailid(".ss09@gmail.com");
        Assert.assertEquals("SAD", emailId);
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldReturnHappy()
    {
        UserRegistration userRegistration = new UserRegistration();
        String mobileNo = userRegistration.isvalidmobilenumber("91 7000468289");
        Assert.assertEquals("HAPPY", mobileNo);
    }

    @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnSad()
    {
        UserRegistration userRegistration = new UserRegistration();
        String mobileNo = userRegistration.isvalidmobilenumber("917000468289");
        Assert.assertEquals("SAD", mobileNo);
    }

    @Test
    public void givenPassword_WithAllRules_ThenReturnHappy()
    {
        UserRegistration userRegistration = new UserRegistration();
        String password = userRegistration.isvalidpassword("Mok@2019");
        Assert.assertEquals("HAPPY", password);
    }

    @Test
    public void givenPassword_WithoutAnyRules_ThenReturnHappy()
    {
        UserRegistration userRegistration = new UserRegistration();
        String password = userRegistration.isvalidpassword("mok5@");
        Assert.assertEquals("SAD", password);
    }

}


