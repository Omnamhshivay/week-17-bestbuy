package com.bestbuy.products;

import com.bestbuy.model.ProductsPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostProducts extends TestBase {
    @Test
    public void postProducts(){
        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setName("India");
        productsPojo.setType("automation");
        productsPojo.setPrice(3000000);
        productsPojo.setShipping(456123);
        productsPojo.setUpc("Dhl");
        productsPojo.setDescription("gujarat");
        productsPojo.setManufacturer("Ahmedabad");
        productsPojo.setModel("007");
        productsPojo.setUrl("www.www");
        productsPojo.setImage("graphix");

        Response response =given()
                .header("Content-Type","application/json")
                .body(productsPojo)
                .when()
                .post("/products");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
