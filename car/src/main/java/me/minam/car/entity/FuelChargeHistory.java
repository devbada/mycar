package me.minam.car.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import me.minam.car.domain.BaseEntity;
import me.minam.car.enumerate.ChargeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity
public class FuelChargeHistory extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ApiModelProperty(value = "주유유형")
    private ChargeType chargeType;

    @ApiModelProperty(value = "단가")
    private int unitPrice;

    @ApiModelProperty(value = "주유량")
    private int flow;

    @ApiModelProperty(value = "충전 후 게이지")
    private int afterGage;

    @ApiModelProperty(value = "누적주행거리")
    private int distanceDriven;

    @ApiModelProperty(value = "충전소명")
    private String shopName;

    @ApiModelProperty(value = "구간거리")
    private int distanceBetween;

    @ApiModelProperty(value = "구간연비")
    private int efficiency;

    @ManyToOne
    private CarBase carBase;
}
