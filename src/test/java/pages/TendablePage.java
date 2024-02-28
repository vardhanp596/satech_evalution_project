package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TendablePage {
    WebDriver driver;
    public TendablePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//img[@alt=\"Tendable Logo\"]")
    WebElement tendableMenu;

    @FindBy(xpath="//a[text()=\"Request A Demo\"]")
    WebElement requestDemo;

    @FindBy(xpath = "//h1")
    WebElement text;


    public void verifyTendablesText() {
        Assert.assertTrue(text.getText().equals("Move beyond simple compliance"),"Tendable text is not displayed");
    }
    public void clickOnTendable(){
        tendableMenu.click();
    }

    public void checkRequestDemoBtn(){
        if(requestDemo.isDisplayed()){
            System.out.println("Request A Demo menu item is present");
        }
    }

 }
