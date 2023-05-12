package com.webflux.webfluxexample.config.router;

import com.webflux.webfluxexample.handler.BoardHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class BoardRouterConfig {

    @Bean
    public RouterFunction<ServerResponse> boardRouter(BoardHandler boardHandler) {
        return RouterFunctions.route()
                .GET("/board", boardHandler::getAll)
                .GET("/board/{id}", boardHandler::getById)
                .build();
    }
}
