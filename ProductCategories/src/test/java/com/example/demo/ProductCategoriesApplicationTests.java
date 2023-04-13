package com.example.demo;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.http.ContentType;

//@SpringBootTest
//class ProductCategoriesApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}


@SuppressWarnings("unused")
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProductCategoriesApplicationTests{

 
    
    @Test
    @Order(1)
    public void testgetallcategories() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:8083/categories")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    
    @Test
    @Order(2)
    public void testgetcategoriesbyname() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:8083/categories/furniture")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    
    @Test
    @Order(3)
    public void testgetcategoriesbyId() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:8083/categories/categoryid/1")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }

}
