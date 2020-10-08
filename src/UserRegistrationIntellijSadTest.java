import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationIntellijSadTest {

    @Test
    void givenFirstName_whenProper_ShouldReturnFalse() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Fname("manmeet");
        short expected;
        assertEquals(false, result);
    }

    @Test
    void givenLastName_whenProper_ShouldReturnFalse() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Lname("jha");
        short expected;
        assertEquals(false, result);
    }

    @Test
    void givenEmail_whenProper_ShouldReturnFalse() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Email("manmeet.jha@gmailcom");
        short expected;
        assertEquals(false, result);
    }

    @Test
    void givenPhome_whenProper_ShouldReturnFalse() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Phnumber("178897139");
        short expected;
        assertEquals(false, result);
    }

    @Test
    void givenPass_whenProper_ShouldReturnFalse() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Password("manmeet@123");
        short expected;
        assertEquals(false, result);
    }


}