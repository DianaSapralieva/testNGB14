package class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result){

        System.out.println("the test case has passed");
    }
    @Override
    public  void onTestFailure(ITestResult result) {
        System.out.println("the test case has failed");


    }


}
