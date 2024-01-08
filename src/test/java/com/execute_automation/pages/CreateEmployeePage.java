package com.execute_automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmployeePage extends BasePage{

    @FindBy(id = "Name")
    public WebElement nameInput;

    @FindBy(id = "Salary")
    public WebElement salaryInput;

    @FindBy(id = "DurationWorked")
    public WebElement durationWorkedInput;

    @FindBy(id = "Grade")
    public WebElement gradeInput;

    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@class='btn btn-default']")
    public WebElement createButton;

}
