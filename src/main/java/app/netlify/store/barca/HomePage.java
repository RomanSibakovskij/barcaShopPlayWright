package app.netlify.store.barca;

import app.netlify.store.barca.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.stream.*;
import java.util.*;

public class HomePage extends BasePage {

    //home page web elements
    //main
    private Locator homePageTitle;
    private Locator homePageSubtitle;
    //list elements
    private Locator homePageShopNowImgElements;
    private Locator homePageShopNowCategoryBtnElements;
    private Locator homePageShopNowCategoryTitleElements;
    private Locator homePageShopNowTxtElements;
    //notice section
    private Locator homePageNoticeSectionTitle;
    private Locator homePageNoticeText;
    //footer
    private Locator homePageFooterDevelopedByText;

    public HomePage(Page page) {
        super(page);

        //main
        homePageTitle = page.locator("//main/div[1]//p[1]");
        homePageSubtitle = page.locator("//main/div[1]//p[2]");
        //list elements
        homePageShopNowImgElements = page.locator("//main//div[@class='w-11/12 md:w-full m-auto md:m-0 flex flex-wrap justify-between']/div/div[1]");
        homePageShopNowCategoryBtnElements = page.locator("//main//div[@class='w-11/12 md:w-full m-auto md:m-0 flex flex-wrap justify-between']/div/div[2]");
        homePageShopNowCategoryTitleElements = page.locator("//main//div[@class='w-11/12 md:w-full m-auto md:m-0 flex flex-wrap justify-between']/div//h2");
        homePageShopNowTxtElements = page.locator("//main//div[@class='w-11/12 md:w-full m-auto md:m-0 flex flex-wrap justify-between']/div//p");
        //notice section
        homePageNoticeSectionTitle = page.locator("//div[@class='w-11/12 md:w-8/12 h-auto border-2 border-gray-900 my-16 m-auto text-center px-4 rounded-xl']/h1");
        homePageNoticeText = page.locator("//div[@class='w-11/12 md:w-8/12 h-auto border-2 border-gray-900 my-16 m-auto text-center px-4 rounded-xl']/p");
        //footer
        homePageFooterDevelopedByText = page.locator("//footer/p");

    }

    //click set home page category button method
    public void clickSetHomePageCategoryBtn(int index){
        int count = homePageShopNowCategoryBtnElements.count();
        if (index >= 0 && index < count) {
            homePageShopNowCategoryBtnElements.nth(index).click();
        }
    }

    //home page text element getters
    //main
    public String getHomePageTitle() {return homePageTitle.innerText();}
    public String getHomePageSubtitle() {return homePageSubtitle.innerText();}
    //list elements
    public List<String> getHomePageShopNowCategoryTitleElements() {
        int count = homePageShopNowCategoryTitleElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageShopNowCategoryTitleElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageShopNowTxtElements() {
        int count = homePageShopNowTxtElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageShopNowTxtElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //notice section
    public String getHomePageNoticeSectionTitle() {return homePageNoticeSectionTitle.innerText();}
    public String getHomePageNoticeText() {return homePageNoticeText.innerText();}
    //footer
    public String getHomePageFooterDevelopedByText() {return homePageFooterDevelopedByText.innerText();}

    //home page web element assert methods
    //main
    public boolean isHomePageTitleVisible() {return homePageTitle.isVisible();}
    public boolean isHomePageSubtitleVisible() {return homePageSubtitle.isVisible();}
    //list elements
    public boolean isHomePageShopNowImgElementsVisible() {
        int count = homePageShopNowImgElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> homePageShopNowImgElements.nth(i).isVisible());
    }
    public boolean isHomePageShopNowCategoryBtnElementsVisible() {
        int count = homePageShopNowCategoryBtnElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> homePageShopNowCategoryBtnElements.nth(i).isVisible());
    }
    public boolean isHomePageShopNowCategoryTitleElementsVisible() {
        int count = homePageShopNowCategoryTitleElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> homePageShopNowCategoryTitleElements.nth(i).isVisible());
    }
    public boolean isHomePageShopNowTxtElementsVisible() {
        int count = homePageShopNowTxtElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> homePageShopNowTxtElements.nth(i).isVisible());
    }
    //notice section
    public boolean isHomePageNoticeSectionTitleVisible() {return homePageNoticeSectionTitle.isVisible();}
    public boolean isHomePageNoticeTextVisible() {return homePageNoticeText.isVisible();}
    //footer
    public boolean isHomePageFooterDevelopedByTextVisible() {return homePageFooterDevelopedByText.isVisible();}

}