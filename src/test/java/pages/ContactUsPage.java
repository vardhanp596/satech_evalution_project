package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ContactUsPage {
    WebDriver driver;

    public ContactUsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[contains(text(),'Contact Us')]")
    WebElement ContactUs;


    @FindBy(xpath = "//div[contains(text(),'Marketing')]//following-sibling::div//button")
    WebElement MarketingContactBtn;

    @FindBy(id = "form-input-fullName")
    WebElement fullName;

    @FindBy(id="form-input-organisationName")
    WebElement organisationName;

    @FindBy(id = "form-input-cellPhone")
    WebElement cellPhone;

    @FindBy(id = "form-input-email")
    WebElement email;

    @FindBy(id="form-input-jobRole")
    WebElement jobRole;

    @FindBy(xpath = "//*[contains(@id,'contactMarketingPipedrive')]//*[@*='Submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//*[contains(@id,'contactMarketingPipedrive')]//*[text()='Consent Agreed']/following-sibling::*//input[@value='Consent Agreed']")
    WebElement agreeRadioBtn;

    @FindBy(xpath="//*[@class='ff-form-errors']/p")
    WebElement formPageLevelErrMsg;

    @FindBy(xpath="//textarea/following-sibling::*/*")
    WebElement textAreaFieldLvlErrMsg;

    public void clickContactUs(){
        ContactUs.click();
    }
    public void clickOnMarketingContactBtn(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(MarketingContactBtn));
        wait.until(ExpectedConditions.elementToBeClickable(MarketingContactBtn));

        MarketingContactBtn.click();
    }

    public void userFillTheFormDataAandSubmit(String fName,String orgName,String phNo,String emailAdd,String jobRoles){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(fullName));
        fullName.clear();
        fullName.sendKeys(fName);
        organisationName.clear();
        organisationName.sendKeys(orgName);
        cellPhone.clear();
        cellPhone.sendKeys(phNo);
        email.clear();
        email.sendKeys(emailAdd);
        Select select = new Select(jobRole);
        select.selectByVisibleText(jobRoles);

        agreeRadioBtn.click();
        submitBtn.click();
    }

    public void verifyErrorMessageWhenReqFieldValuesMissing(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(formPageLevelErrMsg));


        Assert.assertTrue(formPageLevelErrMsg.getText().equals("Sorry, there was an error submitting the form. Please try again."),"Page Level err message :: Sorry, there was an error submitting the form. Please try again.  is not displayed");
        Assert.assertTrue(textAreaFieldLvlErrMsg.getText().equals("This field is required"),"Field level error message is not displayed");
    }

}
