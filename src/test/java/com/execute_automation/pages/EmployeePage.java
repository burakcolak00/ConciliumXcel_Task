package com.execute_automation.pages;

import com.execute_automation.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeePage extends BasePage{
    @FindBy(xpath = "//a[text()='Create New']")
    public WebElement createEmployeeButton;
    @FindBy(xpath = "//tr")
    public List<WebElement> employeeList;

    public int employeeListSize;

    public Map<String,String > employeeData = new HashMap<>();


    public void verifyEmployeeIsInTable(){
        Assert.assertEquals(employeeData.get("name"),Driver.get().findElement(By.xpath("((//tr)["+(employeeListSize+1)+"]/td)[1]")).getText());
        Assert.assertEquals(employeeData.get("salary"),Driver.get().findElement(By.xpath("((//tr)["+(employeeListSize+1)+"]/td)[2]")).getText());
        Assert.assertEquals(employeeData.get("durationWorked"),Driver.get().findElement(By.xpath("((//tr)["+(employeeListSize+1)+"]/td)[3]")).getText());
        //Assert.assertEquals(employeeData.get("grade"),Driver.get().findElement(By.xpath("((//tr)["+(employeeListSize+1)+"]/td)[4]")).getText());
        Assert.assertEquals(employeeData.get("email"),Driver.get().findElement(By.xpath("((//tr)["+(employeeListSize+1)+"]/td)[5]")).getText());

        String grade = "";
        switch (employeeData.get("grade")) {
            case "Junior" -> grade = "1";
            case "Middle" -> grade = "2";
            case "Senior" -> grade = "3";
            case "CLevel" -> grade = "4";
            default -> System.out.println("invalid grade: " + employeeData.get("grade"));
        }

        Assert.assertEquals(grade,Driver.get().findElement(By.xpath("((//tr)["+(employeeListSize+1)+"]/td)[4]")).getText());
    }

    public  void deleteTheLastUserInTheList(){
        Driver.get().findElement(By.xpath("((//tr)["+(employeeListSize+1)+"]/td)[6]/a[3]")).click();
        Driver.get().findElement(By.xpath("//input[@value='Delete']")).click();
    }
}
