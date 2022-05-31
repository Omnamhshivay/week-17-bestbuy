package com.bestbuy.services;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetServicesId extends TestBase {
    @Test
    public void getServicesId(){
        Response response = given()
               // .header("Accept","application/json")
                .when()
                .get("/services/26");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
