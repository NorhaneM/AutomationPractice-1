package Pages;

import Steps_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SubCategoryPage {

    public WebElement select_Women_Category() {
        Hooks.driver.manage().timeouts().implicitlyWait(100 , TimeUnit.SECONDS);
        By subcategory = By.className("sf-with-ul");
        WebElement select_Women_Category = Hooks.driver.findElement(subcategory);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(select_Women_Category).build().perform();
        return select_Women_Category;

    }
    public WebElement select_Blouses_SubCategory() {
        By subcategory = By.xpath("//a[@title=\"Blouses\"]");
        WebElement select_Blouses_SubCategory = Hooks.driver.findElement(subcategory);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(select_Blouses_SubCategory).build().perform();
        Hooks.driver.manage().timeouts().implicitlyWait(100 , TimeUnit.SECONDS);

        return select_Blouses_SubCategory;

    }
}