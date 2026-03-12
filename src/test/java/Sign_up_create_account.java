import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.start.Addressfill;
import org.start.Signup;
import org.start.createaccount;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Sign_up_create_account extends TestListenerAdapter {

    WebDriver driver;
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']") WebElement check;
    @BeforeClass
    @Parameters({"os","browser"})
    public void launchig(String os, String br)
    {
        switch (br.toLowerCase()) {
            case "chrome" : driver=new ChromeDriver(); break;
            case "safari" : driver=new SafariDriver(); break;
            case "firefox" : driver=new FirefoxDriver(); break;
            default: System.out.println("Invalid Browser name"); return;
        }
        driver.manage().deleteAllCookies();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
    @Test(priority = 1)
    public void signing() throws InterruptedException {
        Signup obj=new Signup(driver);
        obj.launch("ram1","prudhvi1@gmail.com");
    }

    @Test(priority = 2)
    public void check() throws InterruptedException {
       String display= check.getText();
       String expected ="ENTER ACCOUNT INFORMATION";
        Assert.assertEquals(display,expected);
        Thread.sleep(7000);
    }
    @Test(priority = 3)
    public void creating() throws InterruptedException {
        createaccount obj =new createaccount(driver);
        obj.radiobutton("Mr.","ram@1234");
        obj.days_select("1","March","2020");
    }

    @Test(priority = 4)
    public void account()
    {
        Addressfill obj =new Addressfill(driver);
        obj.Address("ram","prudhvi","ratna","Hyd","Canada", "Tl","gach","50001","1234567890");
    }
   // @Test(priority = 4)
    public void quit()
    {
        driver.quit();
    }

}
