package com.herokuapp.booker_restful.studentinfo;


import com.herokuapp.booker_restful.model.BookingPojo;

import com.herokuapp.booker_restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class BookingDeleteTest extends TestBase {
    @Test
    public void deletebooking() {
        Response response = given()
                .header("Content-Type", "application/json")
                .auth().preemptive().basic("admin","password123")
                .pathParam("id", 3263)
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(201);
        System.out.println("Data is deleted");
        response.prettyPrint();



    }


}
