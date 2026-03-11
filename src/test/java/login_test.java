import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.start.Login_Page;
import org.start.login_auto;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login_test {
    WebDriver driver;
    @Test
    @BeforeClass
    public void launchig()
    {
        driver=new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
    @Test
    public void logiing()
    {
        login_auto obj =new login_auto(driver);
        obj.loging("boppanabhargav7@gmail.com","ram@1234");
    }
}
