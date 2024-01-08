package com.execute_automation.step_definitions;

import com.execute_automation.pages.CreateEmployeePage;
import com.execute_automation.pages.EmployeePage;
import com.execute_automation.pages.HomePage;
import com.execute_automation.pages.LoginPage;
import com.execute_automation.utilities.ConfigurationReader;
import com.execute_automation.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.bidi.log.Log;

import java.util.List;
import java.util.Map;

public class AddAndDeleteEmployeeStepDef {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    EmployeePage employeePage = new EmployeePage();
    CreateEmployeePage createEmployeePage = new CreateEmployeePage();

    @Given("The user navigates to home page")
    public void the_user_navigates_to_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user navigates to login page")
    public void theUserNavigatesToLoginPage() {
        homePage.loginNav.click();
    }

    @And("The user logins as admin")
    public void theUserLoginsAsAdmin() {
        loginPage.loginAsAdmin();
    }

    @When("The user navigates to Employee List Page")
    public void theUserNavigatesToEmployeeListPage() {
        homePage.employeeListNav.click();
    }

    @And("The user clicks Create New button")
    public void theUserClicksCreateNewButton() {
        employeePage.employeeListSize = employeePage.employeeList.size();
        employeePage.createEmployeeButton.click();
    }


    @And("The user enters the credentials as Name: {string}, Salary: {string}, Duration Worked: {string}, Grade: {string}, Email: {string}")
    public void theUserEntersTheCredentialsAsNameSalaryDurationWorkedGradeEmail(String name, String salary, String durationWorked, String grade, String email) {
        createEmployeePage.nameInput.sendKeys(name);
        createEmployeePage.salaryInput.sendKeys(salary);
        createEmployeePage.durationWorkedInput.sendKeys(durationWorked);
        createEmployeePage.gradeInput.sendKeys(grade);
        createEmployeePage.emailInput.sendKeys(email);
        employeePage.employeeData.put("name",name);
        employeePage.employeeData.put("salary",salary);
        employeePage.employeeData.put("durationWorked",durationWorked);
        employeePage.employeeData.put("grade",grade);
        employeePage.employeeData.put("email",email);
    }

    @And("Clicks the create button")
    public void clicksTheCreateButton() {
        createEmployeePage.createButton.click();
    }

    @Then("The new employee info should be in Employee List page")
    public void theNewEmployeeInfoShouldBeInEmployeeListPage() {
        employeePage.verifyEmployeeIsInTable();
    }

    @And("The user deletes the new employee")
    public void theUserDeletesTheNewEmployee() {
        employeePage.deleteTheLastUserInTheList();
    }

    @Then("The new employee should be deleted in Employee List")
    public void theNewEmployeeShouldBeDeletedInEmployeeList() {
        String email = employeePage.employeeData.get("email");

        Assert.assertFalse(Driver.get().findElement(By.xpath("//body")).getText().contains(email));
    }
}
