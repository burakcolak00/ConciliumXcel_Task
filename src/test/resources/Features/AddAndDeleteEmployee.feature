Feature: Adding and Deleting Employee Functionality

  Scenario Outline: Adding and Deleting Employee
    Given The user navigates to home page
    When The user navigates to login page
    And The user logins as admin
    When The user navigates to Employee List Page
    And The user clicks Create New button
    And The user enters the credentials as Name: "<Name>", Salary: "<Salary>", Duration Worked: "<DurationWorked>", Grade: "<Grade>", Email: "<Email>"
    And Clicks the create button
    Then The new employee info should be in Employee List page
    And The user deletes the new employee
    Then The new employee should be deleted in Employee List
    Examples:
      | Name         | Salary | DurationWorked | Grade  | Email             |
      | sample_name  | 123    | 1              | Middle | 123@gmail.com     |
      | sample_name1 | 123456 | 2              | Middle | 1234@gmail.com    |
      | sample_name2 | 12345  | 3              | CLevel | 12345@gmail.com   |
      | sample_name3 | 1234   | 4              | Senior | 123456@gmail.com  |
      | sample_name4 | 12     | 5              | Junior | 1234567@gmail.com |

#  TEST Scenario Steps:
#
#
#
#  1- Navigate to "http://eaapp.somee.com/"
#
#  2- Login as admin
#
#  3- Go to Employee List page
#
#  4- Create a new employee
#
#  5- Verify the new employee info in Employee List page
#
#  6- Delete the new employee
#
#  7- Verify the new employee deleted in Employee List page
#
#  8- It is advised to use Selenium, Cucumber, JUnit and Java Programming Language.
