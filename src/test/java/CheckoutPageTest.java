import app.netlify.store.barca.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTest extends TestMethods{

    //single shop dashboard product checkout tests (since the checkout feature isn't implemented, other functionalities are being tested)

    // Test 007 -> single shop dashboard product ("Xavi Hernandez") checkout test (as a guest)
    @Test
    @DisplayName("Single Shop Dash Product (Xavi Hernandez) Checkout Test (as a guest)")
    @Tag("Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    void singleShopDashProductCheckoutGuestTest(){
        //add single shop dashboard product ("Xavi Hernandez") to shopping cart modal test (as a guest)
        addSingleProductToShopCartModalTest();
        //single shop dashboard product ("Xavi Hernandez") checkout test (as a guest)
        productCheckoutTest();
    }

    // Test 007a -> single shop dashboard product ("Jules Kound") checkout test (as a registered user)
    @Test
    @DisplayName("Single Shop Dash Product (Jules Kound) Checkout Test (as a registered user)")
    @Tag("Single_Product_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleShopDashProductCheckoutRegUserTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user login test
        validUserLoginTest();
        //add single shop dashboard product ("Jules Kound") to shopping cart modal test (as a registered user)
        addSingleProductToShopCartModalRegUserTest();
        //single shop dashboard product ("Jules Kound") checkout test (as a registered user)
        productCheckoutRegUserTest();
    }

    //multiple shop dashboard products checkout tests

    // Test 007b -> multiple shop dashboard products ("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres") checkout test (as a guest)
    @Test
    @DisplayName("Multiple Shop Dash Products (Xavi Hernandez, Oscar Hernandez, Marcos Alonso, Ferran Torres) Checkout Test (as a guest)")
    @Tag("Multiple_Products_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleShopDashProductsToCheckoutGuestTest(){
        //add multiple shop dashboard products ("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres") to shopping cart modal test (as a guest)
        addMultipleProductsToShopCartModalTest();
        //multiple shop dashboard products ("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres") checkout test (as a guest)
        productCheckoutTest();
    }

    // Test 007c -> multiple shop dashboard products ("Robert Lewandowski", "Marc-André ter Stegen", "Inaki Pena", "Ikay Gundogan") checkout test (as a registered user)
    @Test
    @DisplayName("Multiple Shop Dash Products (Jules Kound) To Shop Cart Modal Test (as a registered user)")
    @Tag("Multiple_Products_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleShopDashProductsCheckoutRegUserTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user login test
        validUserLoginTest();
        //add multiple shop dashboard products ("Robert Lewandowski", "Marc-André ter Stegen", "Inaki Pena", "Ikay Gundogan") to shopping cart modal test (as a registered user)
        addMultipleProductsToShopCartModalRegUserTest();
        //multiple shop dashboard products ("Robert Lewandowski", "Marc-André ter Stegen", "Inaki Pena", "Ikay Gundogan") checkout test (as a registered user)
        productCheckoutRegUserTest();
    }

    //update product quantity in checkout test

    // Test 008 -> update single shop dashboard product ("Xavi Hernandez") quantity in checkout page test (as a guest)
    @Test
    @DisplayName("Update Single Shop Dash Product (Xavi Hernandez) Quantity In Checkout Test (as a guest)")
    @Tag("Update_Product_Quantity")
    @Tag("Test_As_A_Guest")
    void updateSingleShopDashProductInCheckoutGuestTest(){
        //add single shop dashboard product ("Xavi Hernandez") to shopping cart modal test (as a guest)
        addSingleProductToShopCartModalTest();
        //update single shop dashboard product ("Xavi Hernandez") quantity in checkout page test (as a guest)
        updateProductQtyInCheckoutTest();
    }

    //remove product quantity from checkout test

    // Test 009 -> remove single shop dashboard product ("Xavi Hernandez") quantity from checkout page test (as a guest)
    @Test
    @DisplayName("Remove Single Shop Dash Product (Xavi Hernandez) Quantity From Checkout Test (as a guest)")
    @Tag("Remove_Product_From_Checkout")
    @Tag("Test_As_A_Guest")
    void removeSingleShopDashProductFromCheckoutGuestTest(){
        //add single shop dashboard product ("Xavi Hernandez") to shopping cart modal test (as a guest)
        addSingleProductToShopCartModalTest();
        //remove single shop dashboard product ("Xavi Hernandez") quantity from checkout page test (as a guest)
        removeSingleProductFromCheckoutPageTest();
    }

    // Test 009a -> remove multiple set shop dashboard products ("Xavi Hernandez", "Oscar Hernandez") from checkout test (as a guest)
    @Test
    @DisplayName("Remove Multiple Set Shop Dash Products (Xavi Hernandez, Oscar Hernandez) From Checkout Test (as a guest)")
    @Tag("Remove_Product_From_Checkout")
    @Tag("Test_As_A_Guest")
    void removeMultipleShopDashProductsFromCheckoutGuestTest(){
        //add multiple shop dashboard products ("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres") to shopping cart modal test (as a guest)
        addMultipleProductsToShopCartModalTest();
        //remove multiple set shop dashboard products ("Xavi Hernandez", "Oscar Hernandez") from checkout test (as a guest)
        removeSetProductsFromCheckoutPageTest();
    }

}