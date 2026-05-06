package com.jsp.online.food.app.resturantservice;

import org.springframework.data.domain.Page;

import com.jsp.online.food.app.entity.Food;



public interface FoodService {
	
	Food createFood(Food food);
	
	Food getFoodById(Integer id);
	
	Page<Food> getAllFood(Integer pageNum,Integer pageSize);
	
	Food updateFood(Food food,Integer id);
	
	void deleteFood(Integer id);
}