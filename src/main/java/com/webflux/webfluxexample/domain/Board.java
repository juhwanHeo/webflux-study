package com.webflux.webfluxexample.domain;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table("board")
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(callSuper = true)
public class Board {

    @Id
    @Column("id")
    private Long id;

    @Column(value = "title")
    private String title;

    @Column("content")
    private String content;

    @Column("createdate")
    @CreatedDate
    private LocalDateTime createDate;

    @Column("modifydate")
    @LastModifiedDate
    private LocalDateTime modifyDate;
}
