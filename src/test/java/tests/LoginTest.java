
package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.ExcelUtils;

public class LoginTest {

    @Test
    public void loginTest() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String excelPath = "TestData/LoginData.xlsx";

        ExcelUtils.setExcelFile(excelPath, "Sheet1");

        int rows = ExcelUtils.getRowCount();

        for (int i = 1; i < rows; i++) {

            String username = ExcelUtils.getCellData(i, 0);

            String password = ExcelUtils.getCellData(i, 1);

            driver.get("https://practicetestautomation.com/practice-test-login/");

            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("username")).sendKeys(username);

            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys(password);

            driver.findElement(By.id("submit")).click();

            System.out.println("Tested with: "
                    + username + " | " + password);
        }

        driver.quit();
    }
}