package base;

import factory.Driver1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase1 {




    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Driver1.getInstance().setDriver(driver);
    }

    @AfterMethod
    public void tearDown() {
        Driver1.getInstance().getDriver().close();
    }



    public void launcher(String url) {
        Driver1.getInstance().getDriver().get(url);
        System.out.println("The title of current page is: " + Driver1.getInstance().getDriver().getTitle());
    }



}
