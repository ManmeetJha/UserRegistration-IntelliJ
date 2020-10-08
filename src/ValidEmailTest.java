import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    private final String emailTest;
    private final boolean expectedResult;

    public ValidEmailTest(String emailTest, boolean expectedResult) {
        this.emailTest = emailTest;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection input(){
    return Arrays.asList(new Object[][] {{"abc@yahoo.com",true},
        {"abc-100@yahoo.com",true},
        {"abc.100@yahoo.com",true},
        {"abc.111@abc.com",true},
        {"abc-100@abc.net",true},
        {"abc.100@abc.com.au",true},
        {"abc@1.com",true},
        {"abc@gmail.com.com",true},
        //{"abc+100@gmail.com",true},
        {"abc",false},
        {"abc@.com.my",false},
        //{"abc123@gmail.a",false},
        {"abc123@.com",false},
        {"abc123@.com.com",false},
        {".abc@abc.com",false},
        {"abc()*@gmail.com",false},
        {"abc@%*.com",false},
        {"abc..2002@gmail.com",false},
        {"abc.@gmail.com",false},
        {"abc@abc@gmail.com",false},
        //{"abc@gmail.com.1a",false},
        //{"abc@gmail.com.aa.au",false}
        }
        );
    }

    @Test
    public void givenEmail_whenValid_ShouldReturnTrue(){
        Assert.assertEquals(expectedResult, UserRegistrationIntellij.Email(emailTest));

    }
}
