package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WhyTendablePage {
    WebDriver driver;

    public WhyTendablePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[contains(text(),'Why Tendable?')]")
    WebElement WhyTendable ;

    public void clickWhyTendable(){
        WhyTendable.click();
    }

    @FindBy(xpath="//a[text()=\"Request A Demo\"]")
    WebElement requestDemo;

    public void checkRequestDemoBtn(){
        if(requestDemo.isDisplayed()){
            System.out.println("Request A Demo menu item is present");
        }
    }

    public void verifyUrlContainsWhyTendableText(){
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("why-tendable"),"User is not on why-tendable page");

    }
}
