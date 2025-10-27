package app.netlify.store.barca;

import app.netlify.store.barca.utilities.*;
import com.microsoft.playwright.*;

public class RegisterPage extends BasePage {

    //register page web elements
    private Locator registerPageTitle;
    //input form
    private Locator registerPageDisplayNameSubtext;
    private Locator registerPageDisplayNameInputField;
    private Locator registerPageEmailSubtext;
    private Locator registerPageEmailInputField;
    private Locator registerPagePasswordSubtext;
    private Locator registerPagePasswordInputField;
    private Locator registerPageConfirmPasswordSubtext;
    private Locator registerPageConfirmPasswordInputField;
    //button
    private Locator registerPageSignUpButton;
    private Locator registerPageSignInText;
    private Locator registerPageSignInLink;
    //singular input error
    private Locator registerPageSingularInputError;

    //valid user register input data
    private String registerDisplayName;
    private static String registerEmail;
    private static String registerPassword;

    public RegisterPage(Page page) {
        super(page);

        registerPageTitle = page.locator("//h1[@class='text-center text-xl']");
        //input form
        registerPageDisplayNameSubtext = page.locator("//form/div[1]/label");
        registerPageDisplayNameInputField = page.locator("//form/div[1]/input");
        registerPageEmailSubtext = page.locator("//form/div[2]/label");
        registerPageEmailInputField = page.locator("//form/div[2]/input");
        registerPagePasswordSubtext = page.locator("//form/div[3]/label");
        registerPagePasswordInputField = page.locator("//form/div[3]/input");
        registerPageConfirmPasswordSubtext = page.locator("//form/div[4]/label");
        registerPageConfirmPasswordInputField = page.locator("//form/div[4]/input");
        //button
        registerPageSignUpButton = page.locator("//form/button");
        registerPageSignInText = page.locator("//div[@class='flex justify-end mt-10']/h2");
        registerPageSignInLink = page.locator("//div[@class='flex justify-end mt-10']/a");
        //singular input error
        registerPageSingularInputError = page.locator("//div[@role='alert']");

    }

    //valid user register input data getter
    public void validRegisterInputDataGetter(){

        registerDisplayName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        registerEmail = TestDataGenerator.generateRandomEmailAddress(10);
        registerPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid user generated register input data: " + "\n");

        logger.info("Valid user generated display name : " + registerDisplayName);
        logger.info("Valid user generated email : " + registerEmail);
        logger.info("Valid user generated password : " + registerPassword);
        logger.info("Valid user matching confirm password : " + registerPassword);

        System.out.println("\n");

    }

    //valid register data input methods
    public void inputDisplayNameIntoDisplayNameInputField(){registerPageDisplayNameInputField.fill(registerDisplayName);}
    public void inputEmailIntoEmailInputField(){registerPageEmailInputField.fill(registerEmail);}
    public void inputPasswordIntoPasswordInputField(){registerPagePasswordInputField.fill(registerPassword);}
    public void inputConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.fill(registerPassword);}

    //click "Sign up" button method
    public void clickSignUpButton(){registerPageSignUpButton.click();}

    //register page text element getters
    public String getRegisterPageTitle() {return registerPageTitle.innerText();}
    //input form
    public String getRegisterPageDisplayNameSubtext() {return registerPageDisplayNameSubtext.innerText();}
    public String getRegisterPageEmailSubtext() {return registerPageEmailSubtext.innerText();}
    public String getRegisterPagePasswordSubtext() {return registerPagePasswordSubtext.innerText();}
    public String getRegisterPageConfirmPasswordSubtext() {return registerPageConfirmPasswordSubtext.innerText();}
    //button
    public String getRegisterPageSignUpButtonText() {return registerPageSignUpButton.innerText();}
    public String getRegisterPageSignInText() {return registerPageSignInText.innerText();}
    public String getRegisterPageSignInLink() {return registerPageSignInLink.innerText();}
    //singular input error getters
    public String getRegisterPageSingularInputError() {return registerPageSingularInputError.innerText();}

    //private data getters
    public String getRegisterEmail() {return registerEmail;}
    public String getRegisterPassword() {return registerPassword;}

    //register page web element assert methods
    public boolean isRegisterPageTitleVisible() {return registerPageTitle.isVisible();}
    //input form
    public boolean isRegisterPageDisplayNameSubtextVisible() {return registerPageDisplayNameSubtext.isVisible();}
    public boolean isRegisterPageDisplayNameInputFieldVisible() {return registerPageDisplayNameInputField.isVisible();}
    public boolean isRegisterPageEmailSubtextVisible() {return registerPageEmailSubtext.isVisible();}
    public boolean isRegisterPageEmailInputFieldVisible() {return registerPageEmailInputField.isVisible();}
    public boolean isRegisterPagePasswordSubtextVisible() {return registerPagePasswordSubtext.isVisible();}
    public boolean isRegisterPagePasswordInputFieldVisible() {return registerPagePasswordInputField.isVisible();}
    public boolean isRegisterPageConfirmPasswordSubtextVisible() {return registerPageConfirmPasswordSubtext.isVisible();}
    public boolean isRegisterPageConfirmPasswordInputFieldVisible() {return registerPageConfirmPasswordInputField.isVisible();}
    //button
    public boolean isRegisterPageSignUpButtonVisible() {return registerPageSignUpButton.isVisible();}
    public boolean isRegisterPageSignInTextVisible() {return registerPageSignInText.isVisible();}
    public boolean isRegisterPageSignInLinkVisible() {return registerPageSignInLink.isVisible();}

}
