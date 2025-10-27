package app.netlify.store.barca;

import app.netlify.store.barca.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.List;
import java.util.stream.*;

public class CheckoutPage extends BasePage {

    //checkout page web elements
    private Locator checkoutPageTitle;
    //product table
    private Locator checkoutPageProductSubtext;
    private Locator checkoutPageDescSubtext;
    private Locator checkoutPageQuantitySubtext;
    private Locator checkoutPagePriceSubtext;
    private Locator checkoutPageRemoveSubtext;
    //list elements
    private Locator checkoutPageProductImgElements;
    private Locator checkoutPageProductNameElements;
    private Locator checkoutPageProductQtyDecreaseBtnElements;
    private Locator checkoutPageProductQtyElements;
    private Locator checkoutPageProductQtyIncreaseBtnElements;
    private Locator checkoutPageProductPriceElements;
    private Locator checkoutPageProductRemoveBtnElements;
    //summary section
    private Locator checkoutPageTotalSubtextAndPrice;


    public CheckoutPage(Page page) {
        super(page);

        checkoutPageTitle = page.locator("//div[@class='2xl:container 2xl:mx-auto h-full md:px-10']/h2");
        //product table
        checkoutPageProductSubtext = page.locator("//div[@class='w-11/12 md:w-[55%] min-h-[90vh] flex flex-col items-center m-auto text-center']/div[1]/div[1]/span[@class='w-[8%] hidden md:block']");
        checkoutPageDescSubtext = page.locator("//div[@class='w-11/12 md:w-[55%] min-h-[90vh] flex flex-col items-center m-auto text-center']/div[1]/div[2]/span[@class='w-[8%] hidden md:block']");
        checkoutPageQuantitySubtext = page.locator("//div[@class='w-11/12 md:w-[55%] min-h-[90vh] flex flex-col items-center m-auto text-center']/div[1]/div[3]/span[@class='w-[8%] hidden md:block']");
        checkoutPagePriceSubtext = page.locator("//div[@class='w-11/12 md:w-[55%] min-h-[90vh] flex flex-col items-center m-auto text-center']/div[1]/div[4]/span[@class='w-[8%] hidden md:block']");
        checkoutPageRemoveSubtext = page.locator("//div[@class='w-11/12 md:w-[55%] min-h-[90vh] flex flex-col items-center m-auto text-center']/div[1]/div[5]/span[@class='w-[8%] hidden md:block']");
        //list elements
        checkoutPageProductImgElements = page.locator("//div[@class='w-full flex h-[100px] md:h-[120px] border-b border-gray-900 py-[15px] text-[10px] md:text-[20px] items-center text-start']//img");
        checkoutPageProductNameElements = page.locator("//div[@class='w-full flex h-[100px] md:h-[120px] border-b border-gray-900 py-[15px] text-[10px] md:text-[20px] items-center text-start']//span[@class='w-[20%] md:w-[23%] ml-5']");
        checkoutPageProductQtyDecreaseBtnElements = page.locator("//div[@class='w-full flex h-[100px] md:h-[120px] border-b border-gray-900 py-[15px] text-[10px] md:text-[20px] items-center text-start']//span[@class='flex w-[23%] md:w-[20%]']/div[1]");
        checkoutPageProductQtyElements = page.locator("//div[@class='w-full flex h-[100px] md:h-[120px] border-b border-gray-900 py-[15px] text-[10px] md:text-[20px] items-center text-start']//span[@class='mx-[10px]']");
        checkoutPageProductQtyIncreaseBtnElements = page.locator("//div[@class='w-full flex h-[100px] md:h-[120px] border-b border-gray-900 py-[15px] text-[10px] md:text-[20px] items-center text-start']//span[@class='flex w-[23%] md:w-[20%]']/div[2]");
        checkoutPageProductPriceElements = page.locator("//div[@class='w-full flex h-[100px] md:h-[120px] border-b border-gray-900 py-[15px] text-[10px] md:text-[20px] items-center text-start']/span[@class='w-[15%]']");
        checkoutPageProductRemoveBtnElements = page.locator("//div[@class='w-full flex h-[100px] md:h-[120px] border-b border-gray-900 py-[15px] text-[10px] md:text-[20px] items-center text-start']/div[@class='md:pl-10 cursor-pointer']");
        //summary
        checkoutPageTotalSubtextAndPrice = page.locator("//span[@class='mt-[30px] ml-auto text-[36px]']");

    }

