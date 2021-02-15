package me.minam.car.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.minam.car.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DriveHistory extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String drivenPlace;

    @ManyToOne
    private CarBase carBase;
}
