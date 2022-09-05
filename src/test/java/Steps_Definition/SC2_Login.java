package Steps_Definition;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class SC2_Login {
    LoginPage login = new LoginPage();

    //navigate to the home page
    @Given("user navigate to URL home page")
    public void navigate_home() {
        String url = "http://automationpractice.com/index.php";
        Hooks.driver.navigate().to(url);
    }

    //click on sign in link
    @And("user click on signIn Link")
    public void Sign_In_link() {
        login.Sign_In_link().click();
    }

    //enter the correct email associated with your account
    @When("user enter his email")
    public void Personal_email() {
        login.Personal_email().sendKeys("noruhane_mahrous@gmail.com");
    }

    //enter the correct password associated with your account
    @And("user enter his password")
    public void LoginPassword() {
        login.Login_Password().sendKeys("P@ssw0rd");
    }

    //enter on sign in button
    @Then("user clicks on sign in button")
    public void SignIn() {
        login.Sign_In().click();}

    //Assert that the user in logged in
    @Then("user logged in successfully")
    public void LoggedIn() throws InterruptedException {
        Thread.sleep(2000);
    Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("http://automationpractice.com/index.php?controller=my-account"));
    Assert.assertTrue(Hooks.driver.findElement(By.className("account")).isDisplayed());
    System.out.println("the user is logged in successfully");
}
}