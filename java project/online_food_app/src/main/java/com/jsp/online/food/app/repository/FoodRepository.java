package com.jsp.online.food.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.online.food.app.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Integer>{

}
