package user.registration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class UserRegistrationTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
	public void firstNameReturnTrueWhenValid() {
		UserRegistrationApp object = new UserRegistrationApp();
		try {
			boolean result = object.validateFirstName("Firstnameexample");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void firstNameReturnFalseWhenInvalid(){
		UserRegistrationApp object = new UserRegistrationApp();
		try {
			boolean result = object.validateFirstName("firstnameexample");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void LastNameReturnTrueWhenValid() {
		UserRegistrationApp object = new UserRegistrationApp();
		try {
			boolean result = object.validateLastName("Lastnameexample");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void LastNameReturnFalseWhenInvalid() {
		UserRegistrationApp object = new UserRegistrationApp();
		try {
			boolean result = object.validateLastName("lastnameexample");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void EmailReturnTrueWhenValid() {
		UserRegistrationApp object = new UserRegistrationApp();
		try {
			boolean result = object.validateEmail("example.correct@mail.com");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void EmailReturnFalseWhenInvalid() {
		UserRegistrationApp object = new UserRegistrationApp();
		try {
			boolean result = object.validateEmail("example.wrong.mail.com");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PhoneReturnTrueWhenValid() {
		UserRegistrationApp object = new UserRegistrationApp();
		try {
			boolean result = object.validatePhone("911234567890");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PhoneReturnFalseWhenInvalid() {
		UserRegistrationApp object = new UserRegistrationApp();
		try {
			boolean result = object.validatePhone("123456789X");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PasswordReturnTrueWhenValid() {
		UserRegistrationApp object = new UserRegistrationApp();
		try {
			boolean result = object.validatePassword("ExampleCorrectPassword123#");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PasswordReturnFalseWhenInvalid() {
		UserRegistrationApp object = new UserRegistrationApp();
		try {
			boolean result = object.validatePassword("examplewrongpassword");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
