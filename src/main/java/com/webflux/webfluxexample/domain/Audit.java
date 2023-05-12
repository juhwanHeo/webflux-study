package com.webflux.webfluxexample.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Data
public class Audit {

    @Column("createDate")
    @CreatedDate
    private LocalDateTime createDate;

    @Column("modifyDate")
    @LastModifiedDate
    private LocalDateTime modifyDate;
}
