package com.bestbuy.stores;

import com.bestbuy.model.StorePojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Post extends TestBase {


    @Test
            public void postUser() {
        List<String> services12 = new ArrayList<>();
        services12.add("lunch");
        services12.add("dinner");

        StorePojo pojo = new StorePojo();
        pojo.setName("Jon");
        pojo.setType("paul");
        pojo.setAddress("WestMinister");
        pojo.setAddress2("london");
        pojo.setAddress2("harrow");
        pojo.setCity("london");
        pojo.setState("midland");
        pojo.setZip("123456");
        pojo.setLat(456);
        pojo.setLng(78945);
        pojo.setHours("10");
        pojo.setServices(services12);

        Response response=given()
                .header("Content-Type","application/json")
                .body(pojo)
                .when()
                .post("/stores");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
