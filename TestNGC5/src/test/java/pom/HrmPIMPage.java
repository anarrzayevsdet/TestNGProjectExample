package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HrmPIMPage {
    WebDriver driver;
    SalaryPage salaryPage;
    WebDriverWait wait;

    public HrmPIMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[id='btnSave']")
    public WebElement contactDetailEditButton;

    public HrmPIMPage clickContactDetailSaveButton() {
        contactDetailEditButton.click();
        return this;
    }

    @FindBy(id = "btnSave")
    public WebElement edit_save_button;

    @FindBy(id = "contact_street1")
    public WebElement street;

    public HrmPIMPage enterContactStreet1(String address) {
        street.clear();
        street.sendKeys(address);
        return this;
    }

    @FindBy(id = "contact_street2")
    public WebElement street2;

    public HrmPIMPage enterContactStreet2(String address) {
        street2.clear();
        street2.sendKeys(address);
        return this;
    }


    @FindBy(id = "contact_city")
    public WebElement city;

    public HrmPIMPage enterContactCity(String cityName) {
        city.clear();
        city.sendKeys(cityName);
        return this;
    }

    @FindBy(id = "contact_province")
    public WebElement state;

    public HrmPIMPage enterState(String stateName) {
        state.clear();
        state.sendKeys(stateName);
        return this;
    }

    @FindBy(id = "contact_emp_zipcode")
    public WebElement zip;

    public HrmPIMPage enterZip(String zipName) {
        zip.clear();
        zip.sendKeys(zipName);
        return this;
    }

    @FindBy(id = "contact_country")
    public WebElement countryDropdown;

    public HrmPIMPage selectCountry(String country) {
        selectUsingVisibleText(countryDropdown, country);
        return this;
    }


    @FindBy(id = "menu_pim_viewEmployeeList")
    public WebElement employeeListButton;

    @FindBy(xpath = "//a[text()='Id']")
    public WebElement tableHeaderId;

    public WebElement getUserByID(String id) {
        return driver.findElement(By.xpath("//tbody//a[text()='" + id + "']"));
    }

    public WebElement getLeftPanelOption(String option) {
        return driver.findElement(By.xpath("//a[text()='" + option + "']"));
    }


    public HrmPIMPage clickEmployeeButton() {
        employeeListButton.click();
        return this;
    }

    public HrmPIMPage clickTableHeaderId() {
        tableHeaderId.click();
        return this;
    }

    public HrmPIMPage selectUserById(String id) {
        getUserByID(id).click();
        return this;
    }

    public HrmPIMPage selectLeftPanelOption(String panelOption) {
        getLeftPanelOption(panelOption).click();
        return this;
    }

    public void selectUsingVisibleText(WebElement dropdown, String value) {
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(dropdown));
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
    }

    public String addressBoxGetValue() {
        return street.getAttribute("value");
    }

    public HrmPIMPage clickAddSalary() {
        salaryPage = new SalaryPage(driver);
        salaryPage.addSalaryButton.click();
        return this;
    }

    public HrmPIMPage selectPAyGradeDropdownOption(String option) {
        salaryPage = new SalaryPage(driver);
        selectUsingVisibleText(salaryPage.payGradeDropdown, option);
        return this;
    }

    public HrmPIMPage enterSalaryComponent(String salaryComp){
        salaryPage = new SalaryPage(driver);
        salaryPage.salaryComponentInputBox.clear();
        salaryPage.salaryComponentInputBox.sendKeys(salaryComp);
        return this;
    }
    //Monthly

    public HrmPIMPage selectPayFrequencyDropdownOption(String option) {
        salaryPage = new SalaryPage(driver);
        selectUsingVisibleText(salaryPage.payFrequencyDropdown, option);
        return this;
    }
    //United States Dollar

    public HrmPIMPage selectCurrencyDropdownOption() throws InterruptedException {
        salaryPage = new SalaryPage(driver);
        selectUsingVisibleText(salaryPage.currencyDropdown, "United States Dollar");
        Thread.sleep(500);
        return this;
    }

    public HrmPIMPage enterAmount(String amount){
        salaryPage = new SalaryPage(driver);
        salaryPage.amountInputBox.clear();
        salaryPage.amountInputBox.sendKeys(amount);
        return this;
    }

    public String getErrorMessage(){
        salaryPage = new SalaryPage(driver);
        return salaryPage.errorMessage.getText();
    }



}
