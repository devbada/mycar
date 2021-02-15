package me.minam.car.service;

import lombok.RequiredArgsConstructor;
import me.minam.car.entity.CarBase;
import me.minam.car.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    @Transactional(readOnly=true)
    public Optional<CarBase> get(CarBase carBase) {
        return carRepository.findById(carBase.getId().intValue());
    }
}
