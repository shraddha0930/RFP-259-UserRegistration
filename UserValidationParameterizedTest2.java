import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserValidationParameterizedTest2 {
    String emailId ;

    UserRegistration userRegistration;

    public UserValidationParameterizedTest2(String emailId) {
        super();
        this.emailId = emailId;

    }

    @Before
    public void initialize(){
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new String[] {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc11@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com",
                "abc@gmail.com.com", "abc+100@gmail.com"} );
    }

    @Test
    public void givenMultipleEmailId_WhenProper_ShouldReturnTrue(){
        System.out.println();
        Assert.assertEquals(true,userRegistration.isvalidemailid(emailId));
    }
}