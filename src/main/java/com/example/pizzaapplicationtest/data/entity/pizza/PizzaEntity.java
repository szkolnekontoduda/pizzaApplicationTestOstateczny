package com.example.pizzaapplicationtest.data.entity.pizza;

import java.util.Set;

@Entity
@Table(name="pizzas")
public class PizzaEntity {

    @Id
    @Column(name="pizza_id")
    private Integer pizzaId;
    @Column(name="pizza_name")
    private String pizzaName();
    @OneToMany()
    @Column(name="pizza_sizes")
    private Set<PizzaEntity> pizzaSizes;

    public Integer getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(Integer pizzaId) {
        this.pizzaId = pizzaId;
    }

    public Set<PizzaEntity> getPizzaSizes() {
        return pizzaSizes;
    }

    public void setPizzaSizes(Set<PizzaEntity> pizzaSizes) {
        this.pizzaSizes = pizzaSizes;
    }
}
