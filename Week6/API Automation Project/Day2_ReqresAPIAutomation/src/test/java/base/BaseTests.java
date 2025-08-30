package base;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.ConfigManager;

public class BaseTests {

    private String BASE_URL;
    private String API_KEY;

    @BeforeMethod
    public void setup() {
        BASE_URL = ConfigManager.getProperty("base.url");
        API_KEY = ConfigManager.getProperty("api.key");

//        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        // Set default base URI
        RestAssured.baseURI = BASE_URL;
        RestAssured.requestSpecification = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("x-api-key", API_KEY);
        //        .log().all();
    }

    @AfterMethod
    public void teardown() {
        // Optional: reset RestAssured after each test
        RestAssured.reset();
    }
}
