package me.minam.car.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

    @Column
    private LocalDateTime regDate;

    @Column
    private int amount;

    @Column
    private int distance;

    @Column
    private String description;
}
