package base;

import factory.BrowserFactory;
import factory.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigLoader;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public final String baseUrl = ConfigLoader.getInstance().getBaseUrl();
    public final String username = ConfigLoader.getInstance().getUsername();
    public final String password = ConfigLoader.getInstance().getPassword();



    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public void setDriver(WebDriver driver){
        this.driver.set(driver);
    }

    public WebDriver getDriver(){
        return driver.get();
    }


    @BeforeMethod
    public void setUp(){
        WebDriver driverType = BrowserFactory.createInstance("CHROME");
        setDriver(driverType);
        getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        getDriver().close();
    }


    public void navigate(String url){
        getDriver().get(url);
    }






}
