import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UserRegistrationLambda {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("User Registration");
        List<String> Array = new ArrayList<String>();

        //First_name_verification
        System.out.println("Enter four first name");
        for (int i = 0; i < 4; i++)
        {
            String name = input.next();
            Array.add(name);
        }
        Pattern pattern_Fname = Pattern.compile("^[A-Z](?:[a-zA-Z]+){2}$");
        List<String> result_Fname = Array.stream().filter(pattern_Fname.asPredicate()).collect(Collectors.<String>toList());
        System.out.println("Verified First names are:");
        result_Fname.forEach(System.out::println);

        //Last_name_verification
        System.out.println("Enter four Last name");
        for (int i = 0; i < 4; i++)
        {
            String name = input.next();
            Array.add(name);
        }
        Pattern pattern_Lname = Pattern.compile("^[A-Z](?:[a-zA-Z]+){2}$");
        List<String> result_Lname = Array.stream().filter(pattern_Lname.asPredicate()).collect(Collectors.<String>toList());
        System.out.println("Verified Last names are:");
        result_Lname.forEach(System.out::println);

        //Email_ID
        System.out.println("Enter four E-mail");
        for (int i = 0; i < 4; i++)
        {
            String mail = input.next();
            Array.add(mail);
        }
        Pattern pattern_email = Pattern.compile("^[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+$");
        List<String> result_Email = Array.stream().filter(pattern_email.asPredicate()).collect(Collectors.<String>toList());
        System.out.println("Verified Last names are:");
        result_Email.forEach(System.out::println);

        //Phone_no
        System.out.println("Enter four Phone numbers");
        for (int i = 0; i < 4; i++)
        {
            String p_no = input.next();
            Array.add(p_no);
        }
        Pattern pattern_pno = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        List<String> result_pno = Array.stream().filter(pattern_pno.asPredicate()).collect(Collectors.<String>toList());
        System.out.println("Verified Last names are:");
        result_pno.forEach(System.out::println);

        //PassWord
        System.out.println("Enter four Paaswords");
        for (int i = 0; i < 4; i++)
        {
            String pwd = input.next();
            Array.add(pwd);
        }
        Pattern pattern_pwd = Pattern.compile("^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?!.[<>`])"+"(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)");
        List<String> result_pwd = Array.stream().filter(pattern_pwd.asPredicate()).collect(Collectors.<String>toList());
        System.out.println("Verified Last names are:");
        result_pwd.forEach(System.out::println);
    }
}
