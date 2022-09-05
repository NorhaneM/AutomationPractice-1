package Pages;

import Steps_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Select_BlousePage {
    public WebElement select_Blouse() {
        By subcategory = By.className("product_img_link");
        WebElement select_Blouse = Hooks.driver.findElement(subcategory);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(select_Blouse).build().perform();
        return select_Blouse;
    }

    public WebElement Add_toCart() throws InterruptedException {
        Thread.sleep(2000);
        By Cart = By.name("Submit");
        WebElement Add_toCart = Hooks.driver.findElement(Cart);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(Add_toCart).build().perform();
        return Add_toCart;
    }

}
