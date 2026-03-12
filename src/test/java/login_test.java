import org.apache.logging.log4j.core.net.Priority;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.start.Login_Page;
import org.start.login_auto;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login_test {
    WebDriver driver;
    @FindBy(xpath = "//a[@href=\"/logout\"]")
    WebElement logout;
    @BeforeClass
    public void launchig()
    {
        driver=new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
    @Test(priority = 1)
    public void logiing()
    {
        login_auto obj =new login_auto(driver);
        obj.loging("boppanabhargav7@gmail.com","ram@1234");
    }
    @Test(priority = 2)
    public void checking() throws InterruptedException {
        Thread.sleep(4000);
       System.out.println(logout.isDisplayed());
    }
    @Test (priority = 3)
    public void quiting(){
        driver.quit();
    }


}
