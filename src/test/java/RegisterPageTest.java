import app.netlify.store.barca.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class RegisterPageTest extends TestMethods {

    //valid user account creation test

    // Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation Test")
    @Tag("Valid_User_Account_Creation")
    void validUserAccCreationTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
    }

    //invalid user account creation tests

    //no singular input

    // Test 002a -> invalid user account creation test - no display name
    @Test
    @DisplayName("Invalid User Account Creation Test - No Display Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidUserAccCreationNoDisplayNameTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no display name
        invalidUserAccountCreationNoDisplayNameTest();
    }

    // Test 002b -> invalid user account creation test - no email
    @Test
    @DisplayName("Invalid User Account Creation Test - No Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidUserAccCreationNoEmailTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no email
        invalidUserAccountCreationNoEmailTest();
    }

    // Test 002c -> invalid user account creation test - no password/confirm password
    @Test
    @DisplayName("Invalid User Account Creation Test - No Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidUserAccCreationNoPasswordTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no password/confirm password
        invalidUserAccountCreationNoPasswordTest();
    }

    //too short singular input

    // Test 002d -> invalid user account creation test - too short display name (3 chars) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Display Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccCreationTooShortDisplayNameTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short display name (3 chars)
        invalidUserAccountCreationTooShortDisplayNameTest();
    }

    // Test 002e -> invalid user account creation test - too short email (1 char -> name, domain) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccCreationTooShortEmailTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short email (1 char -> name, domain)
        invalidUserAccountCreationTooShortEmailTest();
    }

    // Test 002f -> invalid user account creation test - too short password/confirm password (5 chars)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccCreationTooShortPasswordTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short password/confirm password (4 chars)
        invalidUserAccountCreationTooShortPasswordTest();
    }

    //too long singular input

    // Test 002g -> invalid user account creation test - too long display name (201 chars) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long Display Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccCreationTooLongDisplayNameTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too long display name (201 chars)
        invalidUserAccountCreationTooLongDisplayNameTest();
    }

    // Test 002h -> invalid user account creation test - too long email (100 chars -> name, domain)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccCreationTooLongEmailTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too long email (100 chars -> name, domain)
        invalidUserAccountCreationTooLongEmailTest();
    }

    // Test 002i -> invalid user account creation test - too long password/confirm password (21 chars) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccCreationTooLongPasswordTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too long password/confirm password (21 chars)
        invalidUserAccountCreationTooLongPasswordTest();
    }

    //invalid singular input format

    // Test 002j -> invalid user account creation test - invalid display name input format (special symbols only) (the user account was created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid Display Name Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccCreationInvalidDisplayNameFormatTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - invalid display name input format (special symbols only)
        invalidUserAccountCreationInvalidDisplayNameFormatTest();
    }

    // Test 002k -> invalid user account creation test - invalid email input format (missing '@')
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid Email Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccCreationInvalidEmailFormatTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - invalid email input format (missing '@')
        invalidUserAccountCreationInvalidEmailFormatTest();
    }

    // Test 002l -> invalid user account creation test - existing email (used beforehand in manual testing)
    @Test
    @DisplayName("Invalid User Account Creation Test - Existing Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccCreationExistingEmailTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - existing email (used beforehand in manual testing)
        invalidUserAccountCreationExistingEmailFormatTest();
    }

    // Test 002m -> invalid user account creation test - mismatching confirm password
    @Test
    @DisplayName("Invalid User Account Creation Test - Mismatching Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccCreationMismatchingConfirmPasswordTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - mismatching confirm password
        invalidUserAccountCreationMismatchingConfirmPasswordTest();
    }

}