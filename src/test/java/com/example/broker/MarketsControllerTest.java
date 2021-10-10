package com.example.broker;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.LinkedHashMap;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;


@MicronautTest
public class MarketsControllerTest {



    @Inject
    EmbeddedApplication application;

    @Inject
    @Client("/")
    RxHttpClient client;

    @Test
    void returnsListOfMarkets(){
//        Assertions.assertTrue(application.isRunning());
        final List result = client.retrieve(HttpRequest.GET("/markets"), List.class).blockingSingle();
        assertEquals(7, result.size());
        final List<LinkedHashMap<String, String>> markets = result;
        org.assertj.core.api.Assertions.assertThat(markets)
                .extracting(entry -> entry.get("value"))
                .containsExactlyInAnyOrder("AAPL","AMZN","FB","GOOG","MSFT","NFLX","TSLA");


    }



}
