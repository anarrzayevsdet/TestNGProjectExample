package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("************  My test case started ************");
        System.out.println("The name of test case is :: "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("********* Success ************");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("********* You have a FAILURE **********");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test execution started!!!!");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test execution finished!!!!");
    }
}
