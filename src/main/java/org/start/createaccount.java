package org.start;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


//Creating Account With "Radio Buttons ", "Select Class ",
public class createaccount extends Base_Page_1 {

    public createaccount(WebDriver driver) {
        super(driver);
    }

    Actions ac =new Actions(driver);
    @FindBy(xpath = "//div[@class=\"clearfix\"]//div[@class=\"radio-inline\"]")
    List<WebElement> radios;

    @FindBy(xpath = "//label[normalize-space()='Mr.']")
    WebElement mr;
    @FindBy(xpath = "//label[normalize-space()='Mrs.']")
    WebElement mrs;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;


    @FindBy(xpath = "//select[@id='days']")  WebElement days;
    @FindBy(xpath = "//select[@id='months']") WebElement months;

    @FindBy(xpath = "//select[@id='years']") WebElement year;

    public void radiobutton(String value, String apassword) {
        if (value.equalsIgnoreCase("Mr.")) {
            mr.click();
        } else if (value.equalsIgnoreCase("Mrs.")) {
            mrs.click();
        }
        password.sendKeys(apassword);
    }
    public void removeAds() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Ee line page lo unna Google Ads frame ni motham remove chestundi
        js.executeScript("var ads = document.getElementsByClassName('adsbygoogle'); for (var i=0; i<ads.length; i++) { ads[i].remove(); }");
    }

    public void days_select(String dayvalue, String monthvalue, String yearvalue) throws InterruptedException {
        removeAds();
        new Select(days).selectByVisibleText(dayvalue); //new select() is called as "Anonymous Object".
        new Select(months).selectByVisibleText(monthvalue);
        new Select(year).selectByVisibleText(yearvalue);
    }
}