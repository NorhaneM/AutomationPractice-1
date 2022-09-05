package Steps_Definition;

import Pages.Select_BlousePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class SC4_Blouse {
    Select_BlousePage blouse = new Select_BlousePage();

    //user click on the resulted blouse
    @When("user click on the resulted blouse")
    public void select_Blouse() {
        blouse. select_Blouse().click();
    }

    //Add the blouse to the shopping cart
    @And("user add the selected blouse to the cart")
    public void Add_toCart() throws InterruptedException {
        blouse.Add_toCart().click();
        Thread.sleep(2000);
    }

    //Assert that the blouse is added successfully
    @Then("Blouse has been added successfully")
    public void success_msg() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).isDisplayed());
        System.out.println("the blouse has been added to your shopping cart successfully ");
    }
}
