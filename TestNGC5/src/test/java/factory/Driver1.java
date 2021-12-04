package factory;

import org.openqa.selenium.WebDriver;

public class Driver1 {

    private Driver1(){};

    private static Driver1 instance = new Driver1();

    ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static Driver1 getInstance(){
        return instance;
    }

    public void setDriver(WebDriver driver){
        this.driver.set(driver);
    }

    public WebDriver getDriver(){
        return driver.get();
    }




}
