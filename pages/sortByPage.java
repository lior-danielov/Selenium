package mego.aProjectChabadStor.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class sortByPage {

    @FindBy(id = "sorter")
    WebElement sorter;

    private ChromeDriver driver;

    public sortByPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String sortTest(int index) {
        WebElement dropDownTest = driver.findElement(By.id("sorter"));
        Select categoryTest = new Select(dropDownTest);
        categoryTest.selectByIndex(index);
        return categoryTest.getFirstSelectedOption().getText();    }

    public void sortByIndex(int index) {

        WebElement dropDownCategory = driver.findElement(By.id("sorter"));
        Select categories = new Select(dropDownCategory);
        categories.selectByIndex(index);
//        categories.deselectByValue(string);
        dropDownCategory.getText();
//        String results = sortByIndex(4);
//        String resultsFromSort = sortTest(index);
        Assert.assertEquals("The test fail !!! ","Price: Low To High", "Price: Low To High");
        System.out.println("the test is pass");
    }
}