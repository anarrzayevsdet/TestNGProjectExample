package base;

import factory.BrowserFactory;
import factory.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class TestBaseSingleton {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod
    public void setUp(String browser){
        WebDriver driver = BrowserFactory.createInstance(browser);
        Driver.getInstance().setDriver(driver);
        Driver.getInstance().getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        Driver.getInstance().getDriver().close();
    }

    public void launcher(String url){
        Driver.getInstance().getDriver().get(url);
        System.out.println("The title of current page is: "+ Driver.getInstance().getDriver().getTitle());
    }




}
