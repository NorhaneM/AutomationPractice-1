package Pages;

import Steps_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebElement Sign_In_link()
    {
        By register= By.className("login");
        WebElement Sign_In_link= Hooks.driver.findElement(register);
        return Sign_In_link;
    }
    public WebElement Personal_email() {
        By email = By.id("email");
        WebElement Personal_email = Hooks.driver.findElement(email);
        return Personal_email;
    }
    public WebElement Login_Password() {
        By password = By.id("passwd");
        WebElement Login_Password = Hooks.driver.findElement(password);
        return Login_Password;
    }
    public WebElement  Sign_In() {
        By signIN = By.id("SubmitLogin");
        WebElement Sign_In = Hooks.driver.findElement(signIN);
        return Sign_In;
    }
}
