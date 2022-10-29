package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginFunctionality_StepDefinition {


    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("https://qa.trycloud.net/index.php/login");
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        loginPage.username_box.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string2) {
        loginPage.password_box.sendKeys(string2);
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.login_button.click();
    }

    @Then("Verify user should see page title is dashboard trycloud qa {string}")
    public void verify_user_should_see_page_title_is_dashboard_trycloud_qa(String string) {
        //System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(),string);
    }


    @When("User clicks log out button")
    public void user_clicks_log_out_button() {
        //System.out.println("complete me");
        dashboardPage.account_button.click();
        dashboardPage.logout_button.click();
    }

    @When("User hits the enter key from keyboard")
    public void user_hits_the_enter_key_from_keyboard() {
        //System.out.println("complete me");
        loginPage.password_box.sendKeys(""+Keys.ENTER);
    }







}
