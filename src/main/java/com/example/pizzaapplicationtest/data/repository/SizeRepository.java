package com.example.pizzaapplicationtest.data.repository;

import com.example.pizzaapplicationtest.data.entity.size.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepository extends JpaRepository<Integer, SizeEntity> {
}
