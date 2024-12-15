package mego.aProjectChabadStor.tests;

import mego.aProjectChabadStor.pages.navbarCheckPage;
import mego.SeleniumBase;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResultCorrectTest {
    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://store.chabad.org/");

        navbarCheckPage SearchResultCorrectTest = new navbarCheckPage(driver);
        SearchResultCorrectTest.checkList();

        base.seleniumClose(driver);
    }
}
