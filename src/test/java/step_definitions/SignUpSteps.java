package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SignUpPages;
import utilities.Driver;

public class SignUpSteps {
    WebDriver driver = Driver.getDriver();
    SignUpPages signUpPages = new SignUpPages();
    Faker faker = new Faker();
    String fakeEmail = faker.internet().emailAddress();
    String fakeCompany = faker.internet().domainName();

    @Given("the user is on sign up page")
    public void the_user_is_on_sign_up_page() {
        driver.get("https://cashwise.us/main");
    }

    @Then("user clicks on sign up button")
    public void user_clicks_on_sign_up_button() {
        signUpPages.signUpButton.click();
    }

    @Then("user fills up all the required fields")
    public void user_fills_up_all_the_required_fields() throws InterruptedException {
        signUpPages.email.sendKeys(fakeEmail);
        signUpPages.password.sendKeys("qwerty1234");
        signUpPages.repeatPassword.sendKeys("qwerty1234");
        signUpPages.continueButton.click();
        signUpPages.firstName.sendKeys("Lisa");
        signUpPages.lastName.sendKeys("Albert");
        signUpPages.businessName.sendKeys(fakeCompany);
        signUpPages.areaOfBusiness.click();
        signUpPages.IT.click();
        signUpPages.address.sendKeys("hello st 234");
        signUpPages.currency.click();
        signUpPages.chosenCurrency.click();
        signUpPages.signUp.click();


    }

    @Then("user has to verify if account is created successfully")
    public void user_has_to_verify_if_account_is_created_successfully() {
        Assert.assertNotEquals(driver.getCurrentUrl(), "https://cashwise.us/dashboard/infographics");
    }
}
