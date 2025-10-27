import app.netlify.store.barca.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class LoginPageTest extends TestMethods{

    //valid user login test

    // Test 003 -> valid user login test
    @Test
    @DisplayName("Valid User Login Test")
    @Tag("Valid_User_Login")
    void validUserAccLoginTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user login test
        validUserLoginTest();
    }

    //invalid user login tests

    //no singular input

    // Test 003a -> invalid user login test - no login email
    @Test
    @DisplayName("Invalid User Login Test - No Login Email")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidUserAccLoginNoEmailTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user login test - no login email
        invalidUserLoginNoEmailTest();
    }

    // Test 003b -> invalid user login test - no login password
    @Test
    @DisplayName("Invalid User Login Test - No Login Password")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidUserAccLoginNoPasswordTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user login test - no login password
        invalidUserLoginNoPasswordTest();
    }

    //invalid singular input

    // Test 003c -> invalid user login test - invalid login email
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Email")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccLoginInvalidEmailTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user login test - invalid login email
        invalidUserLoginInvalidEmailTest();
    }

    // Test 003d -> invalid user login test - invalid login email format (missing '@')
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Email")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccLoginInvalidEmailFormatTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user login test - invalid login email format (missing '@')
        invalidUserLoginInvalidEmailFormatTest();
    }

    // Test 003e -> invalid user login test - invalid login password
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Password")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccLoginInvalidPasswordTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user login test - invalid login password
        invalidUserLoginInvalidPasswordTest();
    }

    //valid user logout test

    // Test 004 -> valid user logout test
    @Test
    @DisplayName("Valid User Logout Test")
    @Tag("Valid_User_Logout")
    void validUserAccLogoutTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user login test
        validUserLoginTest();
        //valid user logout test
        validUserLogoutTest();
    }

}