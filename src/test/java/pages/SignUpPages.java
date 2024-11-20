package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUpPages {
    public SignUpPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@class='MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButtonBase-root css-k6k41x']")
    public WebElement signUpButton;
    @FindBy(id = "email_input_text")
    public WebElement email;

    @FindBy(id = "password_input_text")
    public WebElement password;
    @FindBy(id = "repeat_password_input_text")
    public WebElement repeatPassword;
    @FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root css-1hz3hle']")
    public WebElement continueButton;
    @FindBy(name = "first_name")
    public WebElement firstName;
    @FindBy(name = "last_name")
    public WebElement lastName;
    @FindBy(id = "company_name_input_text")
    public WebElement businessName;
    @FindBy(id = "mui-component-select-business_area_id")
    public WebElement areaOfBusiness;
    @FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiMenu-paper MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-177ic5c']//li[@data-value='3']")
    public WebElement IT;
    @FindBy(id = "address_input_text")
    public WebElement address;
    @FindBy(id = "mui-component-select-currency")
    public WebElement currency;
    @FindBy(xpath = "//li[@data-value='USD']")
    public WebElement chosenCurrency;
    @FindBy(xpath = "//button[@form='register-form-2']")
    public WebElement signUp;
}
