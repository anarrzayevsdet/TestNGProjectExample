package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrmHomePage {

    HrmPIMPage hrmPIMPage;

    WebDriver driver;

    public HrmHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


 public WebElement getTab(String tabName){
        return driver.findElement(By.xpath("//a[@class='firstLevelMenu']/b[text()='"+tabName+"']"));
 }





}
