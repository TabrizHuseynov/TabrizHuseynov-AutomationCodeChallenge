$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/User.feature");
formatter.feature({
  "name": "Automate As an Engr. Candidate",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As bank manager ,Add a customer and validate the customer has been added to the table under customer tab",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login as Bank Manager Login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_login_as_Bank_Manager_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he adds new customer under customer tab",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.he_adds_new_customer_under_customer_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies that customer added in the Customers tab",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.verifies_that_customer_added_in_the_Customers_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "As bank manager ,Delete customer Name: Ron and validate customer has been deleted”",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login as Bank Manager Login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_login_as_Bank_Manager_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Customers",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_navigates_to_Customers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deletes the user Ron Weasley",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.user_deletes_the_user_Ron_Weasley()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "As a Customer, make a deposit and confirm my balance is correct",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login as Customer",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_login_as_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose the name and logs in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_choose_the_name_and_logs_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deposits the money and verifies balance",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.user_deposits_the_money_and_verifies_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "As a Customer, ensure I cannot withdraw more from my account than is in my balance",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login as Customer",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_login_as_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose the name and logs in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_choose_the_name_and_logs_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deposits the money and verifies balance",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.user_deposits_the_money_and_verifies_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries to withdraw amount more than in balance",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_tries_to_withdraw_amount_more_than_in_balance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies error message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.user_verifies_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});