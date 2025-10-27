package app.netlify.store.barca.page.text.element.assertion;

import app.netlify.store.barca.*;
import app.netlify.store.barca.modules.ShoppingCartModal;
import com.microsoft.playwright.Page;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public interface PageTextElementAsserts {

    //general page text element assert test method
    default void isGeneralPageTextElementAsExpected(Page page){
        GeneralPage generalPage = new GeneralPage(page);
        //header
        //assert the header home page logo link text is as expected
        assertEquals("BARCA", generalPage.getHeaderHomePageLogoLinkText(), "The general page header logo link text doesn't match expectations.");
        //assert the header navbar shop link text is as expected
        assertEquals("SHOP", generalPage.getHeaderNavbarShopLinkText(), "The general page header navbar shop link text doesn't match expectations.");
        //assert the header navbar sign-in link text is as expected
        assertEquals("SIGN IN", generalPage.getHeaderNavbarSignInText(), "The general page header navbar sign-in link text doesn't match expectations.");
    }

    //general page (registered user) text element assert test method
    default void isGeneralPageRegUserTextElementAsExpected(Page page){
        GeneralPage generalPage = new GeneralPage(page);
        //header
        //assert the header home page logo link text is as expected
        assertEquals("BARCA", generalPage.getHeaderHomePageLogoLinkText(), "The general page header logo link text doesn't match expectations.");
        //assert the header navbar shop link text is as expected
        assertEquals("SHOP", generalPage.getHeaderNavbarShopLinkText(), "The general page header navbar shop link text doesn't match expectations.");
        //assert the header navbar sign-out link text is as expected (same element as "Sign In" link)
        assertEquals("SIGN OUT", generalPage.getHeaderNavbarSignInText(), "The general page header navbar sign-out link text doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page text element assert test method
    default void isHomePageTextElementAsExpected(Page page){
        HomePage homePage = new HomePage(page);
        //main
        //assert the home page title is as expected
        assertEquals("FC BARCELONA", homePage.getHomePageTitle(), "The home page title doesn't match expectations.");
        //assert the home page subtitle is as expected
        assertEquals("Original Paintings and Fine Art Prints of FC Barcelona", homePage.getHomePageSubtitle(), "The home page subtitle doesn't match expectations.");
        //list elements
        //assert the home page shop now category titles are as expected (as a list)
        List<String> homePageShopNowCategoryTitles = Arrays.asList("FORWARDS", "MIDFIELDERS", "DEFENDERS", "GOALKEEPERS", "COACHES");
        List<String> actualHomePageShopNowCategoryTitles = homePage.getHomePageShopNowCategoryTitleElements();
        assertEquals(homePageShopNowCategoryTitles, actualHomePageShopNowCategoryTitles, "The home page shop now category titles don't match expectations.");
        //assert the home page shop now texts are as expected (as a list)
        List<String> homePageShopNowTexts = Arrays.asList("Shop Now", "Shop Now", "Shop Now", "Shop Now", "Shop Now");
        List<String> actualHomePageShopNowTexts = homePage.getHomePageShopNowTxtElements();
        assertEquals(homePageShopNowTexts, actualHomePageShopNowTexts, "The home page shop now category texts don't match expectations.");
        //notice section
        //assert the home page notice section title is as expected
        assertEquals("Notice \uD83D\uDC47\uD83D\uDC47", homePage.getHomePageNoticeSectionTitle(), "The home page notice section title doesn't match expectations.");
        //assert the home page notice text is as expected
        assertEquals("This is not the real website of FC BARCELONA,This is just a demo project created just for learning purpose only.", homePage.getHomePageNoticeText(), "The home page notice text doesn't match expectations.");
        //footer
        //assert the home page footer developed by text is as expected
        assertEquals("Designed By HadesCodes", homePage.getHomePageFooterDevelopedByText(), "The home page footer developed by text doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //login page text element assert test method
    default void isLoginPageTextElementAsExpected(Page page){
        LoginPage loginPage = new LoginPage(page);
        //assert the login page title is as expected
        assertEquals("Sign-In Form", loginPage.getLoginPageTitle(), "The login page title doesn't match expectations.");
        //input form
        //assert the login page email subtext is as expected
        assertEquals("Email", loginPage.getLoginPageEmailSubtext(), "The login page email subtext doesn't match expectations.");
        //assert the login page password subtext is as expected
        assertEquals("Password", loginPage.getLoginPagePasswordSubtext(), "The login page password subtext doesn't match expectations.");
        //buttons
        //assert the login page sign in button text is as expected
        assertEquals("SIGN IN", loginPage.getLoginPageSignInButtonText(), "The login page sign in button text doesn't match expectations.");
        //assert the login page google sign in button text is as expected
        assertEquals("SIGN IN WITH GOOGLE", loginPage.getLoginPageGoogleSignInButtonText(), "The login page google sign in button text doesn't match expectations.");
        //assert the login page account offer text is as expected
        assertEquals("Don't have an account?", loginPage.getLoginPageAccountText(), "The login page account offer text doesn't match expectations.");
        //assert the login page sign up link text is as expected
        assertEquals("Sign up", loginPage.getLoginPageSignUpLinkText(), "The login page sign up link text doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //register page text element assert test method
    default void isRegisterPageTextElementAsExpected(Page page){
        RegisterPage registerPage = new RegisterPage(page);
        //assert the register page title is as expected
        assertEquals("Sign-Up Form", registerPage.getRegisterPageTitle(), "The register page title doesn't match expectations.");
        //input form
        //assert the register page display name subtext is as expected
        assertEquals("Display Name", registerPage.getRegisterPageDisplayNameSubtext(), "The register page display name subtext doesn't match expectations.");
        //assert the register page email subtext is as expected
        assertEquals("Email", registerPage.getRegisterPageEmailSubtext(), "The register page email subtext doesn't match expectations.");
        //assert the register page password subtext is as expected
        assertEquals("Password", registerPage.getRegisterPagePasswordSubtext(), "The register page password subtext doesn't match expectations.");
        //assert the register page confirm password subtext is as expected
        assertEquals("Confirm Password*", registerPage.getRegisterPageConfirmPasswordSubtext(), "The register page confirm password subtext doesn't match expectations.");
        //button
        //assert the register page sign up button text is as expected
        assertEquals("SIGN UP", registerPage.getRegisterPageSignUpButtonText(), "The register page sign up button text doesn't match expectations.");
        //assert the register page sign in offer text is as expected
        assertEquals("Already have an account?", registerPage.getRegisterPageSignInText(), "The register page sign in offer text doesn't match expectations.");
        //assert the register page sign in link text is as expected
        assertEquals("Sign In", registerPage.getRegisterPageSignInLink(), "The register page sign in link text doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shop dashboard page text element assert test method
    default void isShopDashPageTextElementAsExpected(Page page){
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);
        //coaches category section
        //assert the shop dashboard page coaches category section title is as expected
        assertEquals("COACHES", shopDashboardPage.getShopDashPageCoachesSectionTitle(), "The shop dashboard page coaches section title doesn't match expectations.");
        //list elements
        //assert the shop dashboard page coaches add to cart button texts are as expected (as a list)
        List<String> actualShopDashPageCoachesAddToCartBtnTexts = shopDashboardPage.getShopDashPageCoachesAddToCartBtnText();
        for (String btnText : actualShopDashPageCoachesAddToCartBtnTexts) {
            assertEquals("ADD TO CART", btnText, "The shop dashboard page coaches 'Add to Cart' button texts don't match expectations.");
        }
        //defenders category section
        //assert the shop dashboard page defenders category section title is as expected
        assertEquals("DEFENDERS", shopDashboardPage.getShopDashPageDefendersSectionTitle(), "The shop dashboard page defenders section title doesn't match expectations.");
        //list elements
        //assert the shop dashboard page defenders add to cart button texts are as expected (as a list)
        List<String> actualShopDashPageDefendersAddToCartBtnTexts = shopDashboardPage.getShopDashPageDefendersAddToCartBtnText();
        for (String btnText : actualShopDashPageDefendersAddToCartBtnTexts) {
            assertEquals("ADD TO CART", btnText, "The shop dashboard page defenders 'Add to Cart' button texts don't match expectations.");
        }
        //forwards category section
        //assert the shop dashboard page forwards category section title is as expected
        assertEquals("FORWARDS", shopDashboardPage.getShopDashPageForwardsSectionTitle(), "The shop dashboard page forwards section title doesn't match expectations.");
        //list elements
        //assert the shop dashboard page forwards add to cart button texts are as expected (as a list)
        List<String> actualShopDashPageForwardsAddToCartBtnTexts = shopDashboardPage.getShopDashPageForwardsAddToCartBtnText();
        for (String btnText : actualShopDashPageForwardsAddToCartBtnTexts) {
            assertEquals("ADD TO CART", btnText, "The shop dashboard page forwards 'Add to Cart' button texts don't match expectations.");
        }
        //goalkeepers category section
        //assert the shop dashboard page goalkeepers category section title is as expected
        assertEquals("GOALKEEPERS", shopDashboardPage.getShopDashPageGoalKeepersSectionTitle(), "The shop dashboard page goalkeepers section title doesn't match expectations.");
        //list elements
        //assert the shop dashboard page goalkeepers add to cart button texts are as expected (as a list)
        List<String> actualShopDashPageGoalKeepersAddToCartBtnTexts = shopDashboardPage.getShopDashPageGoalKeepersAddToCartBtnText();
        for (String btnText : actualShopDashPageGoalKeepersAddToCartBtnTexts) {
            assertEquals("ADD TO CART", btnText, "The shop dashboard page goalkeepers 'Add to Cart' button texts don't match expectations.");
        }
        //midfielders category section
        //assert the shop dashboard page midfielders category section title is as expected
        assertEquals("MIDFIELDERS", shopDashboardPage.getShopDashPageMidFieldersSectionTitle(), "The shop dashboard page midfielders section title doesn't match expectations.");
        //list elements
        //assert the shop dashboard page midfielders add to cart button texts are as expected (as a list)
        List<String> actualShopDashPageMidFieldersAddToCartBtnTexts = shopDashboardPage.getShopDashPageMidFieldersAddToCartBtnText();
        for (String btnText : actualShopDashPageMidFieldersAddToCartBtnTexts) {
            assertEquals("ADD TO CART", btnText, "The shop dashboard page midfielders 'Add to Cart' button texts don't match expectations.");
        }
    }

    //shop dashboard page (coaches section) text element assert test method
    default void isShopDashPageRemoveCoachesFromCartTextElementAsExpected(Page page){
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);
        //coaches category section
        //assert the shop dashboard page coaches category section title is as expected
        assertEquals("COACHES", shopDashboardPage.getShopDashPageCoachesSectionTitle(), "The shop dashboard page coaches section title doesn't match expectations.");
        //list elements
        //assert the shop dashboard page coaches add to cart button texts are as expected (as a list)
        List<String> actualShopDashPageCoachesAddToCartBtnTexts = shopDashboardPage.getShopDashPageCoachesAddToCartBtnText();
        for (String btnText : actualShopDashPageCoachesAddToCartBtnTexts) {
            assertTrue(btnText.equals("ADD TO CART") || btnText.equals("REMOVE FROM CART"), "Unexpected button text found: " + btnText);
        }

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shopping cart modal text element assert test method
    default void isShoppingCartModalTextElementAsExpected(Page page){
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        //button
        //assert the shopping cart modal add to check out button text is as expected
        assertEquals("GO TO CHECKOUT", shoppingCartModal.getShoppingCartModalGoToCheckoutBtnText(), "The shopping cart modal go to checkout button text doesn't match expectations.");
    }

    //empty shopping cart modal text element assert test method
    default void isEmptyShoppingCartModalTextElementAsExpected(Page page){
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        //button
        //assert the shopping cart modal add to check out button text is as expected
        assertEquals("GO TO CHECKOUT", shoppingCartModal.getShoppingCartModalGoToCheckoutBtnText(), "The shopping cart modal go to checkout button text doesn't match expectations.");
        //empty shopping cart modal message
        //assert the empty shopping cart modal message text is as expected
        assertEquals("Your cart is empty", shoppingCartModal.getEmptyShoppingCartModalMessage(), "The empty shopping cart modal message text doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //checkout page text element assert test method
    default void isCheckoutPageTextElementAsExpected(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page title is as expected
        assertEquals("Checkout Page", checkoutPage.getCheckoutPageTitle(), "The checkout page title doesn't match expectations.");
        //product table
        //assert the checkout page product subtext is as expected
        assertEquals("Product", checkoutPage.getCheckoutPageProductSubtext(), "The checkout page product subtext doesn't match expectations.");
        //assert the checkout page description subtext is as expected
        assertEquals("Description", checkoutPage.getCheckoutPageDescSubtext(), "The checkout page description subtext doesn't match expectations.");
        //assert the checkout page quantity subtext is as expected
        assertEquals("Quantity", checkoutPage.getCheckoutPageQuantitySubtext(), "The checkout page quantity subtext doesn't match expectations.");
        //assert the checkout page price subtext is as expected
        assertEquals("Price", checkoutPage.getCheckoutPagePriceSubtext(), "The checkout page price subtext doesn't match expectations.");
        //assert the checkout page remove subtext is as expected
        assertEquals("Remove", checkoutPage.getCheckoutPageRemoveSubtext(), "The checkout page remove subtext doesn't match expectations.");
        //summary
        //assert the checkout page total subtext is as expected
        assertEquals("Total:", checkoutPage.getCheckoutPageTotalSubtext(), "The checkout page total subtext doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
