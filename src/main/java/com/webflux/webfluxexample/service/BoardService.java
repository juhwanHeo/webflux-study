package com.webflux.webfluxexample.service;

import com.webflux.webfluxexample.domain.Board;
import com.webflux.webfluxexample.repository.BoardRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Flux<Board> findAll() {
        return boardRepository.findAll();
    }

    public Mono<Board> findById(long id) {

        return boardRepository.findById(id);
    }
}
