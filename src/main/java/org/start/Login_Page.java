package org.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page {
    public Login_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement username;
    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement passwords;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement loginbutton;

@FindBy(xpath = "//h6[text()=\"Dashboard\"]") WebElement dash;
    public void login(String uname, String password) throws InterruptedException {
        Thread.sleep(5000);
        username.sendKeys(uname);
        passwords.sendKeys(password);
        loginbutton.click();
        Thread.sleep(5000);
        System.out.println(dash.isDisplayed());

    }
}