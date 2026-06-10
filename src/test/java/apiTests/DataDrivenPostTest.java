package apiTests;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import utilities.ExcelUtils;
import utilities.ExtentManager;

public class DataDrivenPostTest {

    ExtentReports extent;
    ExtentTest test;

    @BeforeTest
    public void startReport() {

        extent = ExtentManager.getReportObject();
    }

    @DataProvider(name = "userData")
    public Object[][] getData() throws Exception {

        return ExcelUtils.getExcelData();
    }

    @Test(dataProvider = "userData")
    public void createUser(String firstName,
                           String lastName,
                           String age) {

        test = extent.createTest("Create User API Test");

        JSONObject data = new JSONObject();

        data.put("firstName", firstName);
        data.put("lastName", lastName);
        data.put("age",
                (int) Double.parseDouble(age));

        given()

            .header("Content-Type", "application/json")
            .body(data.toString())

        .when()

            .post("https://dummyjson.com/users/add")

        .then()

            .statusCode(201);

        test.pass("User Created Successfully: "
                + firstName);
    }

    @AfterTest
    public void tearDown() {

        extent.flush();
    }
}