package apiTests;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class UpdateUserTest {

    @Test
    public void updateUser() {

        // Create JSON body
        JSONObject data = new JSONObject();

        data.put("firstName", "UpdatedName");
        data.put("age", 30);

        given()

            .header("Content-Type", "application/json")
            .body(data.toString())

        .when()

            .put("https://dummyjson.com/users/1")

        .then()

            .statusCode(200)
            .log().all();
    }
}