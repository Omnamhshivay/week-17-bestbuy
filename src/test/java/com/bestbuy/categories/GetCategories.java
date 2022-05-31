package com.bestbuy.categories;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetCategories extends TestBase {
    @Test
    public void getServices() {


        Response response = given()
                .when()
                .get("/categories");
response.then().statusCode(200);
response.prettyPrint();
    }
}