package com.execute_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "loginLink")
    public WebElement loginNav;

    @FindBy(xpath = "//a[text()='Employee List']")
    public WebElement employeeListNav;
}
