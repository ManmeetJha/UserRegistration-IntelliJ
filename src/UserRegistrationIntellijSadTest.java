import org.junit.jupiter.api.Test;

class InvalidEntry extends Throwable{
    InvalidEntry(String entryName){
        System.out.println("Invalid " + entryName+" entered");
    }
}

class UserRegistrationIntellijSadTest {

    @Test
    void givenFirstName_whenProper_ShouldReturnFalse() throws InvalidEntry {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Fname("manmeet");
        try {
            if (result == false) {
                throw new InvalidEntry("first name");
            }
        }catch (InvalidEntry e){}
    }

    @Test
    void givenLastName_whenProper_ShouldReturnFalse() throws InvalidEntry {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Lname("jha");
        try {
            if (result == false) {
                throw new InvalidEntry("last name");
            }
        }catch (InvalidEntry e){}
    }

    @Test
    void givenEmail_whenProper_ShouldReturnFalse() throws InvalidEntry {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Email("manmeet.jha@gmailcom");
        try {
            if (result == false) {
                throw new InvalidEntry("e-mail");
            }
        }catch (InvalidEntry e){}
    }

    @Test
    void givenPhome_whenProper_ShouldReturnFalse() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Phnumber("178897139");
        try {
            if (result == false) {
                throw new InvalidEntry("Phone number");
            }
        }catch (InvalidEntry e){}
    }

    @Test
    void givenPass_whenProper_ShouldReturnFalse() {
        UserRegistrationIntellij validator = new UserRegistrationIntellij();
        boolean result = validator.Password("manmeet@123");
        try {
            if (result == false) {
                throw new InvalidEntry("Password");
            }
        }catch (InvalidEntry e){}
    }


}