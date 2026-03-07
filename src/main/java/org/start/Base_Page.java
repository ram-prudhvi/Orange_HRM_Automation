package org.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {
    WebDriver driver;      //WebDriver Variable this is class variable it Accesses multiple Action Methods

    //Constructor
    Base_Page(WebDriver driver)  //This Constructor Initial the Driver
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Locators
}
