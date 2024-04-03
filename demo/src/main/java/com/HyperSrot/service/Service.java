package com.HyperSrot.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.HyperSrot.model.Product;
import com.HyperSrot.repositary.CartRepositary;
import com.HyperSrot.repositary.OrderRepositary;
import com.HyperSrot.repositary.ProductRepositary;
import com.HyperSrot.repositary.UserRepositary;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private UserRepositary userRepo;
	
	@Autowired
	private ProductRepositary productRepo;
	
	@Autowired
	private OrderRepositary orderRepo;
	
	@Autowired
	private CartRepositary cartRepo;

	public Product addProduct(Product p) {
		return productRepo.save(p);
	}
	
	
}
