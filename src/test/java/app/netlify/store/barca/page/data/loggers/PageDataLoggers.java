package app.netlify.store.barca.page.data.loggers;

import app.netlify.store.barca.*;
import app.netlify.store.barca.modules.ShoppingCartModal;
import com.microsoft.playwright.Page;

import org.slf4j.*;

public interface PageDataLoggers {

    Logger logger = LoggerFactory.getLogger(PageDataLoggers.class);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page product count data logger method
    default void logGeneralPageProductCountData(Page page){
        GeneralPage generalPage = new GeneralPage(page);

        System.out.println("Header navbar shopping cart modal displayed product count data: " + "\n");

        logger.info("Displayed shopping cart button product count: " + generalPage.getHeaderNavbarItemCount());

        System.out.println("\n");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shop dashboard page product data logger method
    default void logShopDashPageProductData(Page page) {
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);

        System.out.println("Shop dashboard page displayed product data: " + "\n");

        System.out.println("Shop dashboard page coaches section product data: " + "\n");

        logger.info("Shop dashboard page displayed coaches (image) product name(s): " + shopDashboardPage.getShopDashPageCoachesName());
        logger.info("Shop dashboard page displayed coaches (image) product unit price(s): " + shopDashboardPage.getShopDashPageCoachesPrice() + "\n");

        System.out.println("Shop dashboard page defenders section product data: " + "\n");

        logger.info("Shop dashboard page displayed defenders (image) product name(s): " + shopDashboardPage.getShopDashPageDefendersName());
        logger.info("Shop dashboard page displayed defenders (image) product unit price(s): " + shopDashboardPage.getShopDashPageDefendersPrice() + "\n");

        System.out.println("Shop dashboard page forwards section product data: " + "\n");

        logger.info("Shop dashboard page displayed forwards (image) product name(s): " + shopDashboardPage.getShopDashPageForwardsName());
        logger.info("Shop dashboard page displayed forwards (image) product unit price(s): " + shopDashboardPage.getShopDashPageForwardsPrice() + "\n");

        System.out.println("Shop dashboard page goalkeepers section product data: " + "\n");

        logger.info("Shop dashboard page displayed goalkeepers (image) product name(s): " + shopDashboardPage.getShopDashPageGoalKeepersName());
        logger.info("Shop dashboard page displayed goalkeepers (image) product unit price(s): " + shopDashboardPage.getShopDashPageGoalKeepersPrice() + "\n");

        System.out.println("Shop dashboard page midfielders section product data: " + "\n");

        logger.info("Shop dashboard page displayed midfielders (image) product name(s): " + shopDashboardPage.getShopDashPageMidFieldersName());
        logger.info("Shop dashboard page displayed midfielders (image) product unit price(s): " + shopDashboardPage.getShopDashPageMidFieldersPrice());

        System.out.println("\n");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shopping cart modal product data logger method
    default void logShopCartModalProductData(Page page) {
        ShoppingCartModal shoppingCartModal = new ShoppingCartModal(page);

        System.out.println("Shopping cart modal displayed product data: " + "\n");

        logger.info("Shopping cart modal displayed product name(s): " + shoppingCartModal.getShopCartModalProductName());
        logger.info("Shopping cart modal displayed product quantity(ies): " + shoppingCartModal.getShopCartModalProductQty());
        logger.info("Shopping cart modal displayed product unit price(s): " + shoppingCartModal.getShopCartModalProductPrice());

        System.out.println("\n");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //checkout page product data logger method
    default void logCheckoutPageProductData(Page page) {
        CheckoutPage checkoutPage = new CheckoutPage(page);

        System.out.println("Checkout page displayed product data: " + "\n");

        logger.info("Checkout page displayed product name(s): " + checkoutPage.getCheckoutPageProductName());
        logger.info("Checkout page displayed product quantity(ies): " + checkoutPage.getCheckoutPageProductQty());
        logger.info("Checkout page displayed product unit price(s): " + checkoutPage.getCheckoutPageProductUnitPrice());
        logger.info("Checkout page displayed total order price(s): " + checkoutPage.getCheckoutPageTotalPrice());

        System.out.println("\n");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
