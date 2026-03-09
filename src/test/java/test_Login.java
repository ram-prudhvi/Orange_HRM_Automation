import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.start.Login_Page;
import org.testng.Assert;
import org.testng.annotations.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class test_Login  {
 public WebDriver driver;
 public Logger logger;
 @FindBy(xpath = "//h6[text()=\"Dashboard\"]") WebElement dash;
@BeforeMethod
    public void url()
{

    logger = LogManager.getLogger(this.getClass());   //get the class name and stored in logger Variable
    driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

}
@Test()
    public void login_test1() throws InterruptedException {
    try {
        logger.info("****** First test is Started *****");
        Login_Page obj = new Login_Page(driver);
        logger.info("Enter the username .....");
        logger.info("Enter the Password ......");
        obj.login("Admi", "admin123");
        Assert.assertTrue(dash.isDisplayed());
        logger.info("Login Successful");

    }
    catch (Exception e) {
        // Ikkada Error mariyu Debug logs kachitanga record avthayi
        logger.error("Test Failed: Element not found or Login issue");
        logger.debug("Exception details: " + e.getMessage());
        Assert.fail("Test failed due to exception");
    }
}
@Test()
    public void login_test2() throws InterruptedException {
    logger.info("***** Second test is Started *****");
    Login_Page obj=new Login_Page(driver);
    logger.info("Enter the username .....");
    logger.info("Enter the Password ......");
    obj.login("Admin","admin123");
    }

@AfterMethod
    public void browser_quit()
    {
    driver.quit();
    }
}
