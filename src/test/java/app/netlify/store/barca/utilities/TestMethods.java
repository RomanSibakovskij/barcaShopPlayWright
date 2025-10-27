package app.netlify.store.barca.utilities;

import app.netlify.store.barca.*;


import app.netlify.store.barca.login.page.invalid.scenarios.LoginPageInvalidSingularInput;
import app.netlify.store.barca.modules.ShoppingCartModal;
import app.netlify.store.barca.page.data.loggers.PageDataLoggers;
import app.netlify.store.barca.page.text.element.assertion.PageTextElementAsserts;
import app.netlify.store.barca.page.web.element.assertion.PageWebElementAsserts;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Paths;
import java.util.*;

import app.netlify.store.barca.register.page.invalid.scenarios.RegisterPageInvalidSingularInput;
import com.microsoft.playwright.Page;

public class TestMethods extends BaseTest implements PageWebElementAsserts, PageTextElementAsserts, PageDataLoggers {

    //navigate to sign up page test method
    protected void navigateToRegisterPageTest(){
        GeneralPage generalPage = new GeneralPage(page);
        LoginPage loginPage = new LoginPage(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //click header "Sign In" link
        generalPage.clickHeaderSignInLink();
        //assert the user gets onto login page
        String expectedLoginURL = "https://barca-stores.netlify.app/login";
        String actualLoginURL = page.url();
        assertEquals(expectedLoginURL, actualLoginURL, "The expected/actual login page URLs don't match expectations.");
        //login page web element assert
        isLoginPageWebElementVisible(page);
        //login page text element assert
        isLoginPageTextElementAsExpected(page);
        //capture screenshot of the login page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display.png")).setFullPage(true));
        //click "Sign up" link
        loginPage.clickSignUpLink();
        //assert the user gets onto register page
        String expectedRegisterURL = "https://barca-stores.netlify.app/register";
        String actualRegisterURL = page.url();
        assertEquals(expectedRegisterURL, actualRegisterURL, "The expected/actual register page URLs don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Navigate To Register Page Test Result.png")).setFullPage(true));
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user account creation test

    //valid user account creation test method
    protected void validUserAccountCreationTest(){
        RegisterPage registerPage = new RegisterPage(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //valid user register input data getter
        registerPage.validRegisterInputDataGetter();
        //input valid display name into display name input field
        registerPage.inputDisplayNameIntoDisplayNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Valid Data Input.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for login page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user gets onto login page (since the user doesn't get any confirmation message)
        String expectedLoginURL = "https://barca-stores.netlify.app/login";
        String actualLoginURL = page.url();
        assertEquals(expectedLoginURL, actualLoginURL, "The expected/actual login page URLs don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Valid User Account Creation Test Result.png")).setFullPage(true));
    }

    //invalid user account creation tests

    //no singular input

