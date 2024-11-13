package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonsPage {
    public CommonsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='input svelte-1p7c7q7'])[1]//input")
    public WebElement caloriesInput;

    @FindBy(xpath = "(//span[@class='input svelte-1p7c7q7'])[2]//select")
    public WebElement numOfMeals;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement generate;

    @FindBy(xpath = "//input[@value='keto']")
    public WebElement vegan;
}
// can you choose vegan? is this locator works?
