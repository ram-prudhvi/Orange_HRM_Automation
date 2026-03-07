import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


//ITestListener is an interface
public class MyListener extends TestListenerAdapter {
    @Override //Before test class its start only once it is executed
    public void onStart(ITestContext context) {
        System.out.println("This is on start");
    }
    @Override  //this method worked when test starts before execute each test method
    public void onTestStart(ITestResult result) {
        System.out.println("This is on Test start");

    }

    @Override //this method execute when test is Pass
    public void onTestSuccess(ITestResult result) {
        System.out.println("This is on Test Pass");
    }

    @Override //this method  execute when test is fail
    public void onTestFailure(ITestResult result) {
        System.out.println("This is on Test Fail");
    }

    @Override //this method execute when  test is skipped
    public void onTestSkipped(ITestResult result) {
        System.out.println("This is on Test Skipped");
    }
    @Override //this method execute when all class is completed
    public void onFinish(ITestContext context) {
        System.out.println("This is on Test completed");

    }
}
