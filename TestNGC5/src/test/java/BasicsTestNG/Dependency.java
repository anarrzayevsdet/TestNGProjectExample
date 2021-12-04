package BasicsTestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dependency {


    @Test(priority = 0)
    public void login() {
        System.out.println("Login to HRM...");
    }

    @Test(dependsOnMethods = {"checkMaxEmployees"})
    public void addEmployee() {
        System.out.println("Employee added...");
    }

    @Test(priority = 2)
    public void deleteEmployee() {
        System.out.println("Employee deleted...");
    }

    @Test(priority = 1)
    public void checkMaxEmployees(){
        System.out.println("Check if max employees...");
        System.out.println("If max, then delete the last one...");
    }


}
