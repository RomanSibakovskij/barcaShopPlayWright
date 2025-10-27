package app.netlify.store.barca.modules;

import app.netlify.store.barca.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.stream.*;
import java.util.*;

public class ShoppingCartModal extends BasePage {

    //shopping cart modal web elements
    //list elements
    private Locator shoppingCartModalProductImgElements;
    private Locator shoppingCartModalProductNameElements;
    private Locator shoppingCartModalProductQtyPriceElements;
    //button
    private Locator shoppingCartModalGoToCheckoutBtn;
    //empty shopping cart modal message
    private Locator emptyShoppingCartModalMessage;

    public ShoppingCartModal(Page page) {
        super(page);

        //list elements
        shoppingCartModalProductImgElements = page.locator("//nav[@class='bg-[#fff] w-full h-14 flex justify-between items-center fixed top-0 px-5 md:px-10 z-50'][1]//div[@class='flex flex-col h-60 overflow-y-scroll']//img");
        shoppingCartModalProductNameElements = page.locator("//nav[@class='bg-[#fff] w-full h-14 flex justify-between items-center fixed top-0 px-5 md:px-10 z-50'][1]//div[@class='w-[70%] flex flex-col items-start justify-center py-[10px] px-[20px]']/span[1]");
        shoppingCartModalProductQtyPriceElements = page.locator("//nav[@class='bg-[#fff] w-full h-14 flex justify-between items-center fixed top-0 px-5 md:px-10 z-50'][1]//div[@class='w-[70%] flex flex-col items-start justify-center py-[10px] px-[20px]']/span[2]");
        //button
        shoppingCartModalGoToCheckoutBtn = page.locator("//nav[@class='bg-[#fff] w-full h-14 flex justify-between items-center fixed top-0 px-5 md:px-10 z-50'][5]/div/button");
        //empty shopping cart modal message
        emptyShoppingCartModalMessage = page.locator("//nav[@class='bg-[#fff] w-full h-14 flex justify-between items-center fixed top-0 px-5 md:px-10 z-50'][1]//span[@class='text-lg  my-[50px] mx-auto']");

    }

    //click "Go to checkout" button method
    public void clickGoToCheckoutBtn() {shoppingCartModalGoToCheckoutBtn.click();}

    //shopping cart modal product data getters
    //list elements
    public List<String> getShopCartModalProductName() {
        int count = shoppingCartModalProductNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shoppingCartModalProductNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopCartModalProductQty() {
        int count = shoppingCartModalProductQtyPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> {
                    String text = shoppingCartModalProductQtyPriceElements.nth(i).innerText().trim();
                    return text.split("x")[0].trim(); //trim the first string part before 'x'
                })
                .collect(Collectors.toList());
    }
    public List<String> getShopCartModalProductPrice() {
        int count = shoppingCartModalProductQtyPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> {
                    String text = shoppingCartModalProductQtyPriceElements.nth(i).innerText().trim();
                    return text.split("x")[1].trim(); //trim the first string part after 'x'
                })
                .collect(Collectors.toList());
    }

    //shopping cart modal text element getters
    //button
    public String getShoppingCartModalGoToCheckoutBtnText() {return shoppingCartModalGoToCheckoutBtn.innerText();}
    //empty shopping cart modal message
    public String getEmptyShoppingCartModalMessage() {return emptyShoppingCartModalMessage.innerText();}

    //shopping cart modal web element assert methods
    //list elements
    public boolean isShoppingCartModalProductImgElementVisible() {
        int count = shoppingCartModalProductImgElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shoppingCartModalProductImgElements.nth(i).isVisible());
    }
    public boolean isShoppingCartModalProductNameElementVisible() {
        int count = shoppingCartModalProductNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shoppingCartModalProductNameElements.nth(i).isVisible());
    }
    public boolean isShoppingCartModalProductQtyPriceElementVisible() {
        int count = shoppingCartModalProductQtyPriceElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shoppingCartModalProductQtyPriceElements.nth(i).isVisible());
    }
    //button
    public boolean isShoppingCartModalGoToCheckoutBtnVisible() {return shoppingCartModalGoToCheckoutBtn.isVisible();}
    //empty shopping cart modal message
    public boolean isEmptyShoppingCartModalMessageVisible() {return emptyShoppingCartModalMessage.isVisible();}

}
