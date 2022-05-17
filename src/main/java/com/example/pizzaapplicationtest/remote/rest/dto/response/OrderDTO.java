package com.example.pizzaapplicationtest.remote.rest.dto.response;

import com.example.pizzaapplicationtest.domain.model.StatusType;

import java.util.List;

public class OrderDTO {

    private Integer id;
    private StatusType status;
    private List<PizzaOrderDTO> pizzas;
    private PersonOrderDTO person;

    public OrderDTO() {

    }

    public OrderDTO(Integer id, StatusType status, List<PizzaOrderDTO> pizzas, PersonOrderDTO person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDTO> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDTO> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDTO getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDTO person) {
        this.person = person;
    }
}
