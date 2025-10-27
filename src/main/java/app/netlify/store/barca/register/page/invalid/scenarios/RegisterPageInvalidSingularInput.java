package app.netlify.store.barca.register.page.invalid.scenarios;

import app.netlify.store.barca.utilities.*;
import com.microsoft.playwright.*;

public class RegisterPageInvalidSingularInput extends BasePage {

    //relevant web elements
    private Locator registerPageDisplayNameInputField;
    private Locator registerPageEmailInputField;
    private Locator registerPagePasswordInputField;
    private Locator registerPageConfirmPasswordInputField;

    //invalid user register input data - no singular input
    private String noRegisterDisplayName;
    private String noRegisterEmail;
    private String noRegisterPassword;

    //invalid user register input data - too short singular input
    private String tooShortRegisterDisplayName; //3 chars
    private String tooShortRegisterEmail; //1 char -> name, domain
    private String tooShortRegisterPassword; // 4 chars

    //invalid user register input data - too long singular input
    private String tooLongRegisterDisplayName; //201 chars
    private String tooLongRegisterEmail; //100 chars -> name, domain
    private String tooLongRegisterPassword; //21 chars

    //invalid user register input data - invalid singular input format
    private String invalidRegisterDisplayNameFormat; //special symbols only
    private String invalidRegisterEmailFormat; //missing '@'
    private String existingRegisterEmail; //used beforehand in manual testing
    private String mismatchingConfirmRegisterPassword;

    //valid user register input data (for remaining input)
    private String registerDisplayName;
    private static String registerEmail;
    private static String registerPassword;

    public RegisterPageInvalidSingularInput(Page page) {
        super(page);

        registerPageDisplayNameInputField = page.locator("//form/div[1]/input");
        registerPageEmailInputField = page.locator("//form/div[2]/input");
        registerPagePasswordInputField = page.locator("//form/div[3]/input");
        registerPageConfirmPasswordInputField = page.locator("//form/div[4]/input");

    }

    //invalid user register input data getter - no display name
    public void invalidRegisterInputDataNoDisplayNameGetter(){

        noRegisterDisplayName = "";
        registerEmail = TestDataGenerator.generateRandomEmailAddress(10);
        registerPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid user generated register input data (no display name): " + "\n");

        logger.info("No user generated display name: " + noRegisterDisplayName);
        logger.info("Valid user generated email (no display name): " + registerEmail);
        logger.info("Valid user generated password (no display name): " + registerPassword);
        logger.info("Valid user matching confirm password (no display name): " + registerPassword);

        System.out.println("\n");

    }

    //invalid user register input data getter - no email
    public void invalidRegisterInputDataNoEmailGetter(){

        registerDisplayName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        noRegisterEmail = "";
        registerPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid user generated register input data (no email): " + "\n");

        logger.info("Valid user generated display name (no email): " + registerDisplayName);
        logger.info("No user generated email: " + noRegisterEmail);
        logger.info("Valid user generated password: " + registerPassword);
        logger.info("Valid user matching confirm password: " + registerPassword);

        System.out.println("\n");

    }

