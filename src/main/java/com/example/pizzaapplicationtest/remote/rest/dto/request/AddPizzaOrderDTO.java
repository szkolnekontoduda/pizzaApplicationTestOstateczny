package com.example.pizzaapplicationtest.remote.rest.dto.request;

public class AddPizzaOrderDTO {

    private Integer pizzaId;
    private Integer sizeId;
    private Integer count;

    public AddPizzaOrderDTO() {

    }

    public AddPizzaOrderDTO(Integer pizzaId, Integer sizeId, Integer count) {
        this.pizzaId = pizzaId;
        this.sizeId = sizeId;
        this.count = count;
    }

    public Integer getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(Integer pizzaId) {
        this.pizzaId = pizzaId;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
