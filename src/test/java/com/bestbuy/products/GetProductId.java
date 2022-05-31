package com.bestbuy.products;

import com.bestbuy.model.ProductsPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetProductId extends TestBase {
    @Test
    public void getProductsId(){

        Response response = given()
                .header("Accept","application/json")
                .when()
                .get("/products/9999680");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
