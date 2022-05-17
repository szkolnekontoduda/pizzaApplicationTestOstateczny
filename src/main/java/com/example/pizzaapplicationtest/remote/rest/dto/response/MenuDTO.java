package com.example.pizzaapplicationtest.remote.rest.dto.response;

import java.util.List;

public class MenuDTO {

    private List<PizzaDTO> pizzas;

    public MenuDTO() {

    }

    public MenuDTO(List<PizzaDTO> pizzas) {
        this.pizzas = pizzas;
    }

    public List<PizzaDTO> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaDTO> pizzas) {
        this.pizzas = pizzas;
    }
}
