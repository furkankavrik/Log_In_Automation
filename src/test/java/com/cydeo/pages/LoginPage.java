package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement login_button;

    @FindBy(xpath = "//input[@id='user']")
    public WebElement username_box;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password_box;

    @FindBy(xpath = "//img[@src='/core/img/actions/toggle.svg']")
    public WebElement eye_button;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement credential_warning;

    @FindBy(xpath = "//*[@id='lost-password']")
    public WebElement forgot_password_link;




}
