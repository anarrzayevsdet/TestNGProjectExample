package BasicsTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Priority {


    @Test(priority = 0)
    public void simpleTest() {
        System.out.println("simpleTest has executed...");
    }

    @Test(priority = 5)
    public void c() {
        System.out.println("method c executed ...");
    }

    @Test(priority = 4)
    public void d() {
        System.out.println("method d executed ...");
    }

    @Test(priority = 2)
    public void a() {
        System.out.println("method a executed ...");
    }

    @Test(priority = 1)
    public void b() {
        System.out.println("method b executed ...");
    }


}
