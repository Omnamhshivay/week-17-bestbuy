package com.bestbuy.services;

import com.bestbuy.model.ServicesPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostServices extends TestBase {
    @Test
    public void postServices(){
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("China");
        Response response=given()
                .header("Content-Type","application/json")
                .body(servicesPojo)
                .when()
                .post("/services");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
