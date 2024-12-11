package mego.aProjectChabadStor.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class navbarCheckPage {

        @FindBy(partialLinkText = "Judaica")
        WebElement tab1;

        @FindBy(partialLinkText = "Occasions")
        WebElement tab2;

        @FindBy(partialLinkText = "All Holidays")
        WebElement tab3;

        @FindBy(partialLinkText = "Home & Family")
        WebElement tab4;

        @FindBy(partialLinkText = "Books")
        WebElement tab5;

    private ChromeDriver driver;

    public navbarCheckPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void checkList(){
        List<String> allTabs =new ArrayList<>();
        allTabs.add(tab1.getText());
        allTabs.add(tab2.getText());
        allTabs.add(tab3.getText());
        allTabs.add(tab4.getText());
        allTabs.add(tab5.getText());
        System.out.println(allTabs);


        List<String> navbarCheck = Arrays.asList("Judaica", "Occasions", "All Holidays", "Home & Family", "Books");
           for (int i=0;i<navbarCheck.size();i++) {
               Assert.assertEquals("The test is fail in navbar number " +i+" ", allTabs.get(i), navbarCheck.get(i));
           }
        System.out.println("the test is passed");
    }
}
