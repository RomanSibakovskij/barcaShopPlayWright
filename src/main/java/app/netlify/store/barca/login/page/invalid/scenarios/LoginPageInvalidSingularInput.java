package app.netlify.store.barca.login.page.invalid.scenarios;

import app.netlify.store.barca.utilities.BasePage;
import app.netlify.store.barca.RegisterPage;
import com.microsoft.playwright.*;

public class LoginPageInvalidSingularInput extends BasePage {

    //relevant web elements
    private Locator loginPageEmailInputField;
    private Locator loginPagePasswordInputField;

    //invalid user login input data - no singular input
    private String noLoginEmail;
    private String noLoginPassword;

    //invalid user login input data - invalid singular input
    private String invalidLoginEmail;
    private String invalidLoginEmailFormat;
    private String invalidLoginPassword;

    //valid user login input data (for remaining inputs)
    private String loginEmail;
    private String loginPassword;

    public LoginPageInvalidSingularInput(Page page) {
        super(page);

        loginPageEmailInputField = page.locator("//form/div[1]/input");
        loginPagePasswordInputField = page.locator("//form/div[2]/input");

    }

    //invalid login input data getter - no login email
    public void invalidLoginInputDataNoEmailGetter(RegisterPage registerPage) {

        noLoginEmail = "";
        loginPassword = registerPage.getRegisterPassword();

        System.out.println("Invalid user login input data (no login email): " + "\n");

        logger.info("No user login email: " + noLoginEmail);
        logger.info("Valid user login password (no login email): " + loginPassword);

        System.out.println("\n");

    }

    //invalid login input data getter - no login password
    public void invalidLoginInputDataNoPasswordGetter(RegisterPage registerPage) {

        loginEmail = registerPage.getRegisterEmail();
        noLoginPassword = "";

        System.out.println("Invalid user login input data (no login password): " + "\n");

        logger.info("Valid user login email (no login password): " + loginEmail);
        logger.info("No user login password: " + noLoginPassword);

        System.out.println("\n");

    }

    //invalid login data input methods - no singular input
    public void inputNoLoginEmailIntoLoginEmailInputField() {loginPageEmailInputField.fill(noLoginEmail);}
    public void inputNoLoginPasswordIntoLoginPasswordInputField() {loginPagePasswordInputField.fill(noLoginPassword);}

    //invalid login input data getter - invalid login email
    public void invalidLoginInputDataInvalidEmailGetter(RegisterPage registerPage) {

        invalidLoginEmail = "dgfdhfdhfg@fakemail.com";
        loginPassword = registerPage.getRegisterPassword();

        System.out.println("Invalid user login input data (invalid login email): " + "\n");

        logger.info("Invalid user login email: " + invalidLoginEmail);
        logger.info("Valid user login password (invalid login email): " + loginPassword);

        System.out.println("\n");

    }

    //invalid login input data getter - invalid login email format (missing '@')
    public void invalidLoginInputDataInvalidEmailFormatGetter(RegisterPage registerPage) {

        invalidLoginEmailFormat = "dgfdhfdhfgfakemail.com";
        loginPassword = registerPage.getRegisterPassword();

        System.out.println("Invalid user login input data (invalid login email format): " + "\n");

        logger.info("Invalid user login email format: " + invalidLoginEmailFormat);
        logger.info("Valid user login password (invalid login email format): " + loginPassword);

        System.out.println("\n");

    }

    //invalid login input data getter - invalid login password
    public void invalidLoginInputDataInvalidPasswordGetter(RegisterPage registerPage) {

        loginEmail = registerPage.getRegisterEmail();
        invalidLoginPassword = "asfds@#$@#$";

        System.out.println("Invalid user login input data (invalid login password): " + "\n");

        logger.info("Valid user login email (invalid login password): " + loginEmail);
        logger.info("Invalid user login password: " + invalidLoginPassword);

        System.out.println("\n");

    }

    //invalid login data input methods - invalid singular input
    public void inputInvalidLoginEmailIntoLoginEmailInputField() {loginPageEmailInputField.fill(invalidLoginEmail);}
    public void inputInvalidLoginEmailFormatIntoLoginEmailInputField() {loginPageEmailInputField.fill(invalidLoginEmailFormat);}
    public void inputInvalidLoginPasswordIntoLoginPasswordInputField() {loginPagePasswordInputField.fill(invalidLoginPassword);}

    //valid login data input methods (for remaining inputs)
    public void inputLoginEmailIntoLoginEmailInputField() {loginPageEmailInputField.fill(loginEmail);}
    public void inputLoginPasswordIntoLoginPasswordInputField() {loginPagePasswordInputField.fill(loginPassword);}

}