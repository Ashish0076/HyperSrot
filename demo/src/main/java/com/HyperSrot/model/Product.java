package com.HyperSrot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
//    
//    private String productName;
//
//    private int quantity;
//
//    private double price;
//    
//    @ManyToOne
//    private Cart cart;
//    
//
//    public Product() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Product(String productName, int quantity,  double price) {
//		super();
//		this.productName = productName;
//		this.quantity = quantity;
//		this.price = price;
//	}
//
//	public int getProductId() {
//        return productId;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//    
//    
//
//	public String getProductName() {
//		return productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
//				+ ", price=" + price + "]";
//	}

	
    
    
}

