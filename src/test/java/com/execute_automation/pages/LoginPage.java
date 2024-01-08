package com.execute_automation.pages;

import com.execute_automation.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "UserName")
    public WebElement usernameInput;

    @FindBy(id = "Password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@class='btn btn-default']")
    public WebElement loginButton;

    public void loginAsAdmin(){
        login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
    }

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
