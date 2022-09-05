package Pages;

import Steps_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CheckoutPage {

    public WebElement CheckoutBtn1() {

        By Btn1 = By.xpath("//a[@title='Proceed to checkout']");
        WebElement CheckoutBtn1 = Hooks.driver.findElement(Btn1);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(CheckoutBtn1).build().perform();
        return CheckoutBtn1;
    }

    public WebElement CheckoutBtn2() {

        By Btn2 = By.xpath("(//a[@title='Proceed to checkout'])[2]");
        WebElement CheckoutBtn2 = Hooks.driver.findElement(Btn2);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(CheckoutBtn2).build().perform();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return CheckoutBtn2;
    }
    public WebElement CheckoutBtn3() {

        By Btn3 = By.name("processAddress");
        WebElement CheckoutBtn3 = Hooks.driver.findElement(Btn3);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(CheckoutBtn3).build().perform();
        return CheckoutBtn3;
    }
    public WebElement CheckBox() {

        By check_Box = By.id("uniform-cgv");
        WebElement CheckBox = Hooks.driver.findElement(check_Box);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(CheckBox).build().perform();
        return CheckBox;
    }

    public WebElement CheckoutBtn4() {

        By Btn4 = By.name("processCarrier");
        WebElement CheckoutBtn4 = Hooks.driver.findElement(Btn4);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(CheckoutBtn4).build().perform();
        return CheckoutBtn4;
    }

    public WebElement Bank_Wire() {

        By BankWire = By.xpath("//a[@title='Pay by bank wire']");
        WebElement Bank_Wire = Hooks.driver.findElement(BankWire);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(Bank_Wire).build().perform();
        return Bank_Wire;

    }
    public WebElement ConfirmBtn() {
        By confirm =By.xpath("//button[@type=\"submit\"]/span[contains(text(), \"I confirm my order\")]");
        WebElement ConfirmBtn = Hooks.driver.findElement(confirm);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(ConfirmBtn).build().perform();
        return ConfirmBtn;

    }
}

