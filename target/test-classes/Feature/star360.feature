Feature: Home page in star360

  Background: User is in Home page
    Given Click the Myaccount button

  @Smoke
  Scenario: Account creation
    When Already user has account in it give the email and password and click sign up button

  @Smoke
  Scenario: 
    And User forgets the password click the forget password link
    And User enters the email to receive the password link then click submit button

  @Regression
  Scenario: 
    Given New customers click the create account
    And User enters the personal information as fname, lname and email and click signup
    And User enters the signin information password and confirm password
    Then User clicks the create an account button

  #Scenario: 
   # Given Enter the distance search and click search button
   # And User return to ResetSearch
@Sanity
  Scenario: 
    Given User enters the product and click search button
    When User click the item
    And user enters the size and color and quantity
    Then User click the add to cart
