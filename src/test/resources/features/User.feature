Feature: Automate As an Engr. Candidate

  Scenario: As bank manager ,Add a customer and validate the customer has been added to the table under customer tab
    Given the user is on the login page
    When user login as Bank Manager Login
    Then he adds new customer under customer tab
    And verifies that customer added in the Customers tab

  Scenario: As bank manager ,Delete customer Name: Ron and validate customer has been deleted”
    Given the user is on the login page
    When user login as Bank Manager Login
    Then user navigates to Customers
    And user deletes the user Ron Weasley


  Scenario:As a Customer, make a deposit and confirm my balance is correct
    Given the user is on the login page
    When user login as Customer
    Then user choose the name and logs in
    And user deposits the money and verifies balance

  Scenario: As a Customer, ensure I cannot withdraw more from my account than is in my balance
    Given the user is on the login page
    When user login as Customer
    Then user choose the name and logs in
    And user deposits the money and verifies balance
    Then user tries to withdraw amount more than in balance
    And user verifies error message


