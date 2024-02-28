
@Test
  Feature: Confirm accessibility of the top-level menus


Scenario: I want to Confirm accessibility of the top-level menus: Home, Our Story, Our Solution, and Why
    Tendable

  Given I am on the home page
  When User clicks on Tendable page
  Then Verify that Tendabales page is opened
  When User clicks on Our Story page
  Then Verify that Our Story page is opened
  When User clicks on Our Solution page
  Then Verify that Our Solution page is opened
  When User clicks on Why Tendable page
  Then Verify that Tendabales Why Tendable is opened



Scenario: verify contact us test
  Given I am on the home page
  When User clicks on Contact Us page
  And Click on marketing contact button
  And fill the contact us form except message field and Click on Submit Button
  Then Verify the error message