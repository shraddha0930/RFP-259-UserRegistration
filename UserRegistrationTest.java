import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationTest {

    @Test
    public void  givenInvalidFirstName_ShouldThrowException(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            result = userRegistration.isvalidfirstname(null);
            Assert.assertEquals(false,result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    /*@Test
    public void givenFirstName_WhenNotProper_ShouldReturnSad()
    {
        UserRegistration userRegistration = new UserRegistration();
        String firstname = userRegistration.isvalidfirstname("shr");
        Assert.assertEquals("SAD", firstname);
    }*/

    @Test
    public void givenInvalidLastName_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            result = userRegistration.isvalidlastname(null);
            Assert.assertEquals(false,result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    /*@Test
    public void givenLastName_WhenNotProper_ShouldReturnSad()
    {
        UserRegistration userRegistration = new UserRegistration();
        String lastname = userRegistration.isvalidlastname("sar");
        Assert.assertEquals("SAD", lastname);
    }*/

    @Test
    public void givenInvalidEmailId_ShouldThrowException()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            result = userRegistration.isvalidemailid(null);
            Assert.assertEquals(false,result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    /*@Test
    public void givenEmailId_WhenNotProper_ShouldReturnSad()
    {
        UserRegistration userRegistration = new UserRegistration();
        String emailId = userRegistration.isvalidemailid(".ss09@gmail.com");
        Assert.assertEquals("SAD", emailId);
    }*/

    @Test
    public void givenInvalidMobileNumber_ShouldThrowException()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            result = userRegistration.isvalidmobilenumber(null);
            Assert.assertEquals(false,result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

   /* @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnSad()
    {
        UserRegistration userRegistration = new UserRegistration();
        String mobileNo = userRegistration.isvalidmobilenumber("917000468289");
        Assert.assertEquals("SAD", mobileNo);
    }*/

    @Test
    public void givenInvalidPassword_ShouldThrowException()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            result = userRegistration.isvalidpassword(null);
            Assert.assertEquals(false,result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    /*@Test
    public void givenPassword_WithoutAnyRules_ThenReturnHappy()
    {
        UserRegistration userRegistration = new UserRegistration();
        String password = userRegistration.isvalidpassword("mok5@");
        Assert.assertEquals("SAD", password);
    }*/

}