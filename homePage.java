package mego.aProjectChabadStor.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    @FindBy(id = "search")
    WebElement search;

//    @FindBy(className = "inventory_item_price")
//    WebElement price;

    private ChromeDriver driver;

    public homePage(ChromeDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver, this);
    }
    public void searchHanuka(String textFind){
        search.click();
        search.sendKeys(textFind);
        search.sendKeys(Keys.ENTER);
        Assert.assertEquals("The test fail!! ",textFind,"hanuka");
    }
}
