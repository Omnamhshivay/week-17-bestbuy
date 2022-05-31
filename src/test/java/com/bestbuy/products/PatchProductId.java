package com.bestbuy.products;

import com.bestbuy.model.ProductsPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchProductId extends TestBase {
    @Test
            public void updateProductsId(){
        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setName("Japan");

        Response response= given()
                .when()
                .get("products/9999680");
        response.then().statusCode(200);
        response.prettyPrint();

    }


}
