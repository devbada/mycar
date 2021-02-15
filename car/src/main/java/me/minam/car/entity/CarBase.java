package me.minam.car.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import me.minam.car.domain.BaseEntity;
import me.minam.car.enumerate.FuelType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity
public class CarBase extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    @ApiModelProperty(value= "닉네임")
    private String nickName;
    
    @ApiModelProperty(value= "차량번호")
    private String number;
    
    @ApiModelProperty(value= "제조사")
    private String madeBy;
    
    @ApiModelProperty(value= "차종")
    private String model;

    @ApiModelProperty(value= "등급")
    private String modelDetail;

    @ApiModelProperty(value= "생산연도(연식)")
    private String madeYear;

    @ApiModelProperty(value= "연료")
    private FuelType fuelType;

    @ApiModelProperty(value= "연료탱크용량(L)")
    private int fuelTankSize;

    @ApiModelProperty(value= "배기량(cc)")
    private int displacement;
}
