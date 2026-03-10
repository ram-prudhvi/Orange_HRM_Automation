package org.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class Signup extends Base_Page_1{

    public Signup(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']") WebElement Signupbutton;
    @FindBy(xpath = "//input[@placeholder='Name']") WebElement name;
    @FindBy(xpath = "//input[@data-qa='signup-email']") WebElement email;
    @FindBy(xpath = "//button[normalize-space()='Signup']") WebElement signupbuttonc;

    public void launch(String sname, String semail) throws InterruptedException {
        Thread.sleep(5000);
        Signupbutton.click();
        name.sendKeys(sname);
        email.sendKeys(semail);
        signupbuttonc.click();

    }


}
