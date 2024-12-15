package mego.aProjectChabadStor.tests;

import mego.SeleniumBase;
import mego.aProjectChabadStor.pages.homePage;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchTest {
    public static void main(String[] args) {

        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://store.chabad.org/");

        homePage homePageObject = new homePage(driver);
        homePageObject.searchHanuka("hanuka");

        base.seleniumClose(driver);
    }


}
