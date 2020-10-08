import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationIntellij {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("User Registration");
        System.out.println("Enter the first name");
        String name = input.next();
        if(Fname(name)==true)
            System.out.println("Verified first name");
        System.out.println("Enter the last name");
        String lname = input.next();
        if(Lname(name)==true)
            System.out.println("Verified last name");
        System.out.println("Enter valid e-mail ID");
        String email = input.next();
        if(Email(email)==true)
            System.out.println("Verified e-mail");
        System.out.println("Enter valid Phone number");
        String phone = input.next();
        if(Phnumber(phone)==true)
            System.out.println("Verified phone number");
        System.out.println("Enter valid Password");
        String pass=input.next();
        if(Password(pass)==true)
            System.out.println("Verified password");
    }
        // UC1
        public static boolean Fname(String name){
        return (Pattern.matches("^[A-Z](?:[a-zA-Z]+){2}$", name));
        }

        // UC2
        public static boolean Lname(String lname){
        return (Pattern.matches("^[A-Z](?:[a-zA-Z]+){2}$", lname));}

        // UC3
        public static boolean Email(String email){
        return(Pattern.matches("^[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+$", email));}

        // UC4
        public static boolean Phnumber(String phone){
        return(Pattern.matches("(0|91)?[7-9][0-9]{9}", phone));}

        //UC5-UC8
        public static boolean Password(String pass){
        return(Pattern.matches("^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?!.[<>`])"+"(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)"+".{8,}$",pass));}
}
