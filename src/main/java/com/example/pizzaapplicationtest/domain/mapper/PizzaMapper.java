package com.example.pizzaapplicationtest.domain.mapper;

import com.example.pizzaapplicationtest.data.entity.pizza.PizzaEntity;
import com.example.pizzaapplicationtest.remote.rest.dto.response.PizzaDTO;

public class PizzaMapper {
    public PizzaDTO mapToPizzaDTO(PizzaEntity pizzaEntity){
        PizzaDTO pizza = new PizzaDTO();
        pizza.setId(pizza.getId());
        pizza.setName(pizza.getName());
        return pizza;
    }
}
