package com.bestbuy.categories;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteCategories extends TestBase {
    @Test
    public void deleteCategories(){
        Response response =given()
                .when()
                .delete("/categories/abcat0020001");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
