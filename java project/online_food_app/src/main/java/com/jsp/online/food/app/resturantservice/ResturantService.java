package com.jsp.online.food.app.resturantservice;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;

import com.jsp.online.food.app.entity.Food;
import com.jsp.online.food.app.entity.Order;
import com.jsp.online.food.app.entity.Restaurant;



public interface ResturantService {
	
	Restaurant createRestaurant(Restaurant restaurant);
	
	Restaurant getById(Integer id);
	
	Page getAllRestaurants(int pageNum,int pageSize, String sortBy);
	
	Restaurant updateRestaurant(Integer id,Restaurant restaurant);
	
	void deleteRestaurant(Integer id);
	
	Restaurant assignFood(Integer restaurantId,Set<Integer> foodId);
	
	List<Food> findFoodByRestaurantId(Integer id);
	
	List<Order> findOrdersByRestaurantId(Integer id);
}