    //invalid user account creation test method - no display name
    protected void invalidUserAccountCreationNoDisplayNameTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - no display name
        registerPageInvalidSingularInput.invalidRegisterInputDataNoDisplayNameGetter();
        //don't input display name into display name input field
        registerPageInvalidSingularInput.inputNoDisplayNameIntoDisplayNameInputField();
        //input valid email into email input field
        registerPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        registerPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - no display name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - No Display Name.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for react error to load
        page.waitForTimeout(800);
        //assert the user stays on register page (since the user doesn't get any errors, only react based)
        String expectedRegisterURL = "https://barca-stores.netlify.app/register";
        String actualRegisterURL = page.url();
        assertEquals(expectedRegisterURL, actualRegisterURL, "The user was able to create an account without display name, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - No Display Name.png")).setFullPage(true));
    }

    //invalid user account creation test method - no email
    protected void invalidUserAccountCreationNoEmailTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - no email
        registerPageInvalidSingularInput.invalidRegisterInputDataNoEmailGetter();
        //input valid display name into display name input field
        registerPageInvalidSingularInput.inputDisplayNameIntoDisplayNameInputField();
        //don't input email into email input field
        registerPageInvalidSingularInput.inputNoEmailIntoEmailInputField();
        //input valid password into password input field
        registerPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        registerPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - no email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - No Email.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for react error to load
        page.waitForTimeout(800);
        //assert the user stays on register page (since the user doesn't get any errors, only react based)
        String expectedRegisterURL = "https://barca-stores.netlify.app/register";
        String actualRegisterURL = page.url();
        assertEquals(expectedRegisterURL, actualRegisterURL, "The user was able to create an account without email, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - No Email.png")).setFullPage(true));
    }

    //invalid user account creation test method - no password/confirm password
    protected void invalidUserAccountCreationNoPasswordTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - no password/confirm password
        registerPageInvalidSingularInput.invalidRegisterInputDataNoPasswordGetter();
        //input valid display name into display name input field
        registerPageInvalidSingularInput.inputDisplayNameIntoDisplayNameInputField();
        //input valid email into email input field
        registerPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //don't input password into password input field
        registerPageInvalidSingularInput.inputNoPasswordIntoPasswordInputField();
        //capture screenshot of the register page display after invalid data input - no password/confirm password
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - No Password And Confirm Password.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for react error to load
        page.waitForTimeout(800);
        //assert the user stays on register page (since the user doesn't get any errors, only react based)
        String expectedRegisterURL = "https://barca-stores.netlify.app/register";
        String actualRegisterURL = page.url();
        assertEquals(expectedRegisterURL, actualRegisterURL, "The user was able to create an account without password, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - No Password And Confirm Password.png")).setFullPage(true));
    }

    //too short singular input

    //invalid user account creation test method - too short display name (3 chars)
    protected void invalidUserAccountCreationTooShortDisplayNameTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - too short display name (3 chars)
        registerPageInvalidSingularInput.invalidRegisterInputDataTooShortDisplayNameGetter();
        //input too short display name into display name input field (3 chars)
        registerPageInvalidSingularInput.inputTooShortDisplayNameIntoDisplayNameInputField();
        //input valid email into email input field
        registerPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        registerPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - too short display name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - Too Short Display Name.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user stays on register page (since the user doesn't get any errors, only react based)
        String expectedRegisterURL = "https://barca-stores.netlify.app/register";
        String actualRegisterURL = page.url();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Short Display Name.png")).setFullPage(true));
        assertEquals(expectedRegisterURL, actualRegisterURL, "The user was able to create an account with too short display name, test has failed.");
    }

    //invalid user account creation test method - too short email (1 char -> name, domain)
    protected void invalidUserAccountCreationTooShortEmailTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - too short email (1 char -> name, domain)
        registerPageInvalidSingularInput.invalidRegisterInputDataTooShortEmailGetter();
        //input valid display name into display name input field
        registerPageInvalidSingularInput.inputDisplayNameIntoDisplayNameInputField();
        //input too short email into email input field (1 char -> name, domain)
        registerPageInvalidSingularInput.inputTooShortEmailIntoEmailInputField();
        //input valid password into password input field
        registerPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        registerPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - too short email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - Too Short Email.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user stays on register page (since the user doesn't get any errors, only react based)
        String expectedRegisterURL = "https://barca-stores.netlify.app/register";
        String actualRegisterURL = page.url();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Short Email.png")).setFullPage(true));
        assertEquals(expectedRegisterURL, actualRegisterURL, "The user was able to create an account with too short email, test has failed.");
    }

    //invalid user account creation test method - too short password/confirm password (5 chars)
    protected void invalidUserAccountCreationTooShortPasswordTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - too short password/confirm password (5 chars)
        registerPageInvalidSingularInput.invalidRegisterInputDataTooShortPasswordGetter();
        //input valid display name into display name input field
        registerPageInvalidSingularInput.inputDisplayNameIntoDisplayNameInputField();
        //input valid email into email input field
        registerPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input too short password into password input field (4 chars)
        registerPageInvalidSingularInput.inputTooShortPasswordIntoPasswordInputField();
        //input too short matching confirm password into confirm password input field (5 chars)
        registerPageInvalidSingularInput.inputTooShortConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - too short password/confirm password
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - Too Short Password And Confirm Password.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for error to load
        page.waitForTimeout(2000);
        //assert the user gets an expected error
        String tooShortPasswordInputError = registerPage.getRegisterPageSingularInputError();
        assertEquals("Firebase: Password should be at least 6 characters (auth/weak-password).", tooShortPasswordInputError, "The user was able to create an account with too short password/confirm password, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Short Password And Confirm Password.png")).setFullPage(true));
    }

    //too long singular input

    //invalid user account creation test method - too long display name (201 chars)
    protected void invalidUserAccountCreationTooLongDisplayNameTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - too long display name (201 chars)
        registerPageInvalidSingularInput.invalidRegisterInputDataTooLongDisplayNameGetter();
        //input too long display name into display name input field (201 chars)
        registerPageInvalidSingularInput.inputTooLongDisplayNameIntoDisplayNameInputField();
        //input valid email into email input field
        registerPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        registerPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - too long display name
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - Too Long Display Name.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user stays on register page (since the user doesn't get any errors, only react based)
        String expectedRegisterURL = "https://barca-stores.netlify.app/register";
        String actualRegisterURL = page.url();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Long Display Name.png")).setFullPage(true));
        assertEquals(expectedRegisterURL, actualRegisterURL, "The user was able to create an account with too long display name, test has failed.");
    }

    //invalid user account creation test method - too long email (100 chars -> name, domain)
    protected void invalidUserAccountCreationTooLongEmailTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - too long email (100 char -> name, domain)
        registerPageInvalidSingularInput.invalidRegisterInputDataTooLongEmailGetter();
        //input valid display name into display name input field
        registerPageInvalidSingularInput.inputDisplayNameIntoDisplayNameInputField();
        //input too long email into email input field (100 chars -> name, domain)
        registerPageInvalidSingularInput.inputTooLongEmailIntoEmailInputField();
        //input valid password into password input field
        registerPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        registerPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - too long email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - Too Long Email.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for react error to load
        page.waitForTimeout(2000);
        //assert the user stays on register page (since the user doesn't get any errors, only react based)
        String expectedRegisterURL = "https://barca-stores.netlify.app/register";
        String actualRegisterURL = page.url();
        assertEquals(expectedRegisterURL, actualRegisterURL, "The user was able to create an account with too long email, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Long Email.png")).setFullPage(true));
    }

    //invalid user account creation test method - too long password/confirm password (21 chars)
    protected void invalidUserAccountCreationTooLongPasswordTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - too long password/confirm password (21 chars)
        registerPageInvalidSingularInput.invalidRegisterInputDataTooLongPasswordGetter();
        //input valid display name into display name input field
        registerPageInvalidSingularInput.inputDisplayNameIntoDisplayNameInputField();
        //input valid email into email input field
        registerPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input too long password into password input field (4 chars)
        registerPageInvalidSingularInput.inputTooLongPasswordIntoPasswordInputField();
        //input too long matching confirm password into confirm password input field (21 chars)
        registerPageInvalidSingularInput.inputTooLongConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - too long password/confirm password
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - Too Long Password And Confirm Password.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user stays on register page (since the user doesn't get any errors, only react based)
        String expectedRegisterURL = "https://barca-stores.netlify.app/register";
        String actualRegisterURL = page.url();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Too Long Password And Confirm Password.png")).setFullPage(true));
        assertEquals(expectedRegisterURL, actualRegisterURL, "The user was able to create an account with too long password, test has failed.");
    }

    //invalid singular input format

    //invalid user account creation test method - invalid display name format (special symbols only)
    protected void invalidUserAccountCreationInvalidDisplayNameFormatTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - invalid display name format (special symbols only)
        registerPageInvalidSingularInput.invalidRegisterInputDataInvalidDisplayNameFormatGetter();
        //input invalid display name format into display name input field (special symbols only)
        registerPageInvalidSingularInput.inputInvalidDisplayNameFormatIntoDisplayNameInputField();
        //input valid email into email input field
        registerPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        registerPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - invalid display name format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - Invalid Display Name Format.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user stays on register page (since the user doesn't get any errors, only react based)
        String expectedRegisterURL = "https://barca-stores.netlify.app/register";
        String actualRegisterURL = page.url();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Invalid Display Name Format.png")).setFullPage(true));
        assertEquals(expectedRegisterURL, actualRegisterURL, "The user was able to create an account with invalid display name input format, test has failed.");
    }

    //invalid user account creation test method - invalid email format (missing '@')
    protected void invalidUserAccountCreationInvalidEmailFormatTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - invalid email format (missing '@')
        registerPageInvalidSingularInput.invalidRegisterInputDataInvalidEmailFormatGetter();
        //input valid display name into display name input field
        registerPageInvalidSingularInput.inputDisplayNameIntoDisplayNameInputField();
        //input invalid email format into email input field (missing '@')
        registerPageInvalidSingularInput.inputInvalidEmailFormatIntoEmailInputField();
        //input valid password into password input field
        registerPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        registerPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - invalid email format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - Invalid Email Format.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for react error to load
        page.waitForTimeout(2000);
        //assert the user stays on register page (since the user doesn't get any errors, only react based)
        String expectedRegisterURL = "https://barca-stores.netlify.app/register";
        String actualRegisterURL = page.url();
        assertEquals(expectedRegisterURL, actualRegisterURL, "The user was able to create an account with invalid email format, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Invalid Email Format.png")).setFullPage(true));
    }

    //invalid user account creation test method - existing email (used beforehand in manual testing)
    protected void invalidUserAccountCreationExistingEmailFormatTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - existing email (used beforehand in manual testing)
        registerPageInvalidSingularInput.invalidRegisterInputDataExistingEmailGetter();
        //input valid display name into display name input field
        registerPageInvalidSingularInput.inputDisplayNameIntoDisplayNameInputField();
        //input existing email into email input field (used beforehand in manual testing)
        registerPageInvalidSingularInput.inputExistingEmailIntoEmailInputField();
        //input valid password into password input field
        registerPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        registerPageInvalidSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - existing email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - Existing Email.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for error to load
        page.waitForTimeout(2000);
        //assert the user gets an expected error
        String existingEmailInputError = registerPage.getRegisterPageSingularInputError();
        assertEquals("Email already in use.", existingEmailInputError, "The user was able to create an account with the existing email, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Existing Email.png")).setFullPage(true));
    }

    //invalid user account creation test method - mismatching confirm password
    protected void invalidUserAccountCreationMismatchingConfirmPasswordTest(){
        RegisterPage registerPage = new RegisterPage(page);
        RegisterPageInvalidSingularInput registerPageInvalidSingularInput = new RegisterPageInvalidSingularInput(page);
        //register page web element assert
        isRegisterPageWebElementVisible(page);
        //register page text element assert
        isRegisterPageTextElementAsExpected(page);
        //capture screenshot of the register page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display Before Data Input.png")).setFullPage(true));
        //invalid user register input data getter - mismatching confirm password
        registerPageInvalidSingularInput.invalidRegisterInputDataMismatchConfirmPasswordGetter();
        //input valid display name into display name input field
        registerPageInvalidSingularInput.inputDisplayNameIntoDisplayNameInputField();
        //input valid email into email input field
        registerPageInvalidSingularInput.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPageInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //input mismatching confirm password into confirm password input field
        registerPageInvalidSingularInput.inputMismatchingConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the register page display after invalid data input - mismatching confirm password
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Register Page Display After Invalid Data Input - Mismatching Confirm Password.png")).setFullPage(true));
        //click "Sign up" button
        registerPage.clickSignUpButton();
        //wait for error to load
        page.waitForTimeout(2000);
        //assert the user gets an expected error
        String mismatchingPasswordInputError = registerPage.getRegisterPageSingularInputError();
        assertEquals("Passwords do not match.", mismatchingPasswordInputError, "The user was able to create an account with mismatching confirm password, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Account Creation Test Result - Mismatching Confirm Password.png")).setFullPage(true));
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user login test

    //valid user login test method
    protected void validUserLoginTest(){
        RegisterPage registerPage = new RegisterPage(page);
        LoginPage loginPage = new LoginPage(page);
        //login page web element assert
        isLoginPageWebElementVisible(page);
        //login page text element assert
        isLoginPageTextElementAsExpected(page);
        //capture screenshot of the login page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display Before Data Input.png")).setFullPage(true));
        //valid user login input data getter
        loginPage.validLoginInputDataGetter(registerPage);
        //input valid login email into email input field
        loginPage.inputLoginEmailIntoLoginEmailInputField();
        //input valid login password into password input field
        loginPage.inputLoginPasswordIntoLoginPasswordInputField();
        //capture screenshot of the login page display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display After Valid Data Input.png")).setFullPage(true));
        //click "Sign In" button
        loginPage.clickSignInButton();
        //wait for the home page to load
        page.waitForTimeout(2000);
        //assert the user gets onto home page
        String expectedHomePageURL = "https://barca-stores.netlify.app/";
        String actualHomePageURL = page.url();
        assertEquals(expectedHomePageURL, actualHomePageURL, "The expected/actual home page URLs don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Valid User Login Test Result.png")).setFullPage(true));
    }

    //invalid user login tests

    //no singular input

    //invalid user login test method - no login email
    protected void invalidUserLoginNoEmailTest(){
        RegisterPage registerPage = new RegisterPage(page);
        LoginPage loginPage = new LoginPage(page);
        LoginPageInvalidSingularInput loginPageInvalidSingularInput = new LoginPageInvalidSingularInput(page);
        //login page web element assert
        isLoginPageWebElementVisible(page);
        //login page text element assert
        isLoginPageTextElementAsExpected(page);
        //capture screenshot of the login page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display Before Data Input.png")).setFullPage(true));
        //invalid user login input data getter - no login email
        loginPageInvalidSingularInput.invalidLoginInputDataNoEmailGetter(registerPage);
        //don't input login email into email input field
        loginPageInvalidSingularInput.inputNoLoginEmailIntoLoginEmailInputField();
        //input valid login password into password input field
        loginPageInvalidSingularInput.inputLoginPasswordIntoLoginPasswordInputField();
        //capture screenshot of the login page display after invalid data input - no login email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display After Invalid Data Input - No Login Email.png")).setFullPage(true));
        //click "Sign In" button
        loginPage.clickSignInButton();
        //wait for the home page to load
        page.waitForTimeout(2000);
        //assert the user stays on login page
        String expectedLoginURL = "https://barca-stores.netlify.app/login";
        String actualLoginURL = page.url();
        assertEquals(expectedLoginURL, actualLoginURL, "The user was able to login without an email, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Login Test Result - No Login Email.png")).setFullPage(true));
    }

    //invalid user login test method - no login password
    protected void invalidUserLoginNoPasswordTest(){
        RegisterPage registerPage = new RegisterPage(page);
        LoginPage loginPage = new LoginPage(page);
        LoginPageInvalidSingularInput loginPageInvalidSingularInput = new LoginPageInvalidSingularInput(page);
        //login page web element assert
        isLoginPageWebElementVisible(page);
        //login page text element assert
        isLoginPageTextElementAsExpected(page);
        //capture screenshot of the login page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display Before Data Input.png")).setFullPage(true));
        //invalid user login input data getter - no login password
        loginPageInvalidSingularInput.invalidLoginInputDataNoPasswordGetter(registerPage);
        //input valid login email into email input field
        loginPageInvalidSingularInput.inputLoginEmailIntoLoginEmailInputField();
        //don't input login password into password input field
        loginPageInvalidSingularInput.inputNoLoginPasswordIntoLoginPasswordInputField();
        //capture screenshot of the login page display after invalid data input - no login password
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display After Invalid Data Input - No Login Password.png")).setFullPage(true));
        //click "Sign In" button
        loginPage.clickSignInButton();
        //wait for the home page to load
        page.waitForTimeout(2000);
        //assert the user stays on login page
        String expectedLoginURL = "https://barca-stores.netlify.app/login";
        String actualLoginURL = page.url();
        assertEquals(expectedLoginURL, actualLoginURL, "The user was able to login without a password, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Login Test Result - No Login Password.png")).setFullPage(true));
    }

    //invalid singular input

    //invalid user login test method - invalid login email
    protected void invalidUserLoginInvalidEmailTest(){
        RegisterPage registerPage = new RegisterPage(page);
        LoginPage loginPage = new LoginPage(page);
        LoginPageInvalidSingularInput loginPageInvalidSingularInput = new LoginPageInvalidSingularInput(page);
        //login page web element assert
        isLoginPageWebElementVisible(page);
        //login page text element assert
        isLoginPageTextElementAsExpected(page);
        //capture screenshot of the login page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display Before Data Input.png")).setFullPage(true));
        //invalid user login input data getter - invalid login email
        loginPageInvalidSingularInput.invalidLoginInputDataInvalidEmailGetter(registerPage);
        //input invalid login email into email input field
        loginPageInvalidSingularInput.inputInvalidLoginEmailIntoLoginEmailInputField();
        //input valid login password into password input field
        loginPageInvalidSingularInput.inputLoginPasswordIntoLoginPasswordInputField();
        //capture screenshot of the login page display after invalid data input - invalid login email
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display After Invalid Data Input - Invalid Login Email.png")).setFullPage(true));
        //click "Sign In" button
        loginPage.clickSignInButton();
        //wait for the home page to load
        page.waitForTimeout(2000);
        //assert the user stays on login page
        String expectedLoginURL = "https://barca-stores.netlify.app/login";
        String actualLoginURL = page.url();
        assertEquals(expectedLoginURL, actualLoginURL, "The user was able to login with an invalid email, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Login Test Result - Invalid Login Email.png")).setFullPage(true));
    }

    //invalid user login test method - invalid login email input format
    protected void invalidUserLoginInvalidEmailFormatTest(){
        RegisterPage registerPage = new RegisterPage(page);
        LoginPage loginPage = new LoginPage(page);
        LoginPageInvalidSingularInput loginPageInvalidSingularInput = new LoginPageInvalidSingularInput(page);
        //login page web element assert
        isLoginPageWebElementVisible(page);
        //login page text element assert
        isLoginPageTextElementAsExpected(page);
        //capture screenshot of the login page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display Before Data Input.png")).setFullPage(true));
        //invalid user login input data getter - invalid login email input format
        loginPageInvalidSingularInput.invalidLoginInputDataInvalidEmailFormatGetter(registerPage);
        //input invalid login email input format into email input field
        loginPageInvalidSingularInput.inputInvalidLoginEmailFormatIntoLoginEmailInputField();
        //input valid login password into password input field
        loginPageInvalidSingularInput.inputLoginPasswordIntoLoginPasswordInputField();
        //capture screenshot of the login page display after invalid data input - invalid login email input format
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display After Invalid Data Input - Invalid Login Email Format.png")).setFullPage(true));
        //click "Sign In" button
        loginPage.clickSignInButton();
        //wait for the home page to load
        page.waitForTimeout(2000);
        //assert the user stays on login page
        String expectedLoginURL = "https://barca-stores.netlify.app/login";
        String actualLoginURL = page.url();
        assertEquals(expectedLoginURL, actualLoginURL, "The user was able to login with an invalid email input format, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Login Test Result - Invalid Login Email Format.png")).setFullPage(true));
    }

    //invalid user login test method - invalid login password
    protected void invalidUserLoginInvalidPasswordTest(){
        RegisterPage registerPage = new RegisterPage(page);
        LoginPage loginPage = new LoginPage(page);
        LoginPageInvalidSingularInput loginPageInvalidSingularInput = new LoginPageInvalidSingularInput(page);
        //login page web element assert
        isLoginPageWebElementVisible(page);
        //login page text element assert
        isLoginPageTextElementAsExpected(page);
        //capture screenshot of the login page display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display Before Data Input.png")).setFullPage(true));
        //invalid user login input data getter - invalid login password
        loginPageInvalidSingularInput.invalidLoginInputDataInvalidPasswordGetter(registerPage);
        //input valid login email into email input field
        loginPageInvalidSingularInput.inputLoginEmailIntoLoginEmailInputField();
        //input invalid login password into password input field
        loginPageInvalidSingularInput.inputInvalidLoginPasswordIntoLoginPasswordInputField();
        //capture screenshot of the login page display after invalid data input - invalid login password
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login Page Display After Invalid Data Input - Invalid Login Password.png")).setFullPage(true));
        //click "Sign In" button
        loginPage.clickSignInButton();
        //wait for the home page to load
        page.waitForTimeout(2000);
        //assert the user stays on login page
        String expectedLoginURL = "https://barca-stores.netlify.app/login";
        String actualLoginURL = page.url();
        assertEquals(expectedLoginURL, actualLoginURL, "The user was able to login with an invalid password, test has failed.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Invalid User Login Test Result - Invalid Login Password.png")).setFullPage(true));
    }

    //valid user logout test

    //valid user logout test method
    protected void validUserLogoutTest(){
        GeneralPage generalPage = new GeneralPage(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page (registered user) text element assert
        isGeneralPageRegUserTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //click header "Sign Out" link (same element as "Sign In" link)
        generalPage.clickHeaderSignInLink();
        //wait for page to re-load (for "Sign Out" button to change to "Sign In")
        page.waitForTimeout(1250);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Valid User Logout Test Result.png")).setFullPage(true));
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add single shop dashboard product to shopping cart modal tests

    //add single shop dashboard product ("Xavi Hernandez") to shopping cart modal test method (as a guest)
    protected void addSingleProductToShopCartModalTest(){
        GeneralPage generalPage = new GeneralPage(page);
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //click header "Shop" link
        generalPage.clickHeaderShopLink();
        //wait for login page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user gets onto shop dashboard page
        String expectedShopURL = "https://barca-stores.netlify.app/shop";
        String actualShopURL = page.url();
        assertEquals(expectedShopURL, actualShopURL, "The expected/actual shop dashboard page URLs don't match expectations.");
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //shop dashboard page web element assert
        isShopDashPageWebElementVisible(page);
        //shop dashboard page text element assert
        isShopDashPageTextElementAsExpected(page);
        //log shop dashboard page displayed product data
        logShopDashPageProductData(page);
        //capture screenshot of the shop dashboard page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Shop Dashboard Page Display (guest).png")).setFullPage(true));
        //click set coaches ("Xavi Hernandez") product (image) "Add to Cart" button
        shopDashboardPage.clickSetCoachesAddToCartBtn(1);
        //log header shopping cart product count data
        logGeneralPageProductCountData(page);
        //click header shopping cart button
        generalPage.clickHeaderShopCartBtn();
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //assert the expected product has been added
        String expectedProduct = "Xavi Hernandez";
        String actualProduct = shoppingCartModal.getShopCartModalProductName().getFirst();
        assertEquals(expectedProduct, actualProduct, "The expected/actual product names don't match expectations.");
        //assert the expected product count has been added
        String expectedProductCount = "1";
        String actualProductCount = shoppingCartModal.getShopCartModalProductQty().getFirst();
        assertEquals(expectedProductCount, actualProductCount, "The expected/actual product quantities don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Shop Dashboard Product (Xavi Hernandez) To Shopping Cart Modal Test Result (guest).png")).setFullPage(true));
    }

    //add single shop dashboard product ("Jules Kounde") to shopping cart modal test method (as a registered user)
    protected void addSingleProductToShopCartModalRegUserTest(){
        GeneralPage generalPage = new GeneralPage(page);
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page (registered user) text element assert
        isGeneralPageRegUserTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //click header "Shop" link
        generalPage.clickHeaderShopLink();
        //wait for login page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user gets onto shop dashboard page
        String expectedShopURL = "https://barca-stores.netlify.app/shop";
        String actualShopURL = page.url();
        assertEquals(expectedShopURL, actualShopURL, "The expected/actual shop dashboard page URLs don't match expectations.");
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page (registered user) text element assert
        isGeneralPageRegUserTextElementAsExpected(page);
        //shop dashboard page web element assert
        isShopDashPageWebElementVisible(page);
        //shop dashboard page text element assert
        isShopDashPageTextElementAsExpected(page);
        //log shop dashboard page displayed product data
        logShopDashPageProductData(page);
        //capture screenshot of the shop dashboard page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Shop Dashboard Page Display (guest).png")).setFullPage(true));
        //click set defenders ("Jules Kounde") product (image) "Add to Cart" button
        shopDashboardPage.clickSetDefendersAddToCartBtn(1);
        //log header shopping cart product count data
        logGeneralPageProductCountData(page);
        //click header shopping cart button
        generalPage.clickHeaderShopCartBtn();
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //assert the expected product has been added
        String expectedProduct = "Jules Kounde";
        String actualProduct = shoppingCartModal.getShopCartModalProductName().getFirst();
        assertEquals(expectedProduct, actualProduct, "The expected/actual product names don't match expectations.");
        //assert the expected product count has been added
        String expectedProductCount = "1";
        String actualProductCount = shoppingCartModal.getShopCartModalProductQty().getFirst();
        assertEquals(expectedProductCount, actualProductCount, "The expected/actual product quantities don't match expectations.");
        //capture screenshot of the shopping cart modal display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Shop Dashboard Product (Jules Kounde) To Shopping Cart Modal Test Result (registered user).png")).setFullPage(true));
    }

    //add multiple shop dashboard products to shopping cart modal tests

    //add multiple shop dashboard products ("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres") to shopping cart modal test method (as a guest)
    protected void addMultipleProductsToShopCartModalTest(){
        GeneralPage generalPage = new GeneralPage(page);
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //click header "Shop" link
        generalPage.clickHeaderShopLink();
        //wait for login page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user gets onto shop dashboard page
        String expectedShopURL = "https://barca-stores.netlify.app/shop";
        String actualShopURL = page.url();
        assertEquals(expectedShopURL, actualShopURL, "The expected/actual shop dashboard page URLs don't match expectations.");
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //shop dashboard page web element assert
        isShopDashPageWebElementVisible(page);
        //shop dashboard page text element assert
        isShopDashPageTextElementAsExpected(page);
        //log shop dashboard page displayed product data
        logShopDashPageProductData(page);
        //capture screenshot of the shop dashboard page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Shop Dashboard Page Display (guest).png")).setFullPage(true));
        //click set coaches ("Xavi Hernandez") product (image) "Add to Cart" button
        shopDashboardPage.clickSetCoachesAddToCartBtn(0);
        //click set coaches ("Oscar Hernandez") product (image) "Add to Cart" button
        shopDashboardPage.clickSetCoachesAddToCartBtn(2);
        //click set defenders ("Marcos Alonso") product (image) "Add to Cart" button
        shopDashboardPage.clickSetDefendersAddToCartBtn(2);
        //click set forwards ("Ferran Torres") product (image) "Add to Cart" button
        shopDashboardPage.clickSetForwardsAddToCartBtn(0);
        //log header shopping cart product count data
        logGeneralPageProductCountData(page);
        //click header shopping cart button
        generalPage.clickHeaderShopCartBtn();
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //assert the expected product has been added
        List<String> expectedProductNames = Arrays.asList("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres");
        List<String> actualProductNames = shoppingCartModal.getShopCartModalProductName();
        assertEquals(expectedProductNames, actualProductNames, "The expected/actual multiple product names don't match expectations.");
        //assert the expected product count has been added
        List<String> expectedProductCounts = Arrays.asList("1", "1", "1", "1");
        List<String> actualProductCounts = shoppingCartModal.getShopCartModalProductQty();
        assertEquals(expectedProductCounts, actualProductCounts, "The expected/actual multiple product quantities don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Multiple Shop Dashboard Products (Xavi Hernandez, Oscar Hernandez, Marcos Alonso, Ferran Torres) To Shopping Cart Modal Test Result (guest).png")).setFullPage(true));
    }

    //add multiple shop dashboard products ("Robert Lewandowski", "Marc-André ter Stegen", "Inaki Pena", "Ikay Gundogan") to shopping cart modal test method (as a guest)
    protected void addMultipleProductsToShopCartModalRegUserTest(){
        GeneralPage generalPage = new GeneralPage(page);
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page (registered user) text element assert
        isGeneralPageRegUserTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //click header "Shop" link
        generalPage.clickHeaderShopLink();
        //wait for login page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user gets onto shop dashboard page
        String expectedShopURL = "https://barca-stores.netlify.app/shop";
        String actualShopURL = page.url();
        assertEquals(expectedShopURL, actualShopURL, "The expected/actual shop dashboard page URLs don't match expectations.");
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page (registered user) text element assert
        isGeneralPageRegUserTextElementAsExpected(page);
        //shop dashboard page web element assert
        isShopDashPageWebElementVisible(page);
        //shop dashboard page text element assert
        isShopDashPageTextElementAsExpected(page);
        //log shop dashboard page displayed product data
        logShopDashPageProductData(page);
        //capture screenshot of the shop dashboard page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Shop Dashboard Page Display (guest).png")).setFullPage(true));
        //click set forwards ("Robert Lewandowski") product (image) "Add to Cart" button
        shopDashboardPage.clickSetForwardsAddToCartBtn(3);
        //click set goalkeepers ("Marc-Andre Ter Stegen") product (image) "Add to Cart" button
        shopDashboardPage.clickSetGoalKeepersAddToCartBtn(1);
        //click set goalkeepers ("Inaki Pena") product (image) "Add to Cart" button
        shopDashboardPage.clickSetGoalKeepersAddToCartBtn(3);
        //click set midfielders ("Ikay Gundogan") product (image) "Add to Cart" button
        shopDashboardPage.clickSetMidfieldersAddToCartBtn(0);
        //log header shopping cart product count data
        logGeneralPageProductCountData(page);
        //click header shopping cart button
        generalPage.clickHeaderShopCartBtn();
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //assert the expected products have been added
        List<String> expectedProductNames = Arrays.asList("Robert Lewandowski", "Marc-Andre Ter Stegen", "Inaki Pena", "Ikay Gundogan");
        List<String> actualProductNames = shoppingCartModal.getShopCartModalProductName();
        assertEquals(expectedProductNames, actualProductNames, "The expected/actual multiple product names don't match expectations.");
        //assert the expected product counts have been added
        List<String> expectedProductCounts = Arrays.asList("1", "1", "1", "1");
        List<String> actualProductCounts = shoppingCartModal.getShopCartModalProductQty();
        assertEquals(expectedProductCounts, actualProductCounts, "The expected/actual multiple product quantities don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Multiple Shop Dashboard Products (Robert Lewandowski, Marc-André ter Stegen, Inaki Pena, Ikay Gundogan) To Shopping Cart Modal Test Result (guest).png")).setFullPage(true));
    }

    //remove shop dashboard product(s) from shopping cart modal tests -> since the registered user will have the same output, only guest branch is tested to avoid redundancy

    //remove single shop dashboard product ("Xavi Hernandez") from shopping cart modal test method (as a guest)
    protected void removeSingleProductFromShopCartModalTest(){
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        //log header shopping cart product count data
        logGeneralPageProductCountData(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //assert the expected product has been added
        String expectedProduct = "Xavi Hernandez";
        String actualProduct = shoppingCartModal.getShopCartModalProductName().getFirst();
        assertEquals(expectedProduct, actualProduct, "The expected/actual product names don't match expectations.");
        //assert the expected product count has been added
        String expectedProductCount = "1";
        String actualProductCount = shoppingCartModal.getShopCartModalProductQty().getFirst();
        assertEquals(expectedProductCount, actualProductCount, "The expected/actual product quantities don't match expectations.");
        //click set coaches ("Xavi Hernandez") product (image) "Remove from Cart" button (same element as "Add to Cart" button)
        shopDashboardPage.clickSetCoachesAddToCartBtn(1);
        //log header shopping cart product count data
        logGeneralPageProductCountData(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal (coaches section) text element assert (select button changes text from "ADD TO CART" to "REMOVE FROM CART")
        isShopDashPageRemoveCoachesFromCartTextElementAsExpected(page);
        //empty shopping cart modal web element assert
        isEmptyShoppingCartModalWebElementVisible(page);
        //empty shopping cart modal text element assert
        isEmptyShoppingCartModalTextElementAsExpected(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Remove Product (Xavi Hernandez) From Shopping Cart Modal Test Result (guest).png")).setFullPage(true));
    }

    //remove multiple shop dashboard products ("Xavi Hernandez", "Oscar Hernandez") from shopping cart modal test method (as a guest)
    protected void removeMultipleProductsFromShopCartModalTest(){
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        //log header shopping cart product count data
        logGeneralPageProductCountData(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //assert the expected products are present in-list
        List<String> expectedProductNames = Arrays.asList("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres");
        List<String> actualProductNames = shoppingCartModal.getShopCartModalProductName();
        assertEquals(expectedProductNames, actualProductNames, "The expected/actual multiple product names don't match expectations.");
        //assert the expected product counts are present in-list
        List<String> expectedProductCounts = Arrays.asList("1", "1", "1", "1");
        List<String> actualProductCounts = shoppingCartModal.getShopCartModalProductQty();
        assertEquals(expectedProductCounts, actualProductCounts, "The expected/actual multiple product quantities don't match expectations.");
        //click set coaches ("Xavi Hernandez") product (image) "Remove from Cart" button
        shopDashboardPage.clickSetCoachesAddToCartBtn(0);
        //assert the expected products are present in-list (after first removal)
        List<String> expectedProductNamesFirstRemoval = Arrays.asList("Oscar Hernandez", "Marcos Alonso", "Ferran Torres");
        List<String> actualProductNamesFirstRemoval = shoppingCartModal.getShopCartModalProductName();
        assertEquals(expectedProductNamesFirstRemoval, actualProductNamesFirstRemoval, "The expected/actual multiple product names don't match expectations (after first removal).");
        //assert the expected product count are present in-list (after first removal)
        List<String> expectedProductCountsFirstRemoval = Arrays.asList("1", "1", "1");
        List<String> actualProductCountsFirstRemoval = shoppingCartModal.getShopCartModalProductQty();
        assertEquals(expectedProductCountsFirstRemoval, actualProductCountsFirstRemoval, "The expected/actual multiple product quantities don't match expectations (after first removal).");
        //log header shopping cart product count data (to verify product count has been altered)
        logGeneralPageProductCountData(page);
        //click set coaches ("Oscar Hernandez") product (image) "Remove from Cart" button
        shopDashboardPage.clickSetCoachesAddToCartBtn(2);
        //assert the expected products are present in-list (after second removal)
        List<String> expectedProductNamesSecondRemoval = Arrays.asList("Marcos Alonso", "Ferran Torres");
        List<String> actualProductNamesSecondRemoval = shoppingCartModal.getShopCartModalProductName();
        assertEquals(expectedProductNamesSecondRemoval, actualProductNamesSecondRemoval, "The expected/actual multiple product names don't match expectations (after second removal).");
        //assert the expected product are present in-list (after second removal)
        List<String> expectedProductCountsSecondRemoval = Arrays.asList("1", "1");
        List<String> actualProductCountsSecondRemoval = shoppingCartModal.getShopCartModalProductQty();
        assertEquals(expectedProductCountsSecondRemoval, actualProductCountsSecondRemoval, "The expected/actual multiple product quantities don't match expectations  (after second removal).");
        //log header shopping cart product count data (to verify product count has been altered)
        logGeneralPageProductCountData(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Remove Multiple Products (Xavi Hernandez, Oscar Hernandez) From Shopping Cart Modal Test Result (guest).png")).setFullPage(true));
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //checkout page tests (since the checkout feature isn't implemented, other functionalities are being tested)

    //product(s) checkout (page display) test method (as a guest)
    protected void productCheckoutTest(){
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageProductCountData(page);
        //log shopping cart modal data
        logShopCartModalProductData(page);
        //click "Go to Checkout" button
        shoppingCartModal.clickGoToCheckoutBtn();
        //wait for login page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user gets onto checkout page
        String expectedCheckoutURL = "https://barca-stores.netlify.app/checkout";
        String actualCheckoutURL = page.url();
        assertEquals(expectedCheckoutURL, actualCheckoutURL, "The expected/actual checkout page URLs don't match expectations.");
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //checkout page web element assert
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(page);
        //log checkout page displayed data
        logCheckoutPageProductData(page);
        //assert the unit price(s) sum equals to total order price
        List<String> unitPriceStrings = checkoutPage.getCheckoutPageProductUnitPrice();
        int productUnitPrices = unitPriceStrings.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        int totalOrderPrice = parseInt(checkoutPage.getCheckoutPageTotalPrice().replaceAll("[^0-9]", ""));
        assertEquals(productUnitPrices, totalOrderPrice, "The expected/actual checkout product(s) unit/total price(s) don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Product(s) Checkout Page Display Test Result (guest).png")).setFullPage(true));
    }

    //product(s) checkout (page display) test method (as a registered user)
    protected void productCheckoutRegUserTest(){
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page (registered user) text element assert
        isGeneralPageRegUserTextElementAsExpected(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageProductCountData(page);
        //log shopping cart modal data
        logShopCartModalProductData(page);
        //click "Go to Checkout" button
        shoppingCartModal.clickGoToCheckoutBtn();
        //wait for login page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user gets onto checkout page
        String expectedCheckoutURL = "https://barca-stores.netlify.app/checkout";
        String actualCheckoutURL = page.url();
        assertEquals(expectedCheckoutURL, actualCheckoutURL, "The expected/actual checkout page URLs don't match expectations.");
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page (registered user) text element assert
        isGeneralPageRegUserTextElementAsExpected(page);
        //checkout page web element assert
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(page);
        //log checkout page displayed data
        logCheckoutPageProductData(page);
        //assert the unit price(s) sum equals to total order price
        List<String> unitPriceStrings = checkoutPage.getCheckoutPageProductUnitPrice();
        int productUnitPrices = unitPriceStrings.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        int totalOrderPrice = parseInt(checkoutPage.getCheckoutPageTotalPrice().replaceAll("[^0-9]", ""));
        assertEquals(productUnitPrices, totalOrderPrice, "The expected/actual checkout product(s) unit/total price(s) don't match expectations.");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Product(s) Checkout Page Display Test Result (registered user).png")).setFullPage(true));
    }

    //update product quantity in checkout page test (since the registered user has the same output, only guest branch is being tested to avoid redundancy)

    //update product quantity in checkout page test method
    protected void updateProductQtyInCheckoutTest(){
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageProductCountData(page);
        //log shopping cart modal data
        logShopCartModalProductData(page);
        //click "Go to Checkout" button
        shoppingCartModal.clickGoToCheckoutBtn();
        //wait for login page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user gets onto checkout page
        String expectedCheckoutURL = "https://barca-stores.netlify.app/checkout";
        String actualCheckoutURL = page.url();
        assertEquals(expectedCheckoutURL, actualCheckoutURL, "The expected/actual checkout page URLs don't match expectations.");
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //checkout page web element assert
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(page);
        //log checkout page displayed data
        logCheckoutPageProductData(page);
        //assert the expected product quantity is as expected
        String expectedProductQty = "1";
        String actualProductQty = checkoutPage.getCheckoutPageProductQty().getFirst();
        assertEquals(expectedProductQty, actualProductQty, "The expected/actual product quantity doesn't match expectations.");
        //assert the unit price multiplied by quantity equals to total order price
        int actualUnitPriceByQty = parseInt(checkoutPage.getCheckoutPageProductUnitPrice().getFirst()) * parseInt(checkoutPage.getCheckoutPageProductQty().getFirst());
        int expectedOrderPrice = 20;
        assertEquals(expectedOrderPrice, actualUnitPriceByQty, "The expected/actual checkout product(s) unit by quantity/total price(s) don't match expectations.");
        //capture screenshot of the checkout page display before product quantity update
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Display Before Product Quantity Update.png")).setFullPage(true));
        //click set product quantity increase button
        checkoutPage.clickSetProductQtyIncreaseButton(0, 6);
        //log checkout page displayed data (to verify product quantity gets updated)
        logCheckoutPageProductData(page);
        //capture screenshot of the checkout page display after product quantity increase
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Display After Product Quantity Increase.png")).setFullPage(true));
        //assert the expected product quantity is as expected
        String expectedProductQtyIncreased = "7";
        String actualProductQtyIncreased = checkoutPage.getCheckoutPageProductQty().getFirst();
        assertEquals(expectedProductQtyIncreased, actualProductQtyIncreased, "The expected/actual product quantity doesn't match expectations (after quantity increase).");
        //assert the unit price multiplied by quantity equals to total order price
        int actualUnitPriceByQtyIncreased = parseInt(checkoutPage.getCheckoutPageProductUnitPrice().getFirst()) * parseInt(checkoutPage.getCheckoutPageProductQty().getFirst());
        int expectedOrderPriceIncreased = 140;
        assertEquals(expectedOrderPriceIncreased, actualUnitPriceByQtyIncreased, "The expected/actual checkout product(s) unit by quantity/total price(s) don't match expectations (after quantity increase).");
        //click set product quantity decrease button
        checkoutPage.clickSetProductQtyDecreaseButton(0, 2);
        //assert the expected product quantity is as expected
        String expectedProductQtyDecreased = "5";
        String actualProductQtyDecreased = checkoutPage.getCheckoutPageProductQty().getFirst();
        assertEquals(expectedProductQtyDecreased, actualProductQtyDecreased, "The expected/actual product quantity doesn't match expectations (after quantity decrease).");
        //assert the unit price multiplied by quantity equals to total order price
        int actualUnitPriceByQtyDecreased = parseInt(checkoutPage.getCheckoutPageProductUnitPrice().getFirst()) * parseInt(checkoutPage.getCheckoutPageProductQty().getFirst());
        int expectedOrderPriceDecreased = 100;
        assertEquals(expectedOrderPriceDecreased, actualUnitPriceByQtyDecreased, "The expected/actual checkout product(s) unit by quantity/total price(s) don't match expectations (after quantity decrease).");
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Update Product Quantity In Checkout Page test Result.png")).setFullPage(true));
    }

    //remove a single product from checkout page tests

    //remove a single product from checkout page test method
    protected void removeSingleProductFromCheckoutPageTest(){
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageProductCountData(page);
        //log shopping cart modal data
        logShopCartModalProductData(page);
        //click "Go to Checkout" button
        shoppingCartModal.clickGoToCheckoutBtn();
        //wait for login page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user gets onto checkout page
        String expectedCheckoutURL = "https://barca-stores.netlify.app/checkout";
        String actualCheckoutURL = page.url();
        assertEquals(expectedCheckoutURL, actualCheckoutURL, "The expected/actual checkout page URLs don't match expectations.");
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //checkout page web element assert
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(page);
        //log checkout page displayed data
        logCheckoutPageProductData(page);
        //assert the expected product quantity is as expected
        String expectedProductQty = "1";
        String actualProductQty = checkoutPage.getCheckoutPageProductQty().getFirst();
        assertEquals(expectedProductQty, actualProductQty, "The expected/actual product quantity doesn't match expectations.");
        //assert the unit price multiplied by quantity equals to total order price
        int actualUnitPriceByQty = parseInt(checkoutPage.getCheckoutPageProductUnitPrice().getFirst()) * parseInt(checkoutPage.getCheckoutPageProductQty().getFirst());
        int expectedOrderPrice = 20;
        assertEquals(expectedOrderPrice, actualUnitPriceByQty, "The expected/actual checkout product(s) unit by quantity/total price(s) don't match expectations.");
        //capture screenshot of the checkout page display before product removal
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Display Before Product Removal.png")).setFullPage(true));
        //click set product remove button
        checkoutPage.clickSetProductRemoveButton(0);
        //capture screenshot of the test result (since there's no message to announce success)
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Product Removal From Checkout Page Test Result.png")).setFullPage(true));
    }

    //remove set products ("Xavi Hernandez", "Oscar Hernandez") from checkout page test method
    protected void removeSetProductsFromCheckoutPageTest(){
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //shopping cart modal web element assert
        isShoppingCartModalWebElementVisible(page);
        //shopping cart modal text element assert
        isShoppingCartModalTextElementAsExpected(page);
        //log general page displayed data
        logGeneralPageProductCountData(page);
        //log shopping cart modal data
        logShopCartModalProductData(page);
        //click "Go to Checkout" button
        shoppingCartModal.clickGoToCheckoutBtn();
        //wait for login page to load (since the backend load time is quite slow, wait time is extended)
        page.waitForTimeout(4750);
        //assert the user gets onto checkout page
        String expectedCheckoutURL = "https://barca-stores.netlify.app/checkout";
        String actualCheckoutURL = page.url();
        assertEquals(expectedCheckoutURL, actualCheckoutURL, "The expected/actual checkout page URLs don't match expectations.");
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //checkout page web element assert
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(page);
        //log checkout page displayed data
        logCheckoutPageProductData(page);
        //assert the expected products are present in-list
        List<String> expectedProductNames = Arrays.asList("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres");
        List<String> actualProductNames = checkoutPage.getCheckoutPageProductName();
        assertEquals(expectedProductNames, actualProductNames, "The expected/actual multiple product names don't match expectations.");
        //assert the expected product quantities are as expected
        List<String> expectedProductQty = Arrays.asList("1", "1", "1", "1");
        List<String> actualProductQty = checkoutPage.getCheckoutPageProductQty();
        assertEquals(expectedProductQty, actualProductQty, "The expected/actual multiple product quantities doesn't match expectations.");
        //assert the unit price(s) sum equals to total order price
        List<String> unitPriceStrings = checkoutPage.getCheckoutPageProductUnitPrice();
        int productUnitPrices = unitPriceStrings.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        int totalOrderPrice = parseInt(checkoutPage.getCheckoutPageTotalPrice().replaceAll("[^0-9]", ""));
        assertEquals(productUnitPrices, totalOrderPrice, "The expected/actual checkout product(s) unit/total price(s) don't match expectations.");
        //capture screenshot of the checkout page display before product removal
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Display Before Product Removal.png")).setFullPage(true));
        //click set product ("Xavi Hernandez"") remove button
        checkoutPage.clickSetProductRemoveButton(0);
        //capture screenshot of the checkout page display after set product removal
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Display After Set Product (Xavi Hernandez) Removal.png")).setFullPage(true));
        //log checkout page displayed data
        logCheckoutPageProductData(page);
        //assert the expected products are present in-list
        List<String> expectedProductNamesFirstRemoval = Arrays.asList("Oscar Hernandez", "Marcos Alonso", "Ferran Torres");
        List<String> actualProductNamesFirstRemoval = checkoutPage.getCheckoutPageProductName();
        assertEquals(expectedProductNamesFirstRemoval, actualProductNamesFirstRemoval, "The expected/actual multiple product names don't match expectations (after first removal).");
        //assert the expected product quantities are as expected
        List<String> expectedProductQtyFirstRemoval = Arrays.asList("1", "1", "1");
        List<String> actualProductQtyFirstRemoval = checkoutPage.getCheckoutPageProductQty();
        assertEquals(expectedProductQtyFirstRemoval, actualProductQtyFirstRemoval, "The expected/actual multiple product quantities doesn't match expectations (after first removal).");
        //assert the unit price(s) sum equals to total order price
        List<String> unitPriceStringsFirstRemoval = checkoutPage.getCheckoutPageProductUnitPrice();
        int productUnitPricesFirstRemoval = unitPriceStringsFirstRemoval.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        int totalOrderPriceFirstRemoval = parseInt(checkoutPage.getCheckoutPageTotalPrice().replaceAll("[^0-9]", ""));
        assertEquals(productUnitPricesFirstRemoval, totalOrderPriceFirstRemoval, "The expected/actual checkout product(s) unit/total price(s) don't match expectations (after first removal).");
        //click set product ("Oscar Hernandez") remove button
        checkoutPage.clickSetProductRemoveButton(0);
        //capture screenshot of the checkout page display after set product removal
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Display After Set Product (Oscar Hernandez) Removal.png")).setFullPage(true));
        //log checkout page displayed data
        logCheckoutPageProductData(page);
        //assert the expected products are present in-list
        List<String> actualProductNamesSecondRemoval = checkoutPage.getCheckoutPageProductName();
        List<String> expectedProductNamesSecondRemoval = Arrays.asList("Marcos Alonso", "Ferran Torres");
        assertEquals(expectedProductNamesSecondRemoval, actualProductNamesSecondRemoval, "The expected/actual multiple product names don't match expectations (after second removal).");
        //assert the expected product quantities are as expected
        List<String> expectedProductQtySecondRemoval = Arrays.asList("1", "1");
        List<String> actualProductQtySecondRemoval = checkoutPage.getCheckoutPageProductQty();
        assertEquals(expectedProductQtySecondRemoval, actualProductQtySecondRemoval, "The expected/actual multiple product quantities doesn't match expectations (after second removal).");
        //assert the unit price(s) sum equals to total order price
        List<String> unitPriceStringsSecondRemoval = checkoutPage.getCheckoutPageProductUnitPrice();
        int productUnitPricesSecondRemoval = unitPriceStringsSecondRemoval.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        int totalOrderPriceSecondRemoval = parseInt(checkoutPage.getCheckoutPageTotalPrice().replaceAll("[^0-9]", ""));
        assertEquals(productUnitPricesSecondRemoval, totalOrderPriceSecondRemoval, "The expected/actual checkout product(s) unit/total price(s) don't match expectations (after second removal).");
        //capture screenshot of the test result (since there's no message to announce success)
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Set Products (Xavi Hernandez, Oscar Hernandez) Removal From Checkout Page Test Result.png")).setFullPage(true));
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
