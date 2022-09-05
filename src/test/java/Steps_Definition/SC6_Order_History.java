package Steps_Definition;

import Pages.Order_HistoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC6_Order_History {
    Order_HistoryPage orderHistory = new Order_HistoryPage();

    //user click on order history button
    @Given("User click on the orders history and details button")
    public void ordersBtn() {
        orderHistory. ordersBtn().click();
    }

    //user navigate to the order history page
    @And("User navigate to orders history and details page")
    public void orders() {
        orderHistory. orders();
    }

    //Assert that the order history page contains the last order
    @Then("Order History is displayed")
    public void Displayed_Msg() throws InterruptedException {
        Thread.sleep(2000);
        String ExpectedResult = "Order history";
        String ActualResult = Hooks.driver.findElement(By.className("navigation_page")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("your recently order has been validated successfully");
    }
}
