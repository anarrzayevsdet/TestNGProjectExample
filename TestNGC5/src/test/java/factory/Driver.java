package factory;

import org.openqa.selenium.WebDriver;

public class Driver {


   private Driver(){}


   private static Driver instance= new Driver();


   public static Driver getInstance(){
       return instance;
   }

   ThreadLocal<WebDriver> driver = new ThreadLocal<>();


   public void setDriver(WebDriver driver){
       this.driver.set(driver);
   }

   public WebDriver getDriver(){
       return driver.get();
   }



}
