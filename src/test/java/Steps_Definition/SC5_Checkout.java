package Steps_Definition;

import Pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;

public class SC5_Checkout {
    CheckoutPage checkout = new CheckoutPage();

    //user click on the checkout button
    @Given("User click on proceed to checkout button")
    public void CheckoutBtn1() {
        checkout.CheckoutBtn1().click();
    }

    //user continue to shopping cart summary page and click on proceed to checkout button
    @And("User click on proceed to checkout button on the summary page")
    public void CheckoutBtn2() {
        checkout.CheckoutBtn2().click();
    }

    //user continue to address page and click on proceed to checkout button
    @And("User click on proceed to checkout button on the address page")
    public void CheckoutBtn3() {
        checkout.CheckoutBtn3().click();
    }

    //user agree to the terms of services by checking it
    @And("user agree to terms of service")
    public void CheckBox() {
        checkout.CheckBox().click();
    }

    //user continue to shipping page and click on proceed to checkout button
    @Then("User click on proceed to checkout button on the shipping page")
    public void CheckoutBtn4() {
        checkout.CheckoutBtn4().click();
    }

    //user continue to payment page and click on pay by Bank wire
    @And("user select to pay by bank wire")
    public void Bank_Wire() {
        checkout.Bank_Wire().click();
    }

    //user continue to order confirmation page and click confirm button
    @And("User confirm his order in the payment page")
    public void ConfirmBtn()  {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wait 5 seconds
        checkout.ConfirmBtn().click();
    }

    //Assert that thee order is confirmed
    @Then("Order Confirmation msg appear")
    public void success_msg1()  {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wait 5 seconds
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//p[contains(.,'Your order on My Store is complete.')]")).isDisplayed());
        System.out.println("your order has been confirmed successfully ");
    }
}

