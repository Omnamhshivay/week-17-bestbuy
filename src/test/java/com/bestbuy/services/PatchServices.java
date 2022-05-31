package com.bestbuy.services;

import com.bestbuy.model.ServicesPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchServices extends TestBase {
    @Test
    public void patchServices(){
        ServicesPojo servicesPojo =new ServicesPojo();
        servicesPojo.setName("Africa");
        Response response=given()
                .when()
                .get("/services/3");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
