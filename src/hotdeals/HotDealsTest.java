package hotdeals;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import utilities.Utility;



public class HotDealsTest extends Utility {

    String BaseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp(){
        openBrowser(BaseUrl);
    }


    @Test
    public void verifySaleProductsArrangeAlphabetically() {

//		1.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

//		1.2 Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));

//		1.3 Verify the text “Sale”
        String expectedMessage ="Sale";
        String actualMessage = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(actualMessage,expectedMessage);

//      1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"));
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]"));

//      1.5 Verify that the product arrange alphabetically
        productArrangeAlphabetically(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]"));

    }

@Test
    public void verifySaleProductsPriceArrangeLowToHigh() {

//		2.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

//		2.2 Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));

//		2.3 Verify the text “Sale”
        String expectedMessage ="Sale";
        String actualMessage = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(actualMessage,expectedMessage);

//      2.4 Mouse hover on “Sort By” and select “Price Low-High”
        //Mouse hover on “Sort By”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        //select “Price Low-High”
        mouseHoverAndClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"));

//      2.5 Verify that the product’s price arrange Low to High
    verifyExpectedAndActual(By.xpath("//span[contains(text(),'Price Low - High')]"),"Price Low - High");

    }


@Test
    public void verifySaleProductsArrangeByRates() {
//		3.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

//		3.2 Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));

//		3.3 Verify the text “Sale”
        String expectedMessage ="Sale";
        String actualMessage = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(actualMessage,expectedMessage);

//      3.4 Mouse hover on “Sort By” and select “Rates”
        //Mouse hover on “Sort By”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        //select “Rates”
        mouseHoverAndClick(By.partialLinkText("Rates"));

//      3.5 Verify that the product’s arrange Rates
    verifyExpectedAndActual(By.xpath("//span[contains(text(),'Rates')]"),"Rates");

    }

@Test
    public void  verifyBestSellersProductsArrangeByZToA() {
//		1.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));//

//      1.2 Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));

//		1.3 Verify the text “Bestsellers”
        String expectedMessage ="Bestsellers";
        String actualMessage = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(actualMessage,expectedMessage);

//      1.4 Mouse hover on “Sort By” and select “Name Z-A”
        //Mouse hover on “Sort By”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sales')]"));
        //select “Name Z-A”
        mouseHoverAndClick(By.partialLinkText("Name Z - A"));

//      1.5 Verify that the product arrange by Z to A
    verifyExpectedAndActual(By.xpath("//span[contains(text(),'Name Z - A')]"),"Name Z - A");
    }

@Test
    public void  verifyBestSellersProductsPriceArrangeHighToLow() {
//		2.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

//		2.2 Mouse hover on the “Bestsellers” link and click
        mouseHoverAndClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));

//		2.3 Verify the text “Bestsellers”
        String expectedMessage ="Bestsellers";
        String actualMessage = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(actualMessage,expectedMessage);

//      2.4 Mouse hover on “Sort By” and select “Price High-Low”
        //Mouse hover on “Sort By”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sales')]"));
        //select “Price High-Low”
        mouseHoverAndClick(By.partialLinkText("Price High - Low"));

//      2.5 Verify that the product’s price arrange High to Low
    verifyExpectedAndActual(By.xpath("//span[contains(text(),'Price High - Low')]"),"Price High - Low");

    }

@Test
    public void  verifyBestSellersProductsArrangeByRates() {
//		3.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

//		3.2 Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));

//		3.3 Verify the text “Bestsellers”
        String expectedMessage ="Bestsellers";
        String actualMessage = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(actualMessage,expectedMessage);

//      3.4 Mouse hover on “Sort By” and select “Rates”
        //Mouse hover on “Sort By”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sales')]"));
        //select “Rates”
        mouseHoverAndClick(By.partialLinkText("Rates"));

//      3.5 Verify that the product’s arrange Rates
    verifyExpectedAndActual(By.xpath("//span[contains(text(),'Rates')]"),"Rates");
    //product-cell box-product

    }

    @After
    public void tearDown(){
        closeBrowser();
    }




}
