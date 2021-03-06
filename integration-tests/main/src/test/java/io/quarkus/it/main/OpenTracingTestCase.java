package io.quarkus.it.main;

import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

@QuarkusTest
public class OpenTracingTestCase {

    @Test
    public void testOpenTracing() {
        invokeResource();
    }

    public void invokeResource() {
        RestAssured.when().get("/opentracing").then()
                .body(is("TEST"));
    }

}
