
package apiTests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetUserTest {

    @Test
    public void getUser() {

        given()

        .when()
            .get("https://dummyjson.com/users/2")

        .then()
            .statusCode(200)
            .body("firstName", equalTo("Michael"))
            .log().all();
    }
}