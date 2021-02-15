package me.minam.car.controller;

import lombok.SneakyThrows;
import me.minam.car.entity.CarBase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @SneakyThrows
    void getCar(){
        CarBase carBase = CarBase.builder().id(1L).build();

        mockMvc.perform(get("/api/cars/", carBase))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(print());

    }
}