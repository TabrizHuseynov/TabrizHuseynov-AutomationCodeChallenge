package com.xyz_bank.pages;
import com.xyz_bank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement userName;


    @FindBy(css="[ng-click='manager()']")
    public WebElement bankManagerLogin;

    //[ng-click='addCust()']
    @FindBy(css="[ng-click='addCust()']")
    public WebElement addCustomer;


    @FindBy(css="[ng-model='fName']")
    public WebElement addFirstName;

    @FindBy(css="[ng-model='lName']")
    public WebElement addLastName;

    @FindBy(css="[ng-model='postCd']")
    public WebElement addPostCode;

    @FindBy(css="[class='btn btn-default']")
    public WebElement submitCustomer;


    @FindBy(css="[ng-click='showCust()']")
    public WebElement CustomerTab;

    @FindBy(css="[ng-click='customer()']")
    public WebElement CustomerLogin;


    @FindBy(css="[ng-click='deposit()']")
    public WebElement depositButton;

    @FindBy(css = "[ng-model='amount']")
    public WebElement amountPlaceHolder;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "(//strong[@class='ng-binding'])[2]")
    public WebElement balance;

    @FindBy(css = "[ng-click='withdrawl()']")
    public WebElement withDrawl;

    @FindBy(css = "[ng-show='message']")
    public WebElement errorMessage;




}
