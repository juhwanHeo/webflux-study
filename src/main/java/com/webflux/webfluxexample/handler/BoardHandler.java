package com.webflux.webfluxexample.handler;

import com.webflux.webfluxexample.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Slf4j
@Component
public class BoardHandler {

    private final BoardService boardService;

    public BoardHandler(BoardService boardService) {
        this.boardService = boardService;
    }

    public Mono<ServerResponse> getAll(ServerRequest request) {
        return ok().contentType(APPLICATION_JSON)
                .body(boardService.findAll(), List.class);
    }

    public Mono<ServerResponse> getById(ServerRequest request) {
        long id = Long.parseLong(request.pathVariable("id"));
        log.info("### id: {}", id);

        return boardService.findById(id)
                .flatMap(board -> ok().contentType(APPLICATION_JSON).bodyValue(board))
                .switchIfEmpty(ServerResponse.notFound().build())
                ;
    }
}
