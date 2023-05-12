package com.webflux.webfluxexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;


@WebFluxTest(BoardController.class)
class BoardControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void getTest() {
        this.webTestClient.get().uri("/board")
                .exchange()
                .expectStatus().isOk();
    }
}