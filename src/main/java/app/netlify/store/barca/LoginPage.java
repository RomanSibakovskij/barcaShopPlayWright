package app.netlify.store.barca;

import app.netlify.store.barca.utilities.BasePage;
import com.microsoft.playwright.*;

public class LoginPage extends BasePage {

    //login page web elements
    private Locator loginPageTitle;
    //input form
    private Locator loginPageEmailSubtext;
    private Locator loginPageEmailInputField;
    private Locator loginPagePasswordSubtext;
    private Locator loginPagePasswordInputField;
    //buttons
    private Locator loginPageSignInButton;
    private Locator loginPageGoogleSignInButton;
    private Locator loginPageAccountText;
    private Locator loginPageSignUpLink;

    //valid user login input data
    private String loginEmail;
    private String loginPassword;

    public LoginPage(Page page) {
        super(page);

        loginPageTitle = page.locator("//h1[@class='text-center text-xl']");
        //input form
        loginPageEmailSubtext = page.locator("//form/div[1]/label");
        loginPageEmailInputField = page.locator("//form/div[1]/input");
        loginPagePasswordSubtext = page.locator("//form/div[2]/label");
        loginPagePasswordInputField = page.locator("//form/div[2]/input");
        //buttons
        loginPageSignInButton = page.locator("//div[@class='flex justify-start mt-10']/button[1]");
        loginPageGoogleSignInButton = page.locator("//div[@class='flex justify-start mt-10']/button[2]");
        loginPageAccountText = page.locator("//div[@class='flex justify-end mt-10']/h2");
        loginPageSignUpLink = page.locator("//div[@class='flex justify-end mt-10']/a");

    }

    //valid login input data getter
    public void validLoginInputDataGetter(RegisterPage registerPage) {

        loginEmail = registerPage.getRegisterEmail();
        loginPassword = registerPage.getRegisterPassword();

        System.out.println("Valid user login input data: " + "\n");

        logger.info("Valid user login email: " + loginEmail);
        logger.info("Valid user login password: " + loginPassword);

        System.out.println("\n");

    }

    //valid login data input methods
    public void inputLoginEmailIntoLoginEmailInputField() {loginPageEmailInputField.fill(loginEmail);}
    public void inputLoginPasswordIntoLoginPasswordInputField() {loginPagePasswordInputField.fill(loginPassword);}

    //click "Sign In" button method
    public void clickSignInButton() {loginPageSignInButton.click();}

    //click "Sign up" link method
    public void clickSignUpLink(){loginPageSignUpLink.click();}

    //login page text element getters
    public String getLoginPageTitle() {return loginPageTitle.innerText();}
    //input form
    public String getLoginPageEmailSubtext() {return loginPageEmailSubtext.innerText();}
    public String getLoginPagePasswordSubtext() {return loginPagePasswordSubtext.innerText();}
    //button
    public String getLoginPageSignInButtonText() {return loginPageSignInButton.innerText();}
    public String getLoginPageGoogleSignInButtonText() {return loginPageGoogleSignInButton.innerText();}
    public String getLoginPageAccountText() {return loginPageAccountText.innerText();}
    public String getLoginPageSignUpLinkText() {return loginPageSignUpLink.innerText();}

    //login page web element assert methods
    public boolean isLoginPageTitleVisible() {return loginPageTitle.isVisible();}
    //input form
    public boolean isLoginPageEmailSubtextVisible() {return loginPageEmailSubtext.isVisible();}
    public boolean isLoginPageEmailInputFieldVisible() {return loginPageEmailInputField.isVisible();}
    public boolean isLoginPagePasswordSubtextVisible() {return loginPagePasswordSubtext.isVisible();}
    public boolean isLoginPagePasswordInputFieldVisible() {return loginPagePasswordInputField.isVisible();}
    //buttons
    public boolean isLoginPageSignInButtonVisible() {return loginPageSignInButton.isVisible();}
    public boolean isLoginPageGoogleSignInButtonVisible() {return loginPageSignInButton.isVisible();}
    public boolean isLoginPageAccountTextVisible() {return loginPageAccountText.isVisible();}
    public boolean isLoginPageSignUpLinkVisible() {return loginPageSignUpLink.isVisible();}

}
