package com.bestbuy.stores;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetUserId extends TestBase {
    @Test
    public void getUserId(){
        Response response = given()
                .when()
                .get("/stores/50");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
