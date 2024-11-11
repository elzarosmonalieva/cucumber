package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

import static utilities.Driver.driver;

public class GoogleSearchPage {

    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//textarea[@aria-label='Search']")
    public WebElement searchBox;
    @FindBy(xpath = "(//input[@value='Google Search'])[2]")
    public WebElement searchButton;
    @FindBy(xpath = "//a/h3")
    public List<WebElement>searchResults;
}
