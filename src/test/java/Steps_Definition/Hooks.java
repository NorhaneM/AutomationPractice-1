package Steps_Definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Hooks {

        public static WebDriver driver;
        @Before
        public static void open_browser()
        {
            WebDriverManager.chromedriver() .setup();    //setup chrome driver and open it
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1024, 768)); // browser resolution is 1024x768px
            driver.manage() .window().maximize(); // to maximize browser's windows
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wait 5 seconds
        }

        @After
        public static void quit_browser()
        {
            driver.quit();

        } //close the browser
    }


