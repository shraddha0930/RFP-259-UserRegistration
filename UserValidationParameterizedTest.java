import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserValidationParameterizedTest {

    String emailId;

    UserRegistration userRegistration;


    public UserValidationParameterizedTest(String emailId) {
        super();
        this.emailId = emailId;

    }

    @Before
    public void initialize(){
        userRegistration = new UserRegistration();
    }



    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new  String[] {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
                "abc123@gmail.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com",
                "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"} );
    }
    @Test
    public void givenMultipleEmailId_WhenNotProper_ShouldReturnFalse(){

        Assert.assertEquals(false,userRegistration.isvalidemailid(emailId));
    }

}
