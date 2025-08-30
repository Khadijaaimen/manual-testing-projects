package reqresAPI;

import base.BaseTests;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ReqresAPITests extends BaseTests {

    @Test
    @Description("Validate GET /users/2 returns correct user data")
    public void getSingleUser() {
        when()
                .get("/users/2")
                .then()
                .assertThat()
                .statusCode(200)
                .body("data.id", equalTo(2))
                .body("data.email", equalTo("janet.weaver@reqres.in"))
                .body("data.first_name", equalTo("Janet"))
                .body("data.last_name", equalTo("Weaver"));
    }

    @Test
    public void getUserList() {
        when().
                get("/users?page=2").
                then().
                assertThat().
                statusCode(200).
                body("data[0].id", notNullValue());
    }

    @Test
    public void createUserFromJSON() throws IOException {
        String payload = new String(Files.readAllBytes(Paths.get("src/test/resources/testdata/createUser.json")));

        given().
                body(payload).
                when().
                post("/users").
                then().
                assertThat().
                statusCode(201).
                body("id", notNullValue());
    }

    @Test
    public void updateUser() {
        String payload = "{ \"name\": \"Khadija\", \"job\": \"Senior QA Tester\" }";

        given().
                body(payload).
                when().
                put("/users/2").
                then().
                assertThat().
                statusCode(200).
                body("updatedAt", notNullValue());
    }

    @Test
    public void deleteUser() {

        when().
                delete("/users/2").
                then().
                assertThat().
                statusCode(204);
    }

    @Test
    public void getUserNotFound() {

        when().
                get("/users/9999").
                then().
                assertThat().
                statusCode(404).
                body(equalTo("{}")); // Empty JSON object
    }

    @Test
    public void deleteNonExistingUser() {

        when().
                delete("/users/9999").
                then().
                assertThat().
                statusCode(204); // Reqres always returns 204, even for non-existing users

    }

    @Test
    public void createUserWithEmptyPayload() {
        given().
                body("{}").
                when().
                post("/users").
                then().
                assertThat().
                statusCode(201). // API always returns 201 even if payload is empty
                body("id", notNullValue());
    }

    @Test
    public void updateNonExistingUser() {
        String payload = "{ \"name\": \"Ghost\", \"job\": \"Unknown\" }";

        given().
                body(payload).
                when().
                put("/users/9999").
                then().
                assertThat().
                statusCode(200);
    }

}
