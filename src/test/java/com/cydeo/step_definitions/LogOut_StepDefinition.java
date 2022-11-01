package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOut_StepDefinition {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Then("Verify user should return login page.")
    public void verify_user_should_return_login_page() {
        //System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals("Trycloud QA", Driver.getDriver().getTitle());
    }

    @When("User clicks step back button")
    public void user_clicks_step_back_button() {
        Driver.getDriver().navigate().back();
    }
    @Then("Verify user should not go to home page by clicking step back button.")
    public void verify_user_should_not_go_to_home_page_by_clicking_step_back_button() {
        Assert.assertFalse(Driver.getDriver().getTitle().equalsIgnoreCase("Dashboard - Trycloud QA"));
    }
}
