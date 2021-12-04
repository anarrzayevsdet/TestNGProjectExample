package BasicsTestNG;

import org.testng.annotations.*;

public class ParametersTest {

    @Parameters({"data1","data2"})
    @Test
    public void parameterTest(String one,String two){
        System.out.println(one);
        System.out.println(two);

    }



}
