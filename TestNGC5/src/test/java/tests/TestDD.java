package tests;

import base.TestBase;
import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testData.TestData;
import utils.ConfigLoader;

public class TestDD extends TestBase {
    public final String baseUrl = ConfigLoader.getInstance().getBaseUrl();
    public final String username = ConfigLoader.getInstance().getUsername();
    public final String password = ConfigLoader.getInstance().getPassword();

    @Test(dataProvider = "dynamic", dataProviderClass = TestData.class)
    public void testOne(String data) throws InterruptedException {
        System.out.println(data);
        Thread.sleep(1000);
    }



    @Test(dataProvider = "dataSet2", dataProviderClass = TestData.class)
    public void testTwo(String data, Integer age, String name) {
        System.out.println(data);
        System.out.println(age);
        System.out.println(name);
    }

    @Test
    public void testProperties(){
        System.out.println(baseUrl);
        System.out.println(username);
        System.out.println(password);
        getDriver().get(baseUrl);
    }








}
