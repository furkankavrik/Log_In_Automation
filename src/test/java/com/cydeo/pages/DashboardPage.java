package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='openedMenu']/nav/ul/li[4]")
    public WebElement logout_button;

    @FindBy(xpath ="//div[@id='settings']")
    public WebElement account_button;






}
