Feature: TestHeaven Login

  Scenario: Open the Login page of an application under test.



    Given I launch chrome browser
    When I open politrip home page
    And  I press sing up button
    And  I click on First Name box and add a name
    And  I click on Last Name box and add a last name
    And  I click on Email box and add a email
    And  I click on Password box and add a password
    And  I click on Confirm Password box and I confirm password
    And  I click on Sing up box
    Then  I create a new account successfully



  Scenario: Open the Login page with negative value.
    Given I launch chrome browser
    And I open politrip home page
    And  I press sing up button
    And I click on First Name box and add a name and a wrong value
    And I click on Last Name box and add a last name
    And  I click on Email box and add a email
    And  I click on Password box and add a password
    And  I click on Confirm Password box and I confirm password
    And  I click on Sing up box
    Then  I faild

