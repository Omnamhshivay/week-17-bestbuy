package com.bestbuy.products;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteProductId extends TestBase {
    @Test
    public void deleteProductsId(){

        Response response =given()
                .when()
                .delete("/products/150115");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
