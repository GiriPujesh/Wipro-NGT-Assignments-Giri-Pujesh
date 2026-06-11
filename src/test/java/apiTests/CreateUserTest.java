
package apiTests;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class CreateUserTest {

    @Test
    public void createUser() {

        // Create JSON body
        JSONObject data = new JSONObject();

        data.put("firstName", "Giri");
        data.put("lastName", "Pujesh");
        data.put("age", 22);

        given()

            .header("Content-Type", "application/json")
            .body(data.toString())

        .when()

            .post("https://dummyjson.com/users/add")

        .then()

            .statusCode(201)
            .log().all();
    }
}