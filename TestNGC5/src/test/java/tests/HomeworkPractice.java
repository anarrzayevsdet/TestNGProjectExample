package tests;

import base.TestBase;
import com.github.javafaker.Faker;
import listeners.TestNGListener;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.HrmHomePage;
import pom.HrmLoginPage;
import pom.HrmPIMPage;
import testData.AddressTestData;

import java.net.http.HttpRequest;
public class HomeworkPractice extends TestBase {


//
//    3. Homework - HRM User Story 5
//    Scenario: As an admin, I should get salary range validation
//    Given I’m logged in with Admin Account
//    And I click on the PIM → Employee List
//    Then I click on an employee name
//    Then I click on the Salary tab
//    Then I click on Add button of Assigned Salary Components
//    I select values: Finance, Monthly, United States Dollars
//    And I entered a lower number than the minimum allowed salary
//    I should get an error message showing the number should be above the minimum

    @Test
    public void testUserStory5() throws InterruptedException {

        navigate(baseUrl);
        HrmLoginPage hrmLoginPage = new HrmLoginPage(getDriver());
        hrmLoginPage.loginHrm(username, password);

//    And I click on the PIM → Employee List
        HrmHomePage hrmHomePage = new HrmHomePage(getDriver());
        hrmHomePage.getTab("PIM").click();

        HrmPIMPage hrmPIMPage = new HrmPIMPage(getDriver());
        hrmPIMPage.
                clickEmployeeButton().
                clickTableHeaderId().
                selectUserById("0001").
                selectLeftPanelOption("Salary").
                clickAddSalary().
                selectPAyGradeDropdownOption("Finance").
                enterSalaryComponent("Base").
                selectPayFrequencyDropdownOption("Monthly").
                selectCurrencyDropdownOption().
                enterAmount("65");

        String errorMessage = hrmPIMPage.getErrorMessage();
        Assert.assertNotNull(errorMessage);

//    Then I click on Add button of Assigned Salary Components
    }



























//    2. Homework - HRM User Story 4
//    Scenario: As an admin, I should be able to successfully add Contact Details
//    Given I’m logged in with Admin Account
//    And I click on the PIM → Employee List
//    Then I click on an employee name
//    I click on contact Details
//    Then I click on Edit and Fill out Address
//    Then I click on Save
//    And I verify the address is displayed


    @Test
    public void testUserStory4() {
        AddressTestData addressTestData = new AddressTestData();
//     Given I’m logged in with Admin Account
        navigate(baseUrl);
        HrmLoginPage hrmLoginPage = new HrmLoginPage(getDriver());
        hrmLoginPage.loginHrm(username, password);

//    And I click on the PIM → Employee List
        HrmHomePage hrmHomePage = new HrmHomePage(getDriver());
        hrmHomePage.getTab("PIM").click();

        HrmPIMPage hrmPIMPage = new HrmPIMPage(getDriver());
        hrmPIMPage.
                clickEmployeeButton().
                clickTableHeaderId().
                selectUserById("0001").
                selectLeftPanelOption("Contact Details").
                clickContactDetailSaveButton().
                enterContactStreet1(addressTestData.getAddressStreet1()).
                enterContactStreet2(addressTestData.getAddressStreet2()).
                enterContactCity(addressTestData.getCity()).
                enterState(addressTestData.getState()).
                enterZip(addressTestData.getZipcode()).
                selectCountry(addressTestData.getCountry()).
                clickContactDetailSaveButton();

        String expectedAddress = addressTestData.getAddressStreet1();
        String actualAddressDisplayed = hrmPIMPage.addressBoxGetValue();
        Assert.assertEquals(actualAddressDisplayed, expectedAddress, "Address validation failed!");

    }




//    1. HRM User Story with Data Providers
//
//    Scenario: As a User, I should not be able to login to HRM with invalid credentials
//    Given I’m on the login page
//    When I enter an invalid username and invalid  password
//    And I click on the login button
//    Then receive an error message
//
//    Note: Use at least 4 invalid credentials and apply DataProviders


    @Test(dataProvider = "negativeLoginTestData")
    public void loginFunctionalityNegativeTestCase(String user, String pass) {
        //Given I’m on the login page
        navigate(baseUrl);
        String expectedErrorMessage = "Invalid credentials";
        //When I enter an invalid username and invalid  password
        HrmLoginPage hrmLoginPage = new HrmLoginPage(getDriver());
        hrmLoginPage.loginHrm(user, pass);
        Assert.assertEquals(hrmLoginPage.getErrorMessage(), expectedErrorMessage, "Error message validation failed");

    }

    @DataProvider(name = "negativeLoginTestData", parallel = false)
    public Object[][] getDataLoginNegative() {
        Object[][] obj = new Object[4][2];
        Faker faker = new Faker();
        for (int i = 0; i < obj.length; i++) {

            for (int j = 0; j < obj[i].length; j++) {
                if (j == 0)
                    obj[i][j] = faker.name().username();
                else
                    obj[i][j] = faker.random().hex();
            }
        }
        return obj;
    }


}
