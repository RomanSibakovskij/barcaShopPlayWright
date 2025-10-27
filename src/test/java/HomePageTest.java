import app.netlify.store.barca.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods {

    //user navigation to register page test

    // Test 001 -> navigate to register page test
    @Test
    @DisplayName("Navigate To Register Page Test")
    @Tag("User_Navigation_To_Register_Page")
    void userNavigateToSignUpPageTest(){
        navigateToRegisterPageTest();
    }

}