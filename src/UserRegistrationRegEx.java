import java.util.Scanner;
import java.util.regex.*;

/**
 * Using regex to validate First name,Last name,email,PhoneNumber and Password
 *  
 * @author ppmoh
 *
 */

public class UserRegistrationRegEx {
static Scanner scanner = new Scanner(System.in);

public static void main (String args[])
{
	PhoneNumberValidate();
	firstNameValidate();
    lastNameValidate();
    emailValidate();
    passwordValidate();
}
/**
 * First name must start with capital letter and has minmum 3 length
 */
private static void firstNameValidate() 
{
	System.out.print("Enter first name: ");
	String firstname = scanner.next();
	 System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstname));
	
}

/**
 * Last name must start with Capital letter and has minimum 3 length
 */
private static void lastNameValidate()
{
	
	  System.out.print("Enter last name : ");
      String lastName = scanner.next();
      System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));	
}

/**
 * Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
 * Enter a valid email - E.g. abc.xyz@bl.co.in
 */

private static void emailValidate() 
{
	 String email = "abc.xyz@bl.co.in";
     System.out.println("Email : " + email);
     System.out.println(Pattern.matches("^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$", email));
	
}

/**
 * Phone number starts with 2 digit country code followed by space and 10 digit number
 * 
 */

private static void PhoneNumberValidate() 
{
	  System.out.println("Enter Phonenumber. : ");
      String phNum = scanner.nextLine();
      System.out.println(Pattern.matches("[0-9]{2}[\s][0-9]{10}", phNum));
	
}

/**
 * Password contains minimum 8 characters, atleast 1 capital Letter, atleast 1 small Letter, atleast 1 numeric value and exact one Special character( like !@#$%^&+= )
 */


	private static void passwordValidate()
	{

     System.out.print("Enter password : ");
	 String password = scanner.next();
	 System.out.println(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$", password));
	
}
	

	}


