package app.netlify.store.barca;

import app.netlify.store.barca.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShopDashboardPage extends BasePage {

    //shop dashboard page web elements
    //coaches category section
    private Locator shopDashPageCoachesSectionTitle;
    //list elements
    private Locator shopDashPageCoachesImgElements;
    private Locator shopDashPageCoachesAddToCartBtnElements;
    private Locator shopDashPageCoachesNameElements;
    private Locator shopDashPageCoachesPriceElements;
    //defenders category section
    private Locator shopDashPageDefendersSectionTitle;
    //list elements
    private Locator shopDashPageDefendersImgElements;
    private Locator shopDashPageDefendersAddToCartBtnElements;
    private Locator shopDashPageDefendersNameElements;
    private Locator shopDashPageDefendersPriceElements;
    //forwards category section
    private Locator shopDashPageForwardsSectionTitle;
    //list elements
    private Locator shopDashPageForwardsImgElements;
    private Locator shopDashPageForwardsAddToCartBtnElements;
    private Locator shopDashPageForwardsNameElements;
    private Locator shopDashPageForwardsPriceElements;
    //goalkeepers category section
    private Locator shopDashPageGoalKeepersSectionTitle;
    //list elements
    private Locator shopDashPageGoalKeepersImgElements;
    private Locator shopDashPageGoalKeepersAddToCartBtnElements;
    private Locator shopDashPageGoalKeepersNameElements;
    private Locator shopDashPageGoalKeepersPriceElements;
    //midfielders category section
    private Locator shopDashPageMidFieldersSectionTitle;
    //list elements
    private Locator shopDashPageMidFieldersImgElements;
    private Locator shopDashPageMidFieldersAddToCartBtnElements;
    private Locator shopDashPageMidFieldersNameElements;
    private Locator shopDashPageMidFieldersPriceElements;


    public ShopDashboardPage(Page page) {
        super(page);

        //coaches category section
        shopDashPageCoachesSectionTitle = page.locator("//div[@class='w-full h-full'][1]//h2");
        //list elements
        shopDashPageCoachesImgElements = page.locator("//div[@class='w-full h-full'][1]//img");
        shopDashPageCoachesAddToCartBtnElements = page.locator("//div[@class='w-full h-full'][1]//button");
        shopDashPageCoachesNameElements = page.locator("//div[@class='w-full h-full'][1]//div[@class='w-full h-[5%] flex justify-between text-[18px] px-3']/span[1]");
        shopDashPageCoachesPriceElements = page.locator("//div[@class='w-full h-full'][1]//div[@class='w-full h-[5%] flex justify-between text-[18px] px-3']/span[2]");
        //defenders category section
        shopDashPageDefendersSectionTitle = page.locator("//div[@class='w-full h-full'][2]//h2");
        //list elements
        shopDashPageDefendersImgElements = page.locator("//div[@class='w-full h-full'][2]//img");
        shopDashPageDefendersAddToCartBtnElements = page.locator("//div[@class='w-full h-full'][2]//button");
        shopDashPageDefendersNameElements = page.locator("//div[@class='w-full h-full'][2]//div[@class='w-full h-[5%] flex justify-between text-[18px] px-3']/span[1]");
        shopDashPageDefendersPriceElements = page.locator("//div[@class='w-full h-full'][2]//div[@class='w-full h-[5%] flex justify-between text-[18px] px-3']/span[2]");
        //forwards category section
        shopDashPageForwardsSectionTitle = page.locator("//div[@class='w-full h-full'][3]//h2");
        //list elements
        shopDashPageForwardsImgElements = page.locator("//div[@class='w-full h-full'][3]//img");
        shopDashPageForwardsAddToCartBtnElements = page.locator("//div[@class='w-full h-full'][3]//button");
        shopDashPageForwardsNameElements = page.locator("//div[@class='w-full h-full'][3]//div[@class='w-full h-[5%] flex justify-between text-[18px] px-3']/span[1]");
        shopDashPageForwardsPriceElements = page.locator("//div[@class='w-full h-full'][3]//div[@class='w-full h-[5%] flex justify-between text-[18px] px-3']/span[2]");
        //goalkeepers category section
        shopDashPageGoalKeepersSectionTitle = page.locator("//div[@class='w-full h-full'][4]//h2");
        //list elements
        shopDashPageGoalKeepersImgElements = page.locator("//div[@class='w-full h-full'][4]//img");
        shopDashPageGoalKeepersAddToCartBtnElements = page.locator("//div[@class='w-full h-full'][4]//button");
        shopDashPageGoalKeepersNameElements = page.locator("//div[@class='w-full h-full'][4]//div[@class='w-full h-[5%] flex justify-between text-[18px] px-3']/span[1]");
        shopDashPageGoalKeepersPriceElements = page.locator("//div[@class='w-full h-full'][4]//div[@class='w-full h-[5%] flex justify-between text-[18px] px-3']/span[2]");
        //midfielders category section
        shopDashPageMidFieldersSectionTitle = page.locator("//div[@class='w-full h-full'][5]//h2");
        //list elements
        shopDashPageMidFieldersImgElements = page.locator("//div[@class='w-full h-full'][5]//img");
        shopDashPageMidFieldersAddToCartBtnElements = page.locator("//div[@class='w-full h-full'][5]//button");
        shopDashPageMidFieldersNameElements = page.locator("//div[@class='w-full h-full'][5]//div[@class='w-full h-[5%] flex justify-between text-[18px] px-3']/span[1]");
        shopDashPageMidFieldersPriceElements = page.locator("//div[@class='w-full h-full'][5]//div[@class='w-full h-[5%] flex justify-between text-[18px] px-3']/span[2]");

    }

    //click set coaches "Add to Cart" button method
    public void clickSetCoachesAddToCartBtn(int index) {
        int count = shopDashPageCoachesAddToCartBtnElements.count();
        if (index >= 0 && index < count) {
            shopDashPageCoachesAddToCartBtnElements.nth(index).click();
        }
    }

    //click set defenders "Add to Cart" button method
    public void clickSetDefendersAddToCartBtn(int index) {
        int count = shopDashPageDefendersAddToCartBtnElements.count();
        if (index >= 0 && index < count) {
            shopDashPageDefendersAddToCartBtnElements.nth(index).click();
        }
    }

    //click set forwards "Add to Cart" button method
    public void clickSetForwardsAddToCartBtn(int index) {
        int count = shopDashPageForwardsAddToCartBtnElements.count();
        if (index >= 0 && index < count) {
            shopDashPageForwardsAddToCartBtnElements.nth(index).click();
        }
    }

    //click set goalkeepers "Add to Cart" button method
    public void clickSetGoalKeepersAddToCartBtn(int index) {
        int count = shopDashPageGoalKeepersAddToCartBtnElements.count();
        if (index >= 0 && index < count) {
            shopDashPageGoalKeepersAddToCartBtnElements.nth(index).click();
        }
    }

    //click set midfielders "Add to Cart" button method
    public void clickSetMidfieldersAddToCartBtn(int index) {
        int count = shopDashPageMidFieldersAddToCartBtnElements.count();
        if (index >= 0 && index < count) {
            shopDashPageMidFieldersAddToCartBtnElements.nth(index).click();
        }
    }

    //shop dashboard page product data getters
    //coaches category section
    public List<String> getShopDashPageCoachesName() {
        int count = shopDashPageCoachesNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageCoachesNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopDashPageCoachesPrice() {
        int count = shopDashPageCoachesPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageCoachesPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //defenders category section
    public List<String> getShopDashPageDefendersName() {
        int count = shopDashPageDefendersNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageDefendersNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopDashPageDefendersPrice() {
        int count = shopDashPageDefendersPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageDefendersPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //forwards category section
    public List<String> getShopDashPageForwardsName() {
        int count = shopDashPageForwardsNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageForwardsNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopDashPageForwardsPrice() {
        int count = shopDashPageForwardsPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageForwardsPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //goalkeepers category section
    public List<String> getShopDashPageGoalKeepersName() {
        int count = shopDashPageGoalKeepersNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageGoalKeepersNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopDashPageGoalKeepersPrice() {
        int count = shopDashPageGoalKeepersPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageGoalKeepersPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //midfielders category section
    public List<String> getShopDashPageMidFieldersName() {
        int count = shopDashPageMidFieldersNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageMidFieldersNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopDashPageMidFieldersPrice() {
        int count = shopDashPageMidFieldersPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageMidFieldersPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //shop dashboard page text element getters
    //coaches category section
    public String getShopDashPageCoachesSectionTitle() {return shopDashPageCoachesSectionTitle.innerText();}
    //list elements
    public List<String> getShopDashPageCoachesAddToCartBtnText() {
        int count = shopDashPageCoachesAddToCartBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageCoachesAddToCartBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //defenders category section
    public String getShopDashPageDefendersSectionTitle() {return shopDashPageDefendersSectionTitle.innerText();}
    //list elements
    public List<String> getShopDashPageDefendersAddToCartBtnText() {
        int count = shopDashPageDefendersAddToCartBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageDefendersAddToCartBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //forwards category section
    public String getShopDashPageForwardsSectionTitle() {return shopDashPageForwardsSectionTitle.innerText();}
    //list elements
    public List<String> getShopDashPageForwardsAddToCartBtnText() {
        int count = shopDashPageForwardsAddToCartBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageForwardsAddToCartBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //goalkeepers category section
    public String getShopDashPageGoalKeepersSectionTitle() {return shopDashPageGoalKeepersSectionTitle.innerText();}
    //list elements
    public List<String> getShopDashPageGoalKeepersAddToCartBtnText() {
        int count = shopDashPageGoalKeepersAddToCartBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageGoalKeepersAddToCartBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //midfielders category section
    public String getShopDashPageMidFieldersSectionTitle() {return shopDashPageMidFieldersSectionTitle.innerText();}
    //list elements
    public List<String> getShopDashPageMidFieldersAddToCartBtnText() {
        int count = shopDashPageMidFieldersAddToCartBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashPageMidFieldersAddToCartBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //shop dashboard page web element getters
    //coaches category section
    public boolean isShopDashPageCoachesSectionTitleVisible() {return shopDashPageCoachesSectionTitle.isVisible();}
    //list elements
    public boolean isShopDashPageCoachesImgElementVisible() {
        int count = shopDashPageCoachesImgElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageCoachesImgElements.nth(i).isVisible());
    }
    public boolean isShopDashPageCoachesAddToCartBtnElementVisible() {
        int count = shopDashPageCoachesAddToCartBtnElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageCoachesAddToCartBtnElements.nth(i).isVisible());
    }
    public boolean isShopDashPageCoachesNameElementVisible() {
        int count = shopDashPageCoachesNameElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageCoachesNameElements.nth(i).isVisible());
    }
    public boolean isShopDashPageCoachesPriceElementVisible() {
        int count = shopDashPageCoachesPriceElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageCoachesPriceElements.nth(i).isVisible());
    }
    //defenders category section
    public boolean isShopDashPageDefendersSectionTitleVisible() {return shopDashPageDefendersSectionTitle.isVisible();}
    //list elements
    public boolean isShopDashPageDefendersImgElementVisible() {
        int count = shopDashPageDefendersImgElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageDefendersImgElements.nth(i).isVisible());
    }
    public boolean isShopDashPageDefendersAddToCartBtnElementVisible() {
        int count = shopDashPageDefendersAddToCartBtnElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageDefendersAddToCartBtnElements.nth(i).isVisible());
    }
    public boolean isShopDashPageDefendersNameElementVisible() {
        int count = shopDashPageDefendersNameElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageDefendersNameElements.nth(i).isVisible());
    }
    public boolean isShopDashPageDefendersPriceElementVisible() {
        int count = shopDashPageDefendersPriceElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageDefendersPriceElements.nth(i).isVisible());
    }
    //forwards category section
    public boolean isShopDashPageForwardsSectionTitleVisible() {return shopDashPageForwardsSectionTitle.isVisible();}
    //list elements
    public boolean isShopDashPageForwardsImgElementVisible() {
        int count = shopDashPageForwardsImgElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageForwardsImgElements.nth(i).isVisible());
    }
    public boolean isShopDashPageForwardsAddToCartBtnElementVisible() {
        int count = shopDashPageForwardsAddToCartBtnElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageForwardsAddToCartBtnElements.nth(i).isVisible());
    }
    public boolean isShopDashPageForwardsNameElementVisible() {
        int count = shopDashPageForwardsNameElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageForwardsNameElements.nth(i).isVisible());
    }
    public boolean isShopDashPageForwardsPriceElementVisible() {
        int count = shopDashPageForwardsPriceElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageForwardsPriceElements.nth(i).isVisible());
    }
    //goalkeepers category section
    public boolean isShopDashPageGoalKeepersSectionTitleVisible() {return shopDashPageGoalKeepersSectionTitle.isVisible();}
    //list elements
    public boolean isShopDashPageGoalKeepersImgElementVisible() {
        int count = shopDashPageGoalKeepersImgElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageGoalKeepersImgElements.nth(i).isVisible());
    }
    public boolean isShopDashPageGoalKeepersAddToCartBtnElementVisible() {
        int count = shopDashPageForwardsAddToCartBtnElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageGoalKeepersAddToCartBtnElements.nth(i).isVisible());
    }
    public boolean isShopDashPageGoalKeepersNameElementVisible() {
        int count = shopDashPageGoalKeepersNameElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageGoalKeepersNameElements.nth(i).isVisible());
    }
    public boolean isShopDashPageGoalKeepersPriceElementVisible() {
        int count = shopDashPageGoalKeepersPriceElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageGoalKeepersPriceElements.nth(i).isVisible());
    }
    //midfielders category section
    public boolean isShopDashPageMidFieldersSectionTitleVisible() {return shopDashPageMidFieldersSectionTitle.isVisible();}
    //list elements
    public boolean isShopDashPageMidFieldersImgElementVisible() {
        int count = shopDashPageMidFieldersImgElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageMidFieldersImgElements.nth(i).isVisible());
    }
    public boolean isShopDashPageMidFieldersAddToCartBtnElementVisible() {
        int count = shopDashPageMidFieldersAddToCartBtnElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageMidFieldersAddToCartBtnElements.nth(i).isVisible());
    }
    public boolean isShopDashPageMidFieldersNameElementVisible() {
        int count = shopDashPageMidFieldersNameElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageMidFieldersNameElements.nth(i).isVisible());
    }
    public boolean isShopDashPageMidFieldersPriceElementVisible() {
        int count = shopDashPageMidFieldersPriceElements.count();
        return java.util.stream.IntStream.range(0, count)
                .allMatch(i -> shopDashPageMidFieldersPriceElements.nth(i).isVisible());
    }

}
