package me.minam.car.mapper;

import me.minam.car.entity.CarBase;
import me.minam.car.form.CarForm.*;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CarMapper {
    CarMapper mapper = Mappers.getMapper(CarMapper.class);

    Optional<Response.FindOne> toFindOne(CarBase carBase);
    
    CarBase                    toCarBase(Integer id);
}
