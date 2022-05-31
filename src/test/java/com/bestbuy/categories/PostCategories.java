package com.bestbuy.categories;

import com.bestbuy.model.CategoriesPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostCategories extends TestBase {
    @Test
    public void postServices(){
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("Mazda");
        categoriesPojo.setId("5001");
        Response response =given()
                .header("Content-Type","application/json")
                .body(categoriesPojo)
                .when()
                .post("/categories");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
