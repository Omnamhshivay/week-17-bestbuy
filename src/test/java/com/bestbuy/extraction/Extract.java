package com.bestbuy.extraction;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Extract {
    static ValidatableResponse response;
    @BeforeClass
    public static void init(){
        RestAssured.baseURI="http://localhost";
        RestAssured.port= 3030;
        response= given()
                .when()
                .get("/stores")
                .then().statusCode(200);
    }
    @Test
    public void limit(){
        int limit = response.extract().path("limit");
        System.out.println("limit =" + limit);
    }
    @Test
    public void total(){
        int total =response.extract().path("total");
        System.out.println("total =" + total);
    }
    @Test
    public void nameOfThe5thStore(){
        String name5ThStore =response.extract().path("data[4].name");
        System.out.println("Name of the 5th store =" + name5ThStore);
    }
    @Test
    public void namesOfTheAllStore(){
        List<String> nameOfTheAllStore = response.extract().path("data.findAll{it}.name");
        System.out.println("Name Of all store =" + nameOfTheAllStore);
    }
    @Test
    public void allStoreId(){
        List<Integer> storeIdForAll =response.extract().path("data.findAll{it}.id");
        System.out.println("All store Id ="+ storeIdForAll);
    }
    @Test
    public void printTheSizeOfTheDataList(){
        List<Integer> dataList= response.extract().path("data.findAll{it}.list");
        System.out.println("Print the size of all data list =" + dataList.size());
    }
    @Test
    public void valueOfStoreStCloud(){
        List<String> value =response.extract().path("data.findAll{it.name == 'St Cloud'}");
        System.out.println("Get all the value of the store where store name = St Cloud ="+value);
    }
    @Test
    public void addressOfStoreRochester(){
        List<String> address =response.extract().path("data.findAll{it.name == 'Rochester'}.address");
        System.out.println("Get the address of the store where store name Rochester =" + address);
    }
    @Test
    public void allServicesOf8thStore(){
        List<String> services =response.extract().path("data[7].services");
        System.out.println("Get all the services of 8 store " + services);
    }
    @Test
    public void storeServicesWindowsStore(){
        List<String> storeServices =response.extract().path("data.findAll{it.services.name =='Windows Store'}.services.name");
        System.out.println("Get storeservices of the store where service name = Windows Store " + storeServices);
    }
    @Test
    public void storeIdOfAllStore(){
        List<String>  storesId =response.extract().path("data.id");
        System.out.println("Get all the storeId of all the store " +storesId);
    }
    @Test
    public void nameOfStateND(){
        List<String> stateName =response.extract().path("data.findAll{it.state== 'ND'}.name");
        System.out.println("Find the store names Where state = ND " +stateName);
    }
    @Test
    public void servicesStoreNameRochester(){
        List<Integer> servicesRochester = response.extract().path("data.find{it.name== 'Rochester'}.services");
        System.out.println("Find the Total number of services for the store where store name = Rochester " + servicesRochester.size());
    }
    @Test
    public void createdAtStoreWindowsStore(){
        List<Integer> createdAtWindowsStore =response.extract().path("data.findAll{it.services.name=='Windows Store'}.createdAt");
        System.out.println("Find the createdAt for all services whose name = Windows Store " + createdAtWindowsStore);
    }
    @Test
    public void nameOfAllServiceFargo(){
        List<String> servicesFargo =response.extract().path("data.findAll{it.services.name=='Fargo'}.name");
        System.out.println("Find the name of all services Where store name = “Fargo” " + servicesFargo);
    }
    @Test
    public void zipOfStore(){
        List<Integer> zipStore =response.extract().path("data.zip");
        System.out.println("Find the zip of all the store " + zipStore);
    }
    @Test
    public void zipOfRoseville(){
        List<Integer> zipRoseville =response.extract().path("data.findAll{it.name== 'Roseville'}.zip");
        System.out.println("Find the zip of store name = Roseville " + zipRoseville);
    }
    @Test
    public void storeServicesOfMangoliaHomeTheater(){
        List<String> storeServicesMangolia=response.extract().path("data.findAll{it.services.name== 'Magnolia Home Theater'}.storeservices");
        System.out.println("Find the storeservices details of the service name = Magnolia Home Theater " +storeServicesMangolia);
    }
    @Test
    public void latStore(){
        List<Integer> lat =response.extract().path("data.lat");
        System.out.println("Find the lat of all the stores " + lat);
    }















}
