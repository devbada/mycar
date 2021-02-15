package me.minam.car.repository;

import me.minam.car.entity.CarBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarBase, Integer> {
}
