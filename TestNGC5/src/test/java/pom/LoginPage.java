package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver = null;


    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "usernameOrEmailAddress")
    public WebElement usernameInputBox;

    @FindBy(name = "Password")
    public WebElement passwordInputBox;

    @FindBy(id = "LoginButton")
    public WebElement loginButton;

}
