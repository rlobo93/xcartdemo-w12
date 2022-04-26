package homepage;

import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {


    String BaseUrl = "https://mobile.x-cart.com/";


    @Before
    public void setUp(){
        openBrowser(BaseUrl);
    }


    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){

//        1.1 Click on the “Shipping” link
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]/span[1]"));

//        1.2 Verify the text “Shipping”
        String expectedMessage ="Shipping";
        String actualMessage = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
//        2.1 Click on the “New!” link
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]/span[1]"));

//        2.2 Verify the text “New arrivals”
        String expectedMessage ="New arrivals";
        String actualMessage = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
//        3.1 Click on the “Coming soon” link
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]"));

//        3.2 Verify the text “Coming soon”
        String expectedMessage ="Coming soon";
        String actualMessage = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
//        4.1 Click on the “Contact us” link
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]"));

//        4.2 Verify the text “Contact us”
        String expectedMessage ="Contact us";
        String actualMessage = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }


}
