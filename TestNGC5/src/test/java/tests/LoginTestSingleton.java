package tests;

import base.TestBaseSingleton;
import factory.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.LandingPage;
import pom.LoginPage;

public class LoginTestSingleton extends TestBaseSingleton {



    @Test
    public void loginMealB(){

        Driver.getInstance().getDriver().get("http://dev-mb.yoll.io/");
        String expectedTenantName = "Toochee, Inc.";
        LandingPage landingPage = new LandingPage(Driver.getInstance().getDriver());
        landingPage.signInButton.click();
        LoginPage loginPage = new LoginPage(Driver.getInstance().getDriver());
        loginPage.usernameInputBox.sendKeys("Company");
        loginPage.passwordInputBox.sendKeys("12345");
        loginPage.loginButton.click();
        HomePage homePage = new HomePage(Driver.getInstance().getDriver());
        String tenantName = homePage.tenantName.getText();
        Assert.assertEquals(tenantName,expectedTenantName,"Tenant name validation failed");

//
//        Driver.getInstance().getDriver().get("http://dev-mb.yoll.io/");
//        Driver.getInstance().getDriver().findElement(By.linkText("SIGN IN")).click();
//        Driver.getInstance().getDriver().findElement(By.name("usernameOrEmailAddress")).sendKeys("Company");
//        Driver.getInstance().getDriver().findElement(By.name("Password")).sendKeys("12345");
//        Driver.getInstance().getDriver().findElement(By.id("LoginButton")).click();
//        String tenantName = Driver.getInstance().getDriver().findElement(By.cssSelector(".pr-5.pl-5")).getText();

    }



}
