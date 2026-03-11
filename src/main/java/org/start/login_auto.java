package org.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_auto extends Base_Page_1{

    public login_auto(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']") WebElement Signupbutton;
    @FindBy(xpath = "//input[@data-qa='login-email']") WebElement logmail;
    @FindBy(xpath = "//input[@placeholder='Password']") WebElement pass;
    @FindBy(xpath = "//button[normalize-space()='Login']") WebElement lbutton;

    public void loging(String email, String password)
    {
        Signupbutton.click();
        logmail.sendKeys(email);
        pass.sendKeys(password);
        lbutton.click();
    }

}
