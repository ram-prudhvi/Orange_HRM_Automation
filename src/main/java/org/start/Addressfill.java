package org.start;

import lombok.experimental.FieldDefaults;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Addressfill extends Signup{

    public Addressfill(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//input[@data-qa=\"first_name\"]") WebElement fname;
    @FindBy(xpath = "//input[@data-qa=\"last_name\"]") WebElement lanem;
    @FindBy(xpath = "//input[@data-qa=\"company\"]") WebElement cname;
    @FindBy(xpath = "//input[@data-qa=\"address\"]") WebElement address;
    @FindBy(xpath = "//select[@data-qa=\"country\"]") WebElement scountry;
    @FindBy(xpath = "//input[@data-qa=\"state\"]") WebElement statename;
    @FindBy(xpath = "//input[@data-qa=\"city\"]") WebElement cityname;
    @FindBy(xpath = "//input[@data-qa=\"zipcode\"]") WebElement zcode;
    @FindBy(xpath = "//input[@data-qa=\"mobile_number\"]") WebElement mnumber;
    @FindBy(xpath = "//button[@data-qa=\"create-account\"]") WebElement cbutton;

    public void Address(String first, String last, String company, String Address, String country,String state, String city, String zipcode, String mobile)
    {
        fname.sendKeys(first);
        lanem.sendKeys(last);
        cname.sendKeys(company);
        address.sendKeys(Address);
        new Select(scountry).selectByVisibleText(country);
        statename.sendKeys(state);
        cityname.sendKeys(city);
        zcode.sendKeys(zipcode);
        mnumber.sendKeys(mobile);
        cbutton.click();
    }


}
