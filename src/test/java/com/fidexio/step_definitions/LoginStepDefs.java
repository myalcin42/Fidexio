package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utils.ConfigurationReader;
import com.fidexio.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));
    }
    @When("User enters valid email {string}")
    public void user_enters_valid_email(String email) {
        loginPage.inputEmail.sendKeys(email);
    }

    @When("User enters valid password {string}")
    public void user_enters_valid_password(String password) {
        loginPage.inputPassword.sendKeys(password);
    }
    @When("User clicks log in button")
    public void user_clicks_log_in_button() {
        loginPage.loginButton.click();
    }
    @Then("User should be on the homepage")
    public void user_should_be_on_the_homepage() {
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

    }

}
