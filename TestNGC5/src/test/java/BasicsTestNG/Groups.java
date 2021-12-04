package BasicsTestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups {

    @BeforeGroups(value = {"smoke"})
    public void beforeGroup(){
        System.out.println("before");
    }


    @AfterGroups(value= {"smoke"})
    public void afterGroup(){
        System.out.println("after");
    }

    @Test(groups = {"regression"})
    public void method1(){
        System.out.println("Method1 got executed...");
    }

    @Test(groups = {"regression"})
    public void method2(){
        System.out.println("Method2 got executed...");
    }

    @Test(groups = {"regression"})
    public void method3(){
        System.out.println("Method3 got executed...");
    }

    @Test(groups = {"smoke"})
    public void method4(){
        System.out.println("Method4 got executed...");
    }

    @Test(groups = {"smoke"})
    public void method5(){
        System.out.println("Method5 got executed...");
    }

    @Test(groups = {"smoke"})
    public void method6(){
        System.out.println("Method6 got executed...");
    }



}
