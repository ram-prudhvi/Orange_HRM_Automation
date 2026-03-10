import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.start.Base_Page_1;
import org.start.Signup;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.TestListenerAdapter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sign_up extends TestListenerAdapter {
    WebDriver driver;
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']") WebElement check;
    @BeforeClass
    public void launchig()
    {
        driver=new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
    @Test(priority = 1)
    public void signing() throws InterruptedException {
        Signup obj=new Signup(driver);
        obj.launch("ram","prudhvi@gmail.com");
    }

    @Test(priority = 2)
    public void check()
    {
       String display= check.getText();
       String expected ="ENTER ACCOUNT INFORMATION";
        Assert.assertEquals(display,expected);
    }
    @Test(priority = 3)
    public void quit()
    {
        driver.quit();
    }

}
