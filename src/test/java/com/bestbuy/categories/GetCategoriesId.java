package com.bestbuy.categories;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetCategoriesId extends TestBase {
    @Test
    public void getCategoriesId() {
        Response response = given()
                .header("Accept", "application/json")
                .when()
                .get("/categories/abcat0020004");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}