package com.jsp.online.food.app.resturantservice;

import com.jsp.online.food.app.dto.BillResponse;
import com.jsp.online.food.app.dto.OrderRequest;
import com.jsp.online.food.app.dto.PaymentDto;
import com.jsp.online.food.app.entity.Order;
import com.jsp.online.food.app.entity.OrderStatus;

public interface OrderService {
	
	BillResponse generateBill(OrderRequest orderRequest);
	
	String payAndPlaceOrder(PaymentDto payment);
	
	void deleteOrder(Integer id);
	
	Order getOrder(Integer id);
	
	Order updateStatusByAdmin(OrderStatus status,Integer id);
	
	String cancelOrder(Integer id);
}