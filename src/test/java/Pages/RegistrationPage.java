package Pages;

import Steps_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegistrationPage {

    public WebElement Sign_In_link()
    {
        By register= By.className("login");
        WebElement Sign_In_link= Hooks.driver.findElement(register);
        return Sign_In_link;
    }
    public WebElement Email() {
        By email = By.id("email_create");
        WebElement Email = Hooks.driver.findElement(email);
        return Email;
    }
    public WebElement  CreateAccount() {
        By Account = By.id("SubmitCreate");
        WebElement CreateAccount = Hooks.driver.findElement(Account);
        return CreateAccount;
    }

    public WebElement First_Name() {
        By FirstName = By.id("customer_firstname");
        WebElement First_Name = Hooks.driver.findElement(FirstName);
        Hooks.driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        return First_Name;
    }
    public WebElement Last_Name() {
        By LastName = By.name("customer_lastname");
        WebElement Last_Name = Hooks.driver.findElement(LastName);
        return Last_Name;
    }
    public WebElement Password() {
        By password = By.id("passwd");
        WebElement Password = Hooks.driver.findElement(password);
        return Password;
    }

    //there is no need to fill First name filed and last name filed as the website generate them automatically//******

    public WebElement Company() {
        By company = By.id("company");
        WebElement Company = Hooks.driver.findElement(company);
        return Company;
    }
    public WebElement Address1() {
        By address = By.id("address1");
        WebElement Address1 = Hooks.driver.findElement(address);
        return Address1;
    }
    public WebElement Address2() {
        By address = By.id("address2");
        WebElement Address2 = Hooks.driver.findElement(address);
        return Address2;
    }
    public WebElement City() {
        By city = By.id("city");
        WebElement City = Hooks.driver.findElement(city);
        return City;
    }
    public WebElement choose_State()
    {
        By State= By.id("id_state");
        WebElement choose_State= Hooks.driver.findElement(State);
        Select selectObject = new Select(choose_State);
        selectObject.selectByVisibleText("New Jersey");
        return choose_State;
    }
    public WebElement Postal_Code() {
        By postalCode = By.id("postcode");
        WebElement Postal_Code = Hooks.driver.findElement(postalCode);
        return Postal_Code;
    }
    public WebElement Country() {
        By country = By.id("id_country");
        WebElement Country = Hooks.driver.findElement(country);
        return Country;
    }
    public WebElement Home_Phone() {
        By homePhone = By.id("phone");
        WebElement Home_Phone = Hooks.driver.findElement(homePhone);
        return Home_Phone;
    }
    public WebElement Mobile_Phone() {
        By mobilePhone = By.id("phone_mobile");
        WebElement Mobile_Phone = Hooks.driver.findElement(mobilePhone);
        return Mobile_Phone;
    }

    //there is no need to fill address_alias as the website generate it automatically//******

    public WebElement  RegisterButton() {
        By Register = By.id("submitAccount");
        WebElement  RegisterButton = Hooks.driver.findElement(Register);
        return  RegisterButton;
    }

}
