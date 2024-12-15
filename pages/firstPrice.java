package mego.aProjectChabadStor.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.By.cssSelector;

public class firstPrice {
//    @FindBy(id = "add-to-cart-24785")
//    WebElement product;

    @FindBy(id = "top-cart-btn-checkout")
    WebElement payproduct;

    private ChromeDriver driver;

    public firstPrice(ChromeDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver, this);
    }

    public void getFirstLinkTest () {
        List<WebElement> products = this.driver.findElements(By.className("price"));
        String firstPriceText = products.get(0).getText();
        System.out.println("The first price is: " + firstPriceText);
        Assert.assertEquals("The test faill !!!: ", firstPriceText, "$6.99");
        System.out.println("The test is pass");
        }


        public void cartProductAdding (String linkProduct){
            List<WebElement> products = this.driver.findElements(cssSelector("class=['pl-thm-gomage']"));
            String firstLinkText = products.get(0).getText();
            Boolean isPass = firstLinkText.contains(linkProduct);
            Assert.assertTrue(linkProduct + " is not include in first link text", isPass);
//        product.click();
//        product.sendKeys(Keys.ENTER);
//        payproduct.click();
//        payproduct.sendKeys(Keys.ENTER);
        }

    }
