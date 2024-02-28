package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OurSolutionPage {
    WebDriver driver;

    public OurSolutionPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[contains(text(),'Our Solution')]")
    WebElement OurSolution ;

    public void clickOurSolution(){
        OurSolution.click();
    }

    @FindBy(xpath="//a[text()=\"Request A Demo\"]")
    WebElement requestDemo;

    public void checkRequestDemoBtn(){
        if(requestDemo.isDisplayed()){
            System.out.println("Request A Demo menu item is present");
        }
    }

    public void verifyUrlContainsOurSolutionText(){

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("our-solution"),"User is not on our-solution page");

    }
}
