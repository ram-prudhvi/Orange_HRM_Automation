import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.start.Login_Page;
import org.testng.annotations.*;



public class test_Login  {
 public WebDriver driver;
@BeforeMethod
    public void url()
{
    driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

}
@Test()
    public void login_test1() throws InterruptedException {
        Login_Page obj=new Login_Page(driver);
        obj.login("Admi","admin123");
    }
@Test()
    public void login_test2() throws InterruptedException {
    Login_Page obj=new Login_Page(driver);
    obj.login("Admin","admin123");
    }

@AfterMethod
    public void browser_quit()
    {
    driver.quit();
    }
}