    //click set product quantity increase button method
    public void clickSetProductQtyIncreaseButton(int index, int times){
        Locator setProductQtyIncreaseBtn = checkoutPageProductQtyIncreaseBtnElements.nth(index);

        for (int i = 0; i < times; i++){
            setProductQtyIncreaseBtn.click();
        }
    }

    //click set product quantity decrease button method
    public void clickSetProductQtyDecreaseButton(int index, int times){
        Locator setProductQtyDecreaseBtn = checkoutPageProductQtyDecreaseBtnElements.nth(index);

        for (int i = 0; i < times; i++){
            setProductQtyDecreaseBtn.click();
        }
    }

    //click set product remove button method
    public void clickSetProductRemoveButton(int index){checkoutPageProductRemoveBtnElements.nth(index).click();}

    //checkout page product data getters
    //product table (list elements)
    public List<String> getCheckoutPageProductName() {
        int count = checkoutPageProductNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageProductNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getCheckoutPageProductQty() {
        int count = checkoutPageProductQtyElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageProductQtyElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getCheckoutPageProductUnitPrice() {
        int count = checkoutPageProductPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageProductPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //summary
    public String getCheckoutPageTotalPrice() {
        String fullString = checkoutPageTotalSubtextAndPrice.innerText().trim();
        return fullString.split("\\s+")[1];//split price
    }

    //checkout page text element getters
    public String getCheckoutPageTitle() {return checkoutPageTitle.innerText();}
    //product table
    public String getCheckoutPageProductSubtext() {return checkoutPageProductSubtext.innerText();}
    public String getCheckoutPageDescSubtext() {return checkoutPageDescSubtext.innerText();}
    public String getCheckoutPageQuantitySubtext() {return checkoutPageQuantitySubtext.innerText();}
    public String getCheckoutPagePriceSubtext() {return checkoutPagePriceSubtext.innerText();}
    public String getCheckoutPageRemoveSubtext() {return checkoutPageRemoveSubtext.innerText();}
    //summary
    public String getCheckoutPageTotalSubtext() {
        String fullString = checkoutPageTotalSubtextAndPrice.innerText().trim();
        return fullString.split("\\s+")[0];//split "Total:"
    }

    //checkout page web element assert methods
    public boolean isCheckoutPageTitleVisible() {return checkoutPageTitle.isVisible();}
    //product table
    public boolean isCheckoutPageProductSubtextVisible() {return checkoutPageProductSubtext.isVisible();}
    public boolean isCheckoutPageDescSubtextVisible() {return checkoutPageDescSubtext.isVisible();}
    public boolean isCheckoutPageQuantitySubtextVisible() {return checkoutPageQuantitySubtext.isVisible();}
    public boolean isCheckoutPagePriceSubtextVisible() {return checkoutPagePriceSubtext.isVisible();}
    public boolean isCheckoutPageRemoveSubtextVisible() {return checkoutPageRemoveSubtext.isVisible();}
    //list elements
    public boolean isCheckoutPageProductImgElementVisible() {
        int count = checkoutPageProductImgElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductImgElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageProductNameElementVisible() {
        int count = checkoutPageProductNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductNameElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageProductQtyDecreaseBtnElementVisible() {
        int count = checkoutPageProductQtyDecreaseBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductQtyDecreaseBtnElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageProductQtyElementVisible() {
        int count = checkoutPageProductQtyElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductQtyElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageProductQtyIncreaseBtnElementVisible() {
        int count = checkoutPageProductQtyIncreaseBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductQtyIncreaseBtnElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageProductPriceElementVisible() {
        int count = checkoutPageProductPriceElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductPriceElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageProductRemoveBtnElementVisible() {
        int count = checkoutPageProductRemoveBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductRemoveBtnElements.nth(i).isVisible());
    }
    //summary
    public boolean isCheckoutPageTotalSubtextAndPriceVisible() {return checkoutPageTotalSubtextAndPrice.isVisible();}

}