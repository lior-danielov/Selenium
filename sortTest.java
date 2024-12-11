package mego.aProjectChabadStor.tests;

import SeleniumTraining.SeleniumBase;
import mego.aProjectChabadStor.pages.sortByPage;
import mego.aProjectChabadStor.pages.homePage;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class sortTest {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://store.chabad.org/");

        homePage homePageObject = new homePage(driver);
        homePageObject.searchHanuka("hanuka");
        sortByPage sortByObject = new sortByPage(driver);
        sortByObject.sortByIndex(4);

        sleep(3000);

        base.seleniumClose(driver);
    }
}
