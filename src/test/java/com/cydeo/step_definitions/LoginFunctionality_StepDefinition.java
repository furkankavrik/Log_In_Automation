package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.ForgetPasswordPage;
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

    ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage();


    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("https://qa.trycloud.net/index.php/login");
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        loginPage.username_box.sendKeys(string);
        //System.out.println(Driver.getDriver().getTitle());
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
        //System.out.println(Driver.getDriver().getTitle());
        dashboardPage.account_button.click();
        dashboardPage.logout_button.click();
    }

    @When("User hits the enter key from keyboard")
    public void user_hits_the_enter_key_from_keyboard() {
        //System.out.println("complete me");
        loginPage.password_box.sendKeys(""+Keys.ENTER);
    }

    @Then("Verify user should see that wrong username or password message {string}")
    public void verify_user_should_see_that_wrong_username_or_password_message(String warning) {

        Assert.assertEquals(warning,loginPage.credential_warning.getText());
    }

    @Then("Verify user should see that please fill out this field message {string}")
    public void verify_user_should_see_that_please_fill_out_this_field_message(String string) {

        Assert.assertTrue(loginPage.password_box.getAttribute("validationMessage").equalsIgnoreCase("Lütfen bu alanı doldurun."));
    }


    @Given("User should see username text box is clear")
    public void user_should_see_username_text_box_is_clear() {
        loginPage.username_box.click();
        loginPage.username_box.clear();
    }


    @When("Verify user should see dots in password box")
    public void verify_user_should_see_dots_in_password_box() {
        loginPage.username_box.click();
        loginPage.password_box.click();
       Assert.assertTrue(loginPage.password_box.getAttribute("validationMessage").equalsIgnoreCase(""));
    }

    @When("user clicks eye button.")
    public void user_clicks_eye_button() {
        loginPage.eye_button.click();
    }

    @Then("Verify user's  password {string} should be visible")
    public void verify_user_s_password_should_be_visible(String string) {
        Assert.assertTrue(loginPage.password_box.getAttribute("value").equalsIgnoreCase(string));
    }

    @Then("Verify user should see the forgot password link")
    public void verify_user_should_see_the_forgot_password_link() {
        Assert.assertTrue(loginPage.forgot_password_link.getText().equalsIgnoreCase("Parolamı unuttum"));
        //Parolamı unuttum
        //Forgot password?
    }


    @Then("User clicks forgot password link")
    public void user_clicks_forgot_password_link() {
        loginPage.forgot_password_link.click();
    }

    @Then("Verify user should see reset password link")
    public void verify_user_should_see_reset_password_link() {
        Assert.assertTrue(forgetPasswordPage.reset_password_button.isDisplayed());
    }

    @Then("User should see {string} placeholder on Username field.")
    public void user_should_see_placeholder_on_username_field(String string) {
        Assert.assertEquals(string, loginPage.username_box.getAttribute("placeholder"));
    }

    @Then("User should see {string} placeholder on Password fields.")
    public void user_should_see_placeholder_on_password_fields(String string) {
        Assert.assertEquals(string, loginPage.password_box.getAttribute("placeholder"));
    }



}
