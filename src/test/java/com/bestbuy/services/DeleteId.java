package com.bestbuy.services;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteId extends TestBase {
    @Test
    public void deleteId(){
        Response response =given()
                .when()
                .delete("/services/2");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
