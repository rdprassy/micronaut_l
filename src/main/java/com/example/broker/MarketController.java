package com.example.broker;


import com.example.broker.model.Symbol;
import com.example.broker.store.InMemoryStore;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.ArrayList;
import java.util.List;

@Controller("/markets")
public class MarketController {

    private final InMemoryStore store;

    public MarketController(final InMemoryStore store) {
        this.store = store;
    }

    @Get("/")
    public List<Symbol> all(){
        return store.getAllSymbols();

    }

}
