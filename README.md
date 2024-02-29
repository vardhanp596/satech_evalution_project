Here Iam using Maven as build tool to manage the build life cycle by using different maven goals.
And also managing the jar dependencies like  selenium-java,testng,cucumber-core,cucumber-java,cucumber-testng,gherkin using POM.xml file.
 I have prepared feature file with .feature extension 
using gherkin language by using different gherkin keywords like feature,
 scenario, given, when, then , and keywords.
We have used src->test->resources->features folder->tendabletechchallenge.feature to store the feature files.
And created Step definition class for each scenario step that is 
created in side feature file. And placed the step definition
 files under src->test->java->step definition package->TendableTechChallenge class. 
 And I have used annotations like @Given, @When ,@And @Then to implement step definition methods.
I have implemented Page Object Model design pattern to manage the web elements 
and created different page classes like TendablePage, OurStoryPage, OurSolutionPage, WhyTendablePage, ContactUsPage and used PageFactory to
 initialize the web elements. And I have used these web elements inside our step definition classes.
 In page class i used Xpath to locate the webelements.
I have also created TestRunner class to run the features and I have used 
@CucumberOptions annotation with attributes like plugin, glue, features,
 tag, and monochrome to manage the runner.
I have segregated the scenario using  tag="@Test" and configured
 those tag with  runner class.
And I have used html report plugin to generate test report and configured 
that using plugins attribute of CucumberOptions annotation .
to configure the step definitions files
plugin for html 
