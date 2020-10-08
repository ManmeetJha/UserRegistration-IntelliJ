import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationIntellijHappyTest {

    @Test
    void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Fname("Manmeet");
        short expected;
        assertEquals(true, result);
    }

    @Test
    void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Lname("Jha");
        short expected;
        assertEquals(true, result);
    }

    @Test
    void givenEmail_whenProper_ShouldReturnTrue() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Email("manmeet.jha@gmail.com");
        short expected;
        assertEquals(true, result);
    }

    @Test
    void givenPhome_whenProper_ShouldReturnTrue() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Phnumber("918178897139");
        short expected;
        assertEquals(true, result);
    }

    @Test
    void givenPass_whenProper_ShouldReturnTrue() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Password("Manmeet@123");
        short expected;
        assertEquals(true, result);
    }


}