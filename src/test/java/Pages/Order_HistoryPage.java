package Pages;

import Steps_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class Order_HistoryPage {
    public WebElement ordersBtn() {
        By Order = By.xpath("//a[@title='Orders']");
        WebElement ordersBtn = Hooks.driver.findElement(Order);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(ordersBtn).build().perform();
        return ordersBtn;
    }

    public WebElement orders()  {
        Hooks.driver.manage().timeouts().implicitlyWait(100 , TimeUnit.SECONDS);
        By subcategory = By.className("info-title");
        WebElement ordersHistory = Hooks.driver.findElement(subcategory);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(ordersHistory).build().perform();
        return ordersHistory;

    }
}
