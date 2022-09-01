package com.sash.opentelemetry;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class TracedResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("hello from quarkus's opentelemetry"));
    }

    @Test
    public void testChainEndpoint() {
        given()
                .when().get("/hello/chain")
                .then()
                .statusCode(200)
                .body(is("chain -> hello from quarkus's opentelemetry"));
    }

}
