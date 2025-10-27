package app.netlify.store.barca.page.web.element.assertion;

import app.netlify.store.barca.*;
import app.netlify.store.barca.modules.ShoppingCartModal;
import com.microsoft.playwright.Page;

import static org.junit.jupiter.api.Assertions.*;

public interface PageWebElementAsserts {

    //general page web element assert test method
    default void isGeneralPageWebElementVisible(Page page) {
        GeneralPage generalPage = new GeneralPage(page);
        //header
        //assert the header home page logo link is visible
        assertTrue(generalPage.isHeaderHomePageLogoLinkVisible(), "The general page header home page logo link isn't visible");
        //assert the header navbar shop link is visible
        assertTrue(generalPage.isHeaderNavbarShopLinkVisible(), "The general page header navbar shop link isn't visible");
        //assert the header navbar sign in link is visible
        assertTrue(generalPage.isHeaderNavbarSignInLinkVisible(), "The general page header navbar sign in link isn't visible");
        //assert the header navbar shopping cart button is visible
        //assertTrue(generalPage.isHeaderNavbarShopCartBtnVisible(), "The general page header navbar shopping cart button isn't visible");
        //assert the header navbar item count is visible
        assertTrue(generalPage.isHeaderNavbarItemCountVisible(), "The general page header navbar item count isn't visible");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page web element assert test method
    default void isHomePageWebElementVisible(Page page) {
        HomePage homePage = new HomePage(page);
        //main
        //assert the home page title is visible
        assertTrue(homePage.isHomePageTitleVisible(), "The home page title isn't visible");
        //assert the home page subtitle is visible
        assertTrue(homePage.isHomePageSubtitleVisible(), "The home page subtitle isn't visible");
        //list elements
        //assert the home page shop now images are visible (as a list)
        assertTrue(homePage.isHomePageShopNowImgElementsVisible(), "The home page shop now images aren't visible");
        //assert the home page shop now category buttons are visible (as a list)
        assertTrue(homePage.isHomePageShopNowCategoryBtnElementsVisible(), "The home page shop now category buttons aren't visible");
        //assert the home page shop now category title are visible (as a list)
        assertTrue(homePage.isHomePageShopNowCategoryTitleElementsVisible(), "The home page shop now category title aren't visible");
        //assert the home page shop now texts are visible (as a list)
        assertTrue(homePage.isHomePageShopNowTxtElementsVisible(), "The home page shop now texts aren't visible");
        //notice section
        //assert the home page notice section title is visible
        assertTrue(homePage.isHomePageNoticeSectionTitleVisible(), "The home page notice section title isn't visible");
        //assert the home page notice text is visible
        assertTrue(homePage.isHomePageNoticeTextVisible(), "The home page notice text isn't visible");
        //footer
        //assert the home page footer developed by text is visible
        assertTrue(homePage.isHomePageFooterDevelopedByTextVisible(), "The home page footer developed by text isn't visible");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //login page web element assert test method
    default void isLoginPageWebElementVisible(Page page) {
        LoginPage loginPage = new LoginPage(page);
        //assert the login page title is visible
        assertTrue(loginPage.isLoginPageTitleVisible(), "The login page title isn't visible");
        //input form
        //assert the login page email subtext is visible
        assertTrue(loginPage.isLoginPageEmailSubtextVisible(), "The login page email subtext isn't visible");
        //assert the login page email input field is visible
        assertTrue(loginPage.isLoginPageEmailInputFieldVisible(), "The login page email input field isn't visible");
        //assert the login page password subtext is visible
        assertTrue(loginPage.isLoginPagePasswordSubtextVisible(), "The login page password subtext isn't visible");
        //assert the login page password input field is visible
        assertTrue(loginPage.isLoginPagePasswordInputFieldVisible(), "The login page password input field isn't visible");
        //buttons
        //assert the login page sign in button is visible
        assertTrue(loginPage.isLoginPageSignInButtonVisible(), "The login page sign in button isn't visible");
        //assert the login page google sign in button is visible
        assertTrue(loginPage.isLoginPageGoogleSignInButtonVisible(), "The login page google sign in button isn't visible");
        //assert the login page account offer text is visible
        assertTrue(loginPage.isLoginPageAccountTextVisible(), "The login page account offer text isn't visible");
        //assert the login page sign up link is visible
        assertTrue(loginPage.isLoginPageSignUpLinkVisible(), "The login page sign up link isn't visible");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //register page web element assert test method
    default void isRegisterPageWebElementVisible(Page page) {
        RegisterPage registerPage = new RegisterPage(page);
        //assert the register page title is visible
        assertTrue(registerPage.isRegisterPageTitleVisible(), "The register page title isn't visible");
        //input form
        //assert the register page full name subtext is visible
        assertTrue(registerPage.isRegisterPageDisplayNameSubtextVisible(), "The register page full name subtext isn't visible");
        //assert the register page full name input field is visible
        assertTrue(registerPage.isRegisterPageDisplayNameInputFieldVisible(), "The register page full name input field isn't visible");
        //assert the register page email subtext is visible
        assertTrue(registerPage.isRegisterPageEmailSubtextVisible(), "The register page email subtext isn't visible");
        //assert the register page email input field is visible
        assertTrue(registerPage.isRegisterPageEmailInputFieldVisible(), "The register page email input field isn't visible");
        //assert the register page password subtext is visible
        assertTrue(registerPage.isRegisterPagePasswordSubtextVisible(), "The register page password subtext isn't visible");
        //assert the register page password input field is visible
        assertTrue(registerPage.isRegisterPagePasswordInputFieldVisible(), "The register page password input field isn't visible");
        //assert the register page confirm password subtext is visible
        assertTrue(registerPage.isRegisterPageConfirmPasswordSubtextVisible(), "The register page confirm password subtext isn't visible");
        //assert the register page confirm password input field is visible
        assertTrue(registerPage.isRegisterPageConfirmPasswordInputFieldVisible(), "The register page confirm password input field isn't visible");
        //button
        //assert the register page sign up button is visible
        assertTrue(registerPage.isRegisterPageSignUpButtonVisible(), "The register page sign up button isn't visible");
        //assert the register page sign in offer text is visible
        assertTrue(registerPage.isRegisterPageSignInTextVisible(), "The register page sign in offer text isn't visible");
        //assert the register page sign in link is visible
        assertTrue(registerPage.isRegisterPageSignInLinkVisible(), "The register page sign in link isn't visible");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shop dashboard page web element assert test method
    default void isShopDashPageWebElementVisible(Page page){
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);
        //coaches category section
        //assert the shop dashboard page coaches section title is visible
        assertTrue(shopDashboardPage.isShopDashPageCoachesSectionTitleVisible(), "The shop dashboard page coaches section title isn't visible.");
        //list elements
        //assert the shop dashboard page coach images are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageCoachesImgElementVisible(), "The shop dashboard page coach images aren't visible.");
        //assert the shop dashboard page coach add to cart buttons are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageCoachesAddToCartBtnElementVisible(), "The shop dashboard page coach add to cart buttons aren't visible.");
        //assert the shop dashboard page coach names are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageCoachesNameElementVisible(), "The shop dashboard page coach names aren't visible.");
        //assert the shop dashboard page coach prices are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageCoachesPriceElementVisible(), "The shop dashboard page coach prices aren't visible.");
        //defenders category section
        //assert the shop dashboard page defenders section title is visible
        assertTrue(shopDashboardPage.isShopDashPageDefendersSectionTitleVisible(), "The shop dashboard page defenders section title isn't visible.");
        //list elements
        //assert the shop dashboard page defenders images are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageDefendersImgElementVisible(), "The shop dashboard page defenders images aren't visible.");
        //assert the shop dashboard page defenders add to cart buttons are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageDefendersAddToCartBtnElementVisible(), "The shop dashboard page defenders add to cart buttons aren't visible.");
        //assert the shop dashboard page defenders names are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageDefendersNameElementVisible(), "The shop dashboard page defenders names aren't visible.");
        //assert the shop dashboard page defenders prices are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageDefendersPriceElementVisible(), "The shop dashboard page defenders prices aren't visible.");
        //forwards category section
        //assert the shop dashboard page forwards section title is visible
        assertTrue(shopDashboardPage.isShopDashPageForwardsSectionTitleVisible(), "The shop dashboard page forwards section title isn't visible.");
        //list elements
        //assert the shop dashboard page forwards images are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageForwardsImgElementVisible(), "The shop dashboard page forwards images aren't visible.");
        //assert the shop dashboard page forwards add to cart buttons are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageForwardsAddToCartBtnElementVisible(), "The shop dashboard page forwards add to cart buttons aren't visible.");
        //assert the shop dashboard page forwards names are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageForwardsNameElementVisible(), "The shop dashboard page forwards names aren't visible.");
        //assert the shop dashboard page forwards prices are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageForwardsPriceElementVisible(), "The shop dashboard page forwards prices aren't visible.");
        //goalkeepers category section
        //assert the shop dashboard page goalkeepers section title is visible
        assertTrue(shopDashboardPage.isShopDashPageGoalKeepersSectionTitleVisible(), "The shop dashboard page goalkeepers section title isn't visible.");
        //list elements
        //assert the shop dashboard page goalkeepers images are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageGoalKeepersImgElementVisible(), "The shop dashboard page goalkeepers images aren't visible.");
        //assert the shop dashboard page goalkeepers add to cart buttons are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageGoalKeepersAddToCartBtnElementVisible(), "The shop dashboard page goalkeepers add to cart buttons aren't visible.");
        //assert the shop dashboard page goalkeepers names are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageGoalKeepersNameElementVisible(), "The shop dashboard page goalkeepers names aren't visible.");
        //assert the shop dashboard page goalkeepers prices are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageGoalKeepersPriceElementVisible(), "The shop dashboard page goalkeepers prices aren't visible.");
        //midfielders category section
        //assert the shop dashboard page midfielders section title is visible
        assertTrue(shopDashboardPage.isShopDashPageMidFieldersSectionTitleVisible(), "The shop dashboard page midfielders section title isn't visible.");
        //list elements
        //assert the shop dashboard page midfielders images are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageMidFieldersImgElementVisible(), "The shop dashboard page midfielders images aren't visible.");
        //assert the shop dashboard page midfielders add to cart buttons are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageMidFieldersAddToCartBtnElementVisible(), "The shop dashboard page midfielders add to cart buttons aren't visible.");
        //assert the shop dashboard page midfielders names are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageMidFieldersNameElementVisible(), "The shop dashboard page midfielders names aren't visible.");
        //assert the shop dashboard page midfielders prices are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashPageMidFieldersPriceElementVisible(), "The shop dashboard page midfielders prices aren't visible.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shopping cart modal web element assert test method
    default void isShoppingCartModalWebElementVisible(Page page) {
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        //list elements
        //assert the shopping cart modal product images are visible (as a list)
        assertTrue(shoppingCartModal.isShoppingCartModalProductImgElementVisible(), "The shopping cart modal product images aren't visible.");
        //assert the shopping cart modal product names are visible (as a list)
        assertTrue(shoppingCartModal.isShoppingCartModalProductNameElementVisible(), "The shopping cart modal product names aren't visible.");
        //assert the shopping cart modal product quantities and prices (same string) are visible (as a list)
        assertTrue(shoppingCartModal.isShoppingCartModalProductQtyPriceElementVisible(), "The shopping cart modal product quantities and prices aren't visible.");
        //button
        //assert the shopping cart modal go to check out button is visible
        assertTrue(shoppingCartModal.isShoppingCartModalGoToCheckoutBtnVisible(), "The shopping cart modal go to checkout button isn't visible.");
    }

    //empty shopping cart modal web element assert test method
    default void isEmptyShoppingCartModalWebElementVisible(Page page) {
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);
        //button
        //assert the shopping cart modal go to check out button is visible
        assertTrue(shoppingCartModal.isShoppingCartModalGoToCheckoutBtnVisible(), "The shopping cart modal go to checkout button isn't visible.");
        //empty shopping cart message
        //assert the empty shopping cart modal message is visible
        assertTrue(shoppingCartModal.isEmptyShoppingCartModalMessageVisible(), "The empty shopping cart modal message isn't visible.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //checkout page web element assert test method
    default void isCheckoutPageWebElementVisible(Page page) {
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page title is visible
        assertTrue(checkoutPage.isCheckoutPageTitleVisible(), "The checkout page title isn't visible.");
        //product table
        //assert the checkout page product subtext is visible
        assertTrue(checkoutPage.isCheckoutPageProductSubtextVisible(), "The checkout page product subtext isn't visible.");
        //assert the checkout page description subtext is visible
        assertTrue(checkoutPage.isCheckoutPageDescSubtextVisible(), "The checkout page description subtext isn't visible.");
        //assert the checkout page quantity subtext is visible
        assertTrue(checkoutPage.isCheckoutPageQuantitySubtextVisible(), "The checkout page quantity subtext isn't visible.");
        //assert the checkout page price subtext is visible
        assertTrue(checkoutPage.isCheckoutPagePriceSubtextVisible(), "The checkout page price subtext isn't visible.");
        //assert the checkout page remove subtext is visible
        assertTrue(checkoutPage.isCheckoutPageRemoveSubtextVisible(), "The checkout page remove subtext isn't visible.");
        //list elements
        //assert the checkout page product images are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductImgElementVisible(), "The checkout page product images aren't visible.");
        //assert the checkout page product names are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductNameElementVisible(), "The checkout page product names aren't visible.");
        //assert the checkout page product quantity decrease buttons are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductQtyDecreaseBtnElementVisible(), "The checkout page product quantity decrease buttons aren't visible.");
        //assert the checkout page product quantities are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductQtyElementVisible(), "The checkout page product quantities aren't visible.");
        //assert the checkout page product quantity increase buttons are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductQtyIncreaseBtnElementVisible(), "The checkout page product quantity increase buttons aren't visible.");
        //assert the checkout page product prices are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductPriceElementVisible(), "The checkout page product prices aren't visible.");
        //assert the checkout page product remove buttons are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductRemoveBtnElementVisible(), "The checkout page product remove buttons aren't visible.");
        //summary
        //assert the checkout page total subtext and price are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageTotalSubtextAndPriceVisible(), "The checkout page total subtext and price aren't visible.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
