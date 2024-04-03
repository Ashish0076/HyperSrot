package com.HyperSrot.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HyperSrot.model.Cart;

@Repository
public interface CartRepositary extends JpaRepository<Cart, Integer>{

}
