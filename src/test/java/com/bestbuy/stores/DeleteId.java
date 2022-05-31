package com.bestbuy.stores;

import com.bestbuy.model.StorePojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteId extends TestBase {
    @Test
    public void deleteId(){
        StorePojo storePojo = new StorePojo();
        Response response = given()
                .when()
                .body(storePojo)
                .delete("/store/505");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
