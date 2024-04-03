package com.HyperSrot.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HyperSrot.model.Product;
import com.HyperSrot.service.Service;

@RestController
public class Controller {
	
	@Autowired
	private Service service;

	@GetMapping("/products")
	public ResponseEntity<Product> addProduct(Product p){
		Product pro = service.addProduct(p);
		return new ResponseEntity<Product>(pro, HttpStatus.OK);
	}
	
}
