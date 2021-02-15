package me.minam.car.entity;

import lombok.*;
import me.minam.car.domain.BaseEntity;
import me.minam.car.enumerate.MaintenanceType;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity
public class Maintenance extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private MaintenanceType maintenanceType;
    private String maintenanceItem;
    private String shopName;

    @ManyToOne
    private CarBase carBase;
}
