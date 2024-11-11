package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.CommonsPage;
import utilities.Driver;

public class CaloriesSteps {
    WebDriver driver = Driver.getDriver();
    CommonsPage commonsPage = new CommonsPage();

    @Given("user goes to {string}")
    public void user_goes_to(String url) {
       driver.get(url);
    }
    @Then("user clicks on vegan")
    public void clicks_on_vegan() {
       commonsPage.vegan.click();
        System.out.println("user has chosen Vegan option");
    }

    @Given("user enters {int} calories")
    public void user_enters_calories(Integer amountOfCalories) {
        commonsPage.caloriesInput.clear();
        commonsPage.caloriesInput.sendKeys(amountOfCalories.toString());
        System.out.println("user entered calories :" +amountOfCalories);

    }
    @Then("user selects {int} meals")
    public void user_selects_meals(Integer amountOfMeals) {
        Select select = new Select(commonsPage.numOfMeals);
        select.selectByValue(amountOfMeals.toString());
        System.out.println("user selected " + amountOfMeals+" meals");
    }

    @Then("user clicks on generate")
    public void user_clicks_on_generate() {
        commonsPage.generate.click();
        System.out.println("user clicked on generate button");
    }
    @Then("verify {int} meals are generated")
    public void verify_meals_are_generated(Integer expectedMeals) {
        Assert.assertTrue(expectedMeals==5);
    }
}
