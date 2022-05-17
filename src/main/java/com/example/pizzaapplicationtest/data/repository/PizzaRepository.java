package com.example.pizzaapplicationtest.data.repository;

import com.example.pizzaapplicationtest.data.entity.pizza.PizzaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Integer, PizzaEntity> {
}
