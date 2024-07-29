package com.youthLab.cheerupDemo.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public  abstract class BaseEntity {

    @CreatedDate
    private LocalDate createdAt;

    @CreatedDate
    private LocalDate updatedAt;
}
