package org.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page_1 {
    WebDriver driver;
    Base_Page_1(WebDriver driver)  //This Constructor Initial the Driver
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
