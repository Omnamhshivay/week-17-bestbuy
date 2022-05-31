package com.bestbuy.stores;

import com.bestbuy.model.StorePojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Patch extends TestBase {

    @Test
    public void upDate(){
        StorePojo storePojo =new StorePojo();
        storePojo.setName("Laden");
        Response response = given()
                .when()
                .body(storePojo)
                .patch("store/50");
        response.then().statusCode(200);

    }
}
