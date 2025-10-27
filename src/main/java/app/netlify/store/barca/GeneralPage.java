package app.netlify.store.barca;

import app.netlify.store.barca.utilities.BasePage;
import com.microsoft.playwright.*;

public class GeneralPage extends BasePage {

    //general page web elements
    //header
    private Locator headerHomePageLogoLink;
    private Locator headerNavbarShopLink;
    private Locator headerNavbarSignInLink;
    private Locator headerNavbarShopCartBtn;
    private Locator headerNavbarItemCount;

    public GeneralPage(Page page) {
        super(page);

        headerHomePageLogoLink = page.locator("//nav[@class='bg-[#fff] w-full h-14 flex justify-between items-center fixed top-0 px-5 md:px-10 z-50'][1]/a");
        headerNavbarShopLink = page.locator("//nav[@class='bg-[#fff] w-full h-14 flex justify-between items-center fixed top-0 px-5 md:px-10 z-50'][1]/ul/li/a");
        headerNavbarSignInLink = page.locator("//nav[@class='bg-[#fff] w-full h-14 flex justify-between items-center fixed top-0 px-5 md:px-10 z-50'][1]/ul/a");
        headerNavbarShopCartBtn = page.locator("//nav[@class='bg-[#fff] w-full h-14 flex justify-between items-center fixed top-0 px-5 md:px-10 z-50'][5]/ul/div");
        headerNavbarItemCount = page.locator("//nav[@class='bg-[#fff] w-full h-14 flex justify-between items-center fixed top-0 px-5 md:px-10 z-50'][1]/ul/div/span");

    }

    //click header "Shop" link method
    public void clickHeaderShopLink() {headerNavbarShopLink.click();}

    //click header "Sign In" link method
    public void clickHeaderSignInLink() {headerNavbarSignInLink.click();}

    //click header shopping cart button method
    public void clickHeaderShopCartBtn() {headerNavbarShopCartBtn.click();}

    //general page data getter
    public String getHeaderNavbarItemCount() {return headerNavbarItemCount.innerText();}

    //general page text element getters
    //header
    public String getHeaderHomePageLogoLinkText() {return headerHomePageLogoLink.innerText();}
    public String getHeaderNavbarShopLinkText() {return headerNavbarShopLink.innerText();}
    public String getHeaderNavbarSignInText() {return headerNavbarSignInLink.innerText();}

    //general page web element assert methods
    //header
    public boolean isHeaderHomePageLogoLinkVisible() {return headerHomePageLogoLink.isVisible();}
    public boolean isHeaderNavbarShopLinkVisible() {return headerNavbarShopLink.isVisible();}
    public boolean isHeaderNavbarSignInLinkVisible() {return headerNavbarSignInLink.isVisible();}
    //public boolean isHeaderNavbarShopCartBtnVisible() {return headerNavbarShopCartBtn.isVisible();} //due to 5 different similar navs in dom, the visual assert is ignored until the dom structure will be adequate
    public boolean isHeaderNavbarItemCountVisible() {return headerNavbarItemCount.isVisible();}

}