package com.example.pizzaapplicationtest.remote.rest.dto.response;

import java.util.List;

public class PizzaDTO {

    private Integer id;
    private String name;
    private List<SizeDTO> sizes;

    public PizzaDTO(){

    }

    public PizzaDTO(Integer id, String name, List<SizeDTO> sizes) {
        this.id = id;
        this.name = name;
        this.sizes = sizes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SizeDTO> getSizes() {
        return sizes;
    }

    public void setSizes(List<SizeDTO> sizes) {
        this.sizes = sizes;
    }
}
