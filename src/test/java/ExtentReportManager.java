import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ExtentReportManager implements ITestListener {

        public ExtentSparkReporter sparkReporter; // UI of the report
        public ExtentReports extent; //Populate Common information of the report the info is system info, test execute name..
        public ExtentTest test; //creating test case entries and update the status of the methods

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/Z_reports/myreports.html"); //Reports Storing file Path
        sparkReporter.config().setDocumentTitle("Automation Testing"); //Title of the report
        sparkReporter.config().setReportName("Functional Testing"); //Report Name
        sparkReporter.config().setTheme(Theme.DARK);   //Theme of the report Page

        extent =new ExtentReports();      //creating object for extentreports line no 14
        extent.attachReporter(sparkReporter);  //Attaching sparkReporter and extent

        extent.setSystemInfo("ComputerName", "Clone");
        extent.setSystemInfo("Environment","QA");
        extent.setSystemInfo("TesterName", "Ram");
        extent.setSystemInfo("OS", "MACM4");
        extent.setSystemInfo("Browsername", "Chrome");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
       test=extent.createTest(result.getName()); //creating new entety in report with methodname
        test.log(Status.PASS, "Test Case Passed Name :"+result.getName());   //Update the Status Pass/Fail/Skipped

    }

    @Override
    public void onTestFailure(ITestResult result) {
        test=extent.createTest(result.getName());
        test.log(Status.FAIL,"Test Case Failed Name :"+result.getName());
        test.log(Status.FAIL, "Getting the Failed Error :"+result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test=extent.createTest(result.getName());
        test.log(Status.SKIP,"Test Case  Skipped Name :"+result.getName());

    }


    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
