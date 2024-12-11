package mego.aProjectChabadStor.tests;

import mego.SeleniumBase;
import mego.aProjectChabadStor.pages.firstPrice;
import mego.aProjectChabadStor.pages.homePage;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstPriceTest {
    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://store.chabad.org/");

        homePage homePageObject = new homePage(driver);
        homePageObject.searchHanuka("hanuka");
        firstPrice cartpageObject = new firstPrice(driver);
        cartpageObject.getFirstLinkTest();


        base.seleniumClose(driver);
    }
}
