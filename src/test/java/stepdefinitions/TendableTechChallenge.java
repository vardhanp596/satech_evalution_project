package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.OurSolutionPage;
import pages.OurStoryPage;
import pages.TendablePage;
import pages.WhyTendablePage;
import pages.ContactUsPage;

import java.time.Duration;

public class TendableTechChallenge {
    WebDriver driver;
    TendablePage tp;
    OurStoryPage osp;
    OurSolutionPage slp;
    WhyTendablePage otp;
    ContactUsPage cp;



@After
public void tearDown(){
    driver.close();
}

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {

        driver = new ChromeDriver();
        driver.get("https://www.tendable.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @When("User clicks on Tendable page")
    public void user_clicks_on_tendable_page() {

            tp = new TendablePage(driver);
            tp.clickOnTendable();
            tp.checkRequestDemoBtn();


    }

    @Then("Verify that Tendabales page is opened")
    public void verify_that_tendabales_page_is_opened() throws Exception {
        tp.verifyTendablesText();
    }

    @When("User clicks on Our Story page")
    public void user_clicks_on_our_story_page() {
        try {
            osp = new OurStoryPage(driver);
            osp.clickOnourStory();
            osp.checkRequestDemoBtn();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("Verify that Our Story page is opened")
    public void verify_that_our_story_page_is_opened() {
        osp.verifyUrlContainsOurStoryText();
    }

    @When("User clicks on Our Solution page")
    public void user_clicks_on_our_solution_page() {
        try {
            slp = new OurSolutionPage(driver);
            slp.clickOurSolution();
            slp.checkRequestDemoBtn();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("Verify that Our Solution page is opened")
    public void verify_that_our_solution_page_is_opened() {
        slp.verifyUrlContainsOurSolutionText();
    }

    @When("User clicks on Why Tendable page")
    public void user_clicks_on_why_tendable_page() {
        try {
            otp = new WhyTendablePage(driver);
            otp.clickWhyTendable();
            otp.checkRequestDemoBtn();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Then("Verify that Tendabales Why Tendable is opened")
    public void verify_that_tendabales_why_tendable_is_opened() {
        otp.verifyUrlContainsWhyTendableText();
    }



    @When("User clicks on Contact Us page")
    public void userClickOnContactButton(){
        cp=new ContactUsPage(driver);
        cp.clickContactUs();

    }
    @And("Click on marketing contact button")
    public void clickOnMarketingContactButton(){
        cp.clickOnMarketingContactBtn();
    }

    @And("fill the contact us form except message field and Click on Submit Button")
    public void fillTheContactUsFormExceptMsgFieldAndClickOnSubmitBtn(){
      cp.userFillTheFormDataAandSubmit("Vishnu","Tendable","9999999999","vishnu@tendable.com","CNO");

    }
    @And("Verify the error message")
    public void verifyTheErrMsg(){
       cp.verifyErrorMessageWhenReqFieldValuesMissing();
    }
}
