package com.bestbuy.utilities;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetHealthcheck extends TestBase {
    @Test
    public void getHeathCheck(){
        Response response = given()
                .when()
                .get("/healthcheck");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
