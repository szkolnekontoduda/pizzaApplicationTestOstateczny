package com.example.pizzaapplicationtest.domain.service;

import com.example.pizzaapplicationtest.data.repository.PizzaRepository;

public class PizzaService {

    private PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public void addPizza(){

    }
}
