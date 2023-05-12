package com.webflux.webfluxexample.repository;

import com.webflux.webfluxexample.domain.Board;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface BoardRepository extends ReactiveCrudRepository<Board, Long> {
}
