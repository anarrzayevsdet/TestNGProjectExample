package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrmLoginPage {
    WebDriver driver;

    public HrmLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="txtUsername")
    private WebElement usernameInputBox;

    @FindBy(id="txtPassword")
    private WebElement passwordInputBox;

    @FindBy(id="btnLogin")
    private WebElement loginButton;

    @FindBy(css="span[id='spanMessage']")
    private WebElement errorMessageElement;

    public void loginHrm(String username, String password){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }

    public String getErrorMessage(){
        return errorMessageElement.getText();
    }



}
