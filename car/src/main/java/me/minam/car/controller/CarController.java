package me.minam.car.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import me.minam.car.form.CarForm;
import me.minam.car.service.CarService;
import org.springframework.web.bind.annotation.*;

import javax.naming.InterruptedNamingException;

import java.util.Optional;

import static me.minam.car.mapper.CarMapper.mapper;

@Api(description = "자동차")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CarController {

    private final CarService carService;

    @ApiOperation("자동차 조회")
    @GetMapping("/cars")
    public Optional<CarForm.Response.FindOne> get(@RequestParam Integer id) {
        return mapper.toFindOne(carService.get(mapper.toCarBase(id)));
    }
}