    //invalid user register input data getter - no register password
    public void invalidRegisterInputDataNoPasswordGetter(){

        registerDisplayName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        registerEmail = TestDataGenerator.generateRandomEmailAddress(6);
        noRegisterPassword = "";

        System.out.println("Invalid user generated register input data (no password): " + "\n");

        logger.info("Valid user generated display name (no password): " + registerDisplayName);
        logger.info("Valid user generated email (no password): " + noRegisterEmail);
        logger.info("No user generated password: " + noRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input methods - no singular input
    public void inputNoDisplayNameIntoDisplayNameInputField(){registerPageDisplayNameInputField.fill(noRegisterDisplayName);}
    public void inputNoEmailIntoEmailInputField(){registerPageEmailInputField.fill(noRegisterEmail);}
    public void inputNoPasswordIntoPasswordInputField(){registerPagePasswordInputField.fill(noRegisterPassword);}

    //invalid user register input data getter - too short display name (3 chars)
    public void invalidRegisterInputDataTooShortDisplayNameGetter(){

        tooShortRegisterDisplayName = "F R";
        registerEmail = TestDataGenerator.generateRandomEmailAddress(10);
        registerPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid user generated register input data (too short display name): " + "\n");

        logger.info("Too short user generated display name: " + tooShortRegisterDisplayName);
        logger.info("Valid user generated email (too short display name): " + registerEmail);
        logger.info("Valid user generated password (too short display name): " + registerPassword);
        logger.info("Valid user matching confirm password (too short display name): " + registerPassword);

        System.out.println("\n");

    }

    //invalid user register input data getter - too short email (1 char -> name, domain)
    public void invalidRegisterInputDataTooShortEmailGetter(){

        registerDisplayName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        tooShortRegisterEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);
        registerPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid user generated register input data (too short email): " + "\n");

        logger.info("Valid user generated display name (too short email): " + registerDisplayName);
        logger.info("Too short user generated email: " + tooShortRegisterEmail);
        logger.info("Valid user generated password (too short email): " + registerPassword);
        logger.info("Valid user matching confirm password (too short email): " + registerPassword);

        System.out.println("\n");

    }

    //invalid user register input data getter - too short register password (5 chars)
    public void invalidRegisterInputDataTooShortPasswordGetter(){

        registerDisplayName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        registerEmail = TestDataGenerator.generateRandomEmailAddress(6);
        tooShortRegisterPassword = "$r5T*";

        System.out.println("Invalid user generated register input data (too short password): " + "\n");

        logger.info("Valid user generated display name (too short password): " + registerDisplayName);
        logger.info("Valid user generated email (too short password): " + registerEmail);
        logger.info("Too short user generated password: " + tooShortRegisterPassword);
        logger.info("Too short matching user generated confirm password: " + tooShortRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input methods - too short singular input
    public void inputTooShortDisplayNameIntoDisplayNameInputField(){registerPageDisplayNameInputField.fill(tooShortRegisterDisplayName);}
    public void inputTooShortEmailIntoEmailInputField(){registerPageEmailInputField.fill(tooShortRegisterEmail);}
    public void inputTooShortPasswordIntoPasswordInputField(){registerPagePasswordInputField.fill(tooShortRegisterPassword);}
    public void inputTooShortConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.fill(tooShortRegisterPassword);}

    //invalid user register input data getter - too long display name (201 chars)
    public void invalidRegisterInputDataTooLongDisplayNameGetter(){

        tooLongRegisterDisplayName = "Rfddsfgdhgsderrtuyuiuppolkjhkkghfdgfdsfeftgfdgfgbcvcbvfdbfgfdgfggfdfserewreerefdfgfdgfdhfggfhfgvcfgf Ffdgdfsretgrthgbnmnmbvcbvcczcfsrweterrtygfgfdgryrtytyfgfdgfghfghryrtyfghghfdgfgfdgfdgfdgfdgfgrtrrrty";
        registerEmail = TestDataGenerator.generateRandomEmailAddress(10);
        registerPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid user generated register input data (too long display name): " + "\n");

        logger.info("Too long user generated display name: " + tooLongRegisterDisplayName);
        logger.info("Valid user generated email (too long display name): " + registerEmail);
        logger.info("Valid user generated password (too long display name): " + registerPassword);
        logger.info("Valid user matching confirm password (too long display name): " + registerPassword);

        System.out.println("\n");

    }

    //invalid user register input data getter - too long email (100 chars -> name, domain)
    public void invalidRegisterInputDataTooLongEmailGetter(){

        registerDisplayName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        tooLongRegisterEmail = TestDataGenerator.generateRandomTooLongEmailAddress(100);
        registerPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid user generated register input data (too long email): " + "\n");

        logger.info("Valid user generated display name (too long email): " + registerDisplayName);
        logger.info("Too long user generated email: " + tooLongRegisterEmail);
        logger.info("Valid user generated password (too long email): " + registerPassword);
        logger.info("Valid user matching confirm password (too long email): " + registerPassword);

        System.out.println("\n");

    }

    //invalid user register input data getter - too long register password (21 chars)
    public void invalidRegisterInputDataTooLongPasswordGetter(){

        registerDisplayName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        registerEmail = TestDataGenerator.generateRandomEmailAddress(6);
        tooLongRegisterPassword = "@$5trfddterWRE235@@dE";

        System.out.println("Invalid user generated register input data (too long password): " + "\n");

        logger.info("Valid user generated display name (too long password): " + registerDisplayName);
        logger.info("Valid user generated email (too long password): " + noRegisterEmail);
        logger.info("Too long user generated password: " + tooLongRegisterPassword);
        logger.info("Too long matching user generated confirm password: " + tooLongRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input methods - too long singular input
    public void inputTooLongDisplayNameIntoDisplayNameInputField(){registerPageDisplayNameInputField.fill(tooLongRegisterDisplayName);}
    public void inputTooLongEmailIntoEmailInputField(){registerPageEmailInputField.fill(tooLongRegisterEmail);}
    public void inputTooLongPasswordIntoPasswordInputField(){registerPagePasswordInputField.fill(tooLongRegisterPassword);}
    public void inputTooLongConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.fill(tooLongRegisterPassword);}

    //invalid user register input data getter - invalid display name input format (special symbols only)
    public void invalidRegisterInputDataInvalidDisplayNameFormatGetter(){

        invalidRegisterDisplayNameFormat = "@@!$@#$ @$@#$#";
        registerEmail = TestDataGenerator.generateRandomEmailAddress(10);
        registerPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid user generated register input data (invalid display name input format): " + "\n");

        logger.info("Invalid user generated display name input format: " + tooLongRegisterDisplayName);
        logger.info("Valid user generated email (invalid display name input format): " + registerEmail);
        logger.info("Valid user generated password (invalid display name input format): " + registerPassword);
        logger.info("Valid user matching confirm password (invalid display name input format): " + registerPassword);

        System.out.println("\n");

    }

    //invalid user register input data getter - invalid email input format (missing '@')
    public void invalidRegisterInputDataInvalidEmailFormatGetter(){

        registerDisplayName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        invalidRegisterEmailFormat = "sdsfdfakemail.com";
        registerPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid user generated register input data (invalid email input format): " + "\n");

        logger.info("Valid user generated display name (invalid email input format): " + registerDisplayName);
        logger.info("Invalid user generated email input format: " + invalidRegisterEmailFormat);
        logger.info("Valid user generated password (invalid email input format): " + registerPassword);
        logger.info("Valid user matching confirm password (invalid email input format): " + registerPassword);

        System.out.println("\n");

    }

    //invalid user register input data getter - existing email (used beforehand in manual testing)
    public void invalidRegisterInputDataExistingEmailGetter(){

        registerDisplayName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        existingRegisterEmail = "m0@example.com";
        registerPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid user generated register input data (existing email): " + "\n");

        logger.info("Valid user generated display name (existing email): " + registerDisplayName);
        logger.info("Existing user generated email: " + existingRegisterEmail);
        logger.info("Valid user generated password (existing email): " + registerPassword);
        logger.info("Valid user matching confirm password (existing email): " + registerPassword);

        System.out.println("\n");

    }

    //invalid user register input data getter - mismatching confirm password
    public void invalidRegisterInputDataMismatchConfirmPasswordGetter(){

        registerDisplayName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        registerEmail = TestDataGenerator.generateRandomEmailAddress(6);
        registerPassword = TestDataGenerator.generateRandomPassword();
        mismatchingConfirmRegisterPassword = "FDDg2$23DS";

        System.out.println("Invalid user generated register input data (mismatching confirm password): " + "\n");

        logger.info("Valid user generated display name (mismatching confirm password): " + registerDisplayName);
        logger.info("Valid user generated email (mismatching confirm password): " + registerEmail);
        logger.info("Valid user generated password (mismatching confirm password): " + registerPassword);
        logger.info("Mismatching user generated confirm password: " + mismatchingConfirmRegisterPassword);

        System.out.println("\n");

    }

    //invalid register data input methods - invalid singular input format
    public void inputInvalidDisplayNameFormatIntoDisplayNameInputField(){registerPageDisplayNameInputField.fill(invalidRegisterDisplayNameFormat);}
    public void inputInvalidEmailFormatIntoEmailInputField(){registerPageEmailInputField.fill(invalidRegisterEmailFormat);}
    public void inputExistingEmailIntoEmailInputField(){registerPageEmailInputField.fill(existingRegisterEmail);}
    public void inputMismatchingConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.fill(mismatchingConfirmRegisterPassword);}

    //valid register data input methods (for remaining inputs)
    public void inputDisplayNameIntoDisplayNameInputField(){registerPageDisplayNameInputField.fill(registerDisplayName);}
    public void inputEmailIntoEmailInputField(){registerPageEmailInputField.fill(registerEmail);}
    public void inputPasswordIntoPasswordInputField(){registerPagePasswordInputField.fill(registerPassword);}
    public void inputConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.fill(registerPassword);}

}
