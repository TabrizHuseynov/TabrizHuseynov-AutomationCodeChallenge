package com.xyz_bank.step_def;


import com.xyz_bank.pages.LoginPage;
import com.xyz_bank.utilities.BrowserUtils;
import com.xyz_bank.utilities.ConfigurationReader;
import com.xyz_bank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class LoginStepDefs {
    private LoginPage loginPage = new LoginPage();
    private static Logger logger = Logger.getLogger(LoginStepDefs.class);


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
        // Driver.get() --> this gets the webdriver
        // Driver.get()  === driver

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        logger.info("opening the browser");
    }

    @When("user login as Bank Manager Login")
    public void user_login_as_Bank_Manager_Login() {
        loginPage.bankManagerLogin.click();
        logger.info("clicking in Bank Manager");

        //BrowserUtils.waitFor(5);

    }

    @Then("he adds new customer under customer tab")
    public void he_adds_new_customer_under_customer_tab() {
        loginPage.addCustomer.click();
        logger.info("add customer click");
        loginPage.addFirstName.sendKeys("Tabriz");
        logger.info("typing first name");
        loginPage.addLastName.sendKeys("Huseynov");
        logger.info("typing last name");
        loginPage.addPostCode.sendKeys("22202");
        logger.info("typing zipcode");
        loginPage.submitCustomer.click();
        logger.info("submit customer");
        String allertMessage = Driver.get().switchTo().alert().getText();
        logger.info("validating customer addition");
        Assert.assertTrue(allertMessage.contains("Customer added successfully with customer id"));

    }

    @Then("verifies that customer added in the Customers tab")
    public void verifies_that_customer_added_in_the_Customers_tab() {
        String allertMessage = Driver.get().switchTo().alert().getText();
        logger.info("alert handling");
        Assert.assertTrue(allertMessage.contains("Customer added successfully with customer id"));
        Driver.get().switchTo().alert().accept();
        loginPage.CustomerTab.click();
        String newUser = Driver.get().findElement(By.xpath("//tbody")).getText();
        logger.info("validate new user");
        Assert.assertTrue(newUser.contains("Tabriz Huseynov 22202"));
    }

    @Then("user navigates to Customers")
    public void user_navigates_to_Customers() {
        loginPage.CustomerTab.click();
        logger.info("clicking customer tab");
    }

    @Then("user deletes the user Ron Weasley")
    public void user_deletes_the_user_Ron_Weasley() {
        Driver.get().findElement(By.cssSelector("[ng-model='searchCustomer']")).sendKeys("Ron");
        logger.info("search for Ron");
        Driver.get().findElement(By.cssSelector("[ng-click='deleteCust(cust)']")).click();
        BrowserUtils.waitFor(5);
    }

    @When("user login as Customer")
    public void user_login_as_Customer() {
        loginPage.CustomerLogin.click();
        logger.info("loging in as customer");

    }

    @Then("user choose the name and logs in")
    public void user_choose_the_name_and_logs_in() {
        Select userNames = new Select(Driver.get().findElement(By.name("userSelect")));
        userNames.selectByVisibleText("Harry Potter");
        logger.info("find Harry Potter");
        Driver.get().findElement(By.xpath("//*[text()='Login']")).click();


    }

    @Then("user deposits the money and verifies balance")
    public void user_deposits_the_money_and_verifies_success_message() {
        loginPage.depositButton.click();
        loginPage.amountPlaceHolder.sendKeys("1000");
        logger.info("depositing money");
        loginPage.submit.click();
        logger.info("submit");
        String totalBalance = loginPage.balance.getText();
        logger.info("verify the balance");
        Assert.assertEquals(totalBalance, "1000");

    }

    @Then("user tries to withdraw amount more than in balance")
    public void user_tries_to_withdraw_amount_more_than_in_balance() {
        loginPage.withDrawl.click();
        logger.info("click withdraw money");
        BrowserUtils.waitFor(1);
        loginPage.amountPlaceHolder.sendKeys("1500");
        logger.info("send amount 1500");
        loginPage.submit.click();
        logger.info("submit withdraw amount");


    }

    @And("user verifies error message")
    public void user_verifies_error_message() {
        logger.info("verify error message");
        Assert.assertEquals(loginPage.errorMessage.getText(),"Transaction Failed. You can not withdraw amount more than the balance.");

    }


}






