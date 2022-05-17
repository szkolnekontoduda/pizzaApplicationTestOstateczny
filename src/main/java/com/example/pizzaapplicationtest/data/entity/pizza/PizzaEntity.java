package com.example.pizzaapplicationtest.data.entity.pizza;



import com.example.pizzaapplicationtest.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="pizzas")
public class PizzaEntity {

    @Id
    @Column(name="pizza_id")
    private Integer pizzaId;
    @Column(name="pizza_name")
    private String pizzaName;
    @OneToMany
    @JoinColumn(name="size_id", insertable = false, updatable = false)
    private Set<SizeEntity> pizzaSizes;


    public Integer getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(Integer pizzaId) {
        this.pizzaId = pizzaId;
    }

    public Set<SizeEntity> getPizzaSizes() {
        return pizzaSizes;
    }

    public void setPizzaSizes(Set<SizeEntity> pizzaSizes) {
        this.pizzaSizes = pizzaSizes;
    }
}
