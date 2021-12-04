package testData;

import BasicsTestNG.User;
import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;

public class TestData {

    @DataProvider(name="dataSet2")
    public Object[][] getData2(){
//        Object[][] obj = new Object[5][3];
//        obj[0][0] = ""

        return new Object[][]{
                {"Name",10,"Jow"},
                {"Name2",20,"Joe"},
                {"Name3",30,"Joe2"},
                {"Name4",40,"Joe3"},
                {"Name5",50,"Joe4"},
        };
    }


    @DataProvider(name = "dataSet")
    public Object[][] getData(){
        return new Object[][]{
                {"Name"},
                {"Name2"},
                {"Name3"}
        };
    }


    @DataProvider(name = "dynamic", parallel = true)
    public Object[][] getData3(){
        Object[][] obj = new Object[10][1];
        Faker fake = new Faker();
        for (int i = 0; i < obj.length; i++) {
            obj[i][0]= fake.funnyName().name() + fake.name().lastName();
        }
        return obj;
    }



}
