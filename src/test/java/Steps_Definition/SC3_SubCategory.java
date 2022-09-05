package Steps_Definition;

import Pages.SubCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SC3_SubCategory {
    SubCategoryPage WomenCategories = new SubCategoryPage();

    //hover on the women section
    @When("user hover to the Women category")
    public void select_Women_Category() {
        WomenCategories.select_Women_Category();
    }

    //click on blouses subCategory
    @And("user click on the Blouses subCategory")
    public void select_Blouses_SubCategory() throws InterruptedException {
        Thread.sleep(2000);
        WomenCategories.select_Blouses_SubCategory().click();
    }

    //assert that the user is directed to the blouse page
    @Then("user go to the Blouses page")
    public void Blouses_SubCategory(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("http://automationpractice.com/index.php?id_category=7&controller=category"));
        soft.assertAll();
        Assert.assertTrue(Hooks.driver.findElement(By.className("cat-name")).isDisplayed());
        System.out.println("User is directed successfully to the blouse page");
    }
}
