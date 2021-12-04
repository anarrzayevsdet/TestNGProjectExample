package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class SalaryPage {

    public WebDriver driver = null;


    public SalaryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "input[id='addSalary']")
    public WebElement addSalaryButton;

    @FindBy(css = "select[id='salary_sal_grd_code']")
    public WebElement payGradeDropdown;

    @FindBy(css = "#salary_salary_component")
    public WebElement salaryComponentInputBox;

    @FindBy(id = "salary_payperiod_code")
    public WebElement payFrequencyDropdown;

    @FindBy(id = "salary_currency_id")
    public WebElement currencyDropdown;

    @FindBy(id = "salary_basic_salary")
    public WebElement amountInputBox;

    @FindBy(xpath = "//span[text()='Should be within Min/Max values']")
    public WebElement errorMessage;


}
