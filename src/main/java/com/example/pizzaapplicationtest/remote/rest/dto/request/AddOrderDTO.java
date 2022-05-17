package com.example.pizzaapplicationtest.remote.rest.dto.request;

import java.util.List;

public class AddOrderDTO {

    private List<AddPizzaOrderDTO> pizzas;
    private AddPersonOrderDTO person;

    public AddOrderDTO() {

    }

    public AddOrderDTO(List<AddPizzaOrderDTO> pizzas, AddPersonOrderDTO person) {
        this.pizzas = pizzas;
        this.person = person;
    }

    public List<AddPizzaOrderDTO> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<AddPizzaOrderDTO> pizzas) {
        this.pizzas = pizzas;
    }

    public AddPersonOrderDTO getPerson() {
        return person;
    }

    public void setPerson(AddPersonOrderDTO person) {
        this.person = person;
    }
}
