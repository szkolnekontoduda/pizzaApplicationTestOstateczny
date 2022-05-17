package com.example.pizzaapplicationtest.data.entity.size;

import com.example.pizzaapplicationtest.data.entity.pizza.PizzaEntity;

import java.math.BigDecimal;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="sizes")
public class SizeEntity {

    @Id
    @Column(name="size_id")
    private Integer sizeId;
    @Column(name="size_name")
    private String sizeName;
    @Column(name="size_price")
    private BigDecimal price;
    @Column(name="pizza_id")
    private Integer pizzaId;
    @ManyToOne
    @JoinColumn(name="pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;



    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
