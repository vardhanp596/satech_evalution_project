💻 Test Automation Framework | UI
SELENIUM Java Cucumber BDD Framework

Intellij idea HTML Reporter GitHub Actions

📑 Table of Contents
Introduction
Prerequisites
Getting Started
Running Tests
Project Structure
Reporting

📖 Introduction
This repository contains a Test Automation Framework built using SELENIUM ,Java,Cucumber for automated testing of UI.

🛠️ Prerequisites
Maven
selenium-java(4.18.1)
testng(7.9.0)
cucumber-core(7.15.0)
cucumber-java(7.15.0)
cucumber-testng(7.15.0)
gherkin(28.0.0)
▶️ Getting Started
Clone the repository:

git clone https://github.com/vardhanp596/satech_evalution_project/tree/master
Navigate to the project directory:


Install dependencies:
selenium-java
testng
cucumber-core
cucumber-java
cucumber-testng
gherkin


🚀 Running Tests
Run TestRunner.java

📁 Project Structure
The tests follow a modular and maintainable structure:

|-- .github
src - test -java-pages
|-ContactUsPage
|-OurSolutionPage
|-OurStoryPage
|-TendablePage
|-WhyTendablePage

.stepdefinitions package
|-Tendable TechChallenge.java

.src-test-resources-features
|-tendabletechchallenge.feature

.testrunners package
|-TestRunner.java
report: Contains the HTML report for test.
📊 Reporting
HTML report (Logs are attached) is stored in the target cucumber-report directory.


