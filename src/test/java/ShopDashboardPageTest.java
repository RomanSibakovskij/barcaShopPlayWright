import app.netlify.store.barca.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShopDashboardPageTest extends TestMethods{

    //add single shop dashboard product to shopping cart modal tests

    // Test 005 -> add single shop dashboard product ("Xavi Hernandez") to shopping cart modal test (as a guest)
    @Test
    @DisplayName("Add Single Shop Dash Product (Xavi Hernandez) To Shop Cart Modal Test (as a guest)")
    @Tag("Add_Single_Product_To_Shop_Cart_Modal")
    @Tag("Test_As_A_Guest")
    void addSingleShopDashProductToShopCartModalGuestTest(){
        //add single shop dashboard product ("Xavi Hernandez") to shopping cart modal test (as a guest)
        addSingleProductToShopCartModalTest();
    }

    // Test 005a -> add single shop dashboard product ("Jules Kound") to shopping cart modal test (as a registered user)
    @Test
    @DisplayName("Add Single Shop Dash Product (Jules Kound) To Shop Cart Modal Test (as a registered user)")
    @Tag("Add_Single_Product_To_Shop_Cart_Modal")
    @Tag("Test_As_A_Reg_User")
    void addSingleShopDashProductToShopCartModalRegUserTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user login test
        validUserLoginTest();
        //add single shop dashboard product ("Jules Kound") to shopping cart modal test (as a registered user)
        addSingleProductToShopCartModalRegUserTest();
    }

    //add multiple shop dashboard products to shopping cart modal tests

    // Test 005b -> add multiple shop dashboard products ("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres") to shopping cart modal test (as a guest)
    @Test
    @DisplayName("Add Multiple Shop Dash Products (Xavi Hernandez, Oscar Hernandez, Marcos Alonso, Ferran Torres) To Shop Cart Modal Test (as a guest)")
    @Tag("Add_Multiple_Products_To_Shop_Cart_Modal")
    @Tag("Test_As_A_Guest")
    void addMultipleShopDashProductsToShopCartModalGuestTest(){
        //add multiple shop dashboard products ("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres") to shopping cart modal test (as a guest)
        addMultipleProductsToShopCartModalTest();
    }

    // Test 005c -> add multiple shop dashboard products ("Robert Lewandowski", "Marc-André ter Stegen", "Inaki Pena", "Ikay Gundogan") to shopping cart modal test (as a registered user)
    @Test
    @DisplayName("Add Multiple Shop Dash Products (Jules Kound) To Shop Cart Modal Test (as a registered user)")
    @Tag("Add_Multiple_Products_To_Shop_Cart_Modal")
    @Tag("Test_As_A_Reg_User")
    void addMultipleShopDashProductsToShopCartModalRegUserTest(){
        //navigate to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user login test
        validUserLoginTest();
        //add multiple shop dashboard products ("Robert Lewandowski", "Marc-André ter Stegen", "Inaki Pena", "Ikay Gundogan") to shopping cart modal test (as a registered user)
        addMultipleProductsToShopCartModalRegUserTest();
    }

    //remove product(s) from shopping cart modal tests (since the registered user will have the same output, only guest branch is tested to avoid redundancy)

    // Test 006 -> remove single product ("Xavi Hernandez") from shopping cart modal test (as a guest)
    @Test
    @DisplayName("Remove Single Shop Dash Product (Xavi Hernandez) To Shop Cart Modal Test (as a guest)")
    @Tag("Remove_Single_Product_From_Shop_Cart_Modal")
    @Tag("Remove_Product")
    @Tag("Test_As_A_Guest")
    void removeSingleProductFromShopCartModalGuestTest(){
        //add single shop dashboard product ("Xavi Hernandez") to shopping cart modal test (as a guest)
        addSingleProductToShopCartModalTest();
        //remove single product ("Xavi Hernandez") from shopping cart modal test (as a guest)
        removeSingleProductFromShopCartModalTest();
    }

    // Test 006a -> remove multiple products ("Xavi Hernandez", "Oscar Hernandez") from shopping cart modal test (as a guest)
    @Test
    @DisplayName("Remove Multiple Shop Dash Products (Xavi Hernandez, Oscar Hernandez) To Shop Cart Modal Test (as a guest)")
    @Tag("Remove_Multiple_Products_From_Shop_Cart_Modal")
    @Tag("Remove_Product")
    @Tag("Test_As_A_Guest")
    void removeMultipleProductFromShopCartModalGuestTest(){
        //add multiple shop dashboard products ("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres") to shopping cart modal test (as a guest)
        addMultipleProductsToShopCartModalTest();
        //remove single product ("Xavi Hernandez", "Oscar Hernandez") from shopping cart modal test (as a guest)
        removeMultipleProductsFromShopCartModalTest();
    }

}