package com.bestbuy.categories;

import com.bestbuy.model.CategoriesPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchCategories extends TestBase {
    @Test
    public void patchCategories(){
        CategoriesPojo categoriesPojo =new CategoriesPojo();
        categoriesPojo.setName("Honda");
        categoriesPojo.setId("50050");
        Response response= given()
                .when()
                .get("/categories/abcat0020004");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
