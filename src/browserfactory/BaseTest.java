package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    String BaseUrl = "https://mobile.x-cart.com/";

    public void openBrowser(String BaseUrl) {

        //setting up browser for incognito mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        //browser setup
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(BaseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }





    //closing browser
    public void closeBrowser() {
        driver.quit();
    }

}
