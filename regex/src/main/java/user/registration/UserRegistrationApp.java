package user.registration;
import java.util.function.Predicate;
import java.util.Scanner;

import user.UserRegistrationException;
/**
 * Hello world!
 */
public final class UserRegistrationApp {

    public static final Scanner sc = new Scanner(System.in);
	public static String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	public static String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	public static String EMAIL_PATTERN = "[a-z0-9_+-]*(.[a-z0-9_+-]*?)@[a-z0-9]*.[a-z]*[a-z]*?$";
	public static String PHONE_PATTERN = "^[0-9]{2}[0-9]{10}$";
	public static String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";

	// This method checks if the entered first name is valid
	public boolean validateFirstName(String fname) throws UserRegistrationException {
		//		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		//		boolean result = pattern.matcher(fname).matches();
		Predicate<String> validateFirstName1 = n -> n.matches(FIRST_NAME_PATTERN);
		boolean result = validateFirstName1.test(fname);

		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}

	}

	// This method checks if the entered lawst name is valid
	public boolean validateLastName(String lname) throws UserRegistrationException {
		//		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		//		boolean result = pattern.matcher(lname).matches();
		Predicate<String> validateLast = n -> n.matches(LAST_NAME_PATTERN);
		boolean result = validateLast.test(lname);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	// This method checks if the entered email is valid
	public boolean validateEmail(String email) throws UserRegistrationException {
		//		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		//		boolean result = pattern.matcher(email).matches();
		Predicate<String> validateEmail = n -> n.matches(EMAIL_PATTERN);
		boolean result = validateEmail.test(email);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	// This method checks if the entered phone number is valid
	public boolean validatePhone(String phone) throws UserRegistrationException {
		//		Pattern pattern = Pattern.compile(PHONE_PATTERN);
		//		boolean result = pattern.matcher(phone).matches();
		Predicate<String> validatePhone = n -> n.matches(PHONE_PATTERN);
		boolean result = validatePhone.test(phone);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	// This method checks if the entered password is valid
	public boolean validatePassword(String password) throws UserRegistrationException{
		//		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		//		boolean result = pattern.matcher(password).matches();
		Predicate<String> validateFirstName1 = n -> n.matches(PASSWORD_PATTERN);
		boolean result = validateFirstName1.test(password);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

		
		UserRegistrationApp obj = new UserRegistrationApp();
		System.out.println("Enter First Name: ");
		String fname = sc.next();
		sc.nextLine();

		try{
			obj.validateFirstName(fname);
		}
		catch(UserRegistrationException uxe){
			uxe.printStackTrace();
		}

		System.out.println("\nEnter Last Name: ");
		String lname = sc.next();
		try{
			obj.validateFirstName(lname);
		}
		catch(UserRegistrationException uxe){
			uxe.printStackTrace();
		}

		System.out.println("\nEnter Email: ");
		sc.nextLine();
		String email = sc.next();
		try{
			obj.validateEmail(email);
		}
		catch(UserRegistrationException uxe){
			uxe.printStackTrace();
		}

		System.out.println("\nEnter Phone No with Country Code: ");
		String phone = sc.next();
		try{
			obj.validatePhone(phone);
		}
		catch(UserRegistrationException uxe){
			uxe.printStackTrace();
		}

		System.out.println(
				"\nEnter Password (Min 8 characters with Atleast 1 Uppercase, 1 Numeric Digit, 1 Special Character): ");
		String password = sc.next();
		try{
			obj.validatePassword(password);
		}
		catch(UserRegistrationException uxe){
			uxe.printStackTrace();
		}

		System.out.println("\nSamples Emails to Test");

		try{
			obj.validateEmail("abc@yahoo.com");
			obj.validateEmail("abc-100@yahoo.com");
			obj.validateEmail("abc.100@yahoo.com");
			obj.validateEmail("abc111@abc.com");
			obj.validateEmail("abc-100@abc.net");
			obj.validateEmail("abc.100@abc.com.au");
			obj.validateEmail("abc@1.com");
			obj.validateEmail("abc@gmail.com.com");
			obj.validateEmail("abc+100@gmail.com");
		}
		catch(UserRegistrationException uxe){
			uxe.printStackTrace();
		}
    }
}
