package com.bestbuy.products;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetProduct extends TestBase {
    @Test
    public void getProducts(){
        Response response =given()
                .when()
                .get("/products");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
