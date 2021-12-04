package BasicsTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
    String message = "Hello World";
    int number = 50;
    boolean flag = false;


    @Test
    public void hardAssert() {
        User user1 = new User();
        user1.name = "Adam";

        User user2 = new User();
        user2.name = "Adam";


        Assert.assertEquals("Hello World", message, "Message validation failed!");
        System.out.println("Pass...");
        Assert.assertTrue(number == 50, "Number validation failed!");
        System.out.println("Pass...");
        Assert.assertFalse(flag, "Boolean validation failed");
        System.out.println("Pass...");
        Assert.assertEquals(user1, user1, "Object validation failed");

    }


    @Test
    public void softAssert() {

        User user1 = new User();
        user1.name = "Adam";

        User user2 = new User();
        user2.name = "Adam";

        SoftAssert softAssert = new SoftAssert();


        softAssert.assertEquals("Hello World", message, "Message validation failed!");
        System.out.println("Pass...");
        softAssert.assertTrue(number == 50, "Number validation failed!");
        System.out.println("Pass...");
        softAssert.assertFalse(flag, "Boolean validation failed");
        System.out.println("Pass...");
        softAssert.assertSame(user1, user1, "Object validation failed");
        System.out.println("Pass...");
        softAssert.assertAll();


    }


}
