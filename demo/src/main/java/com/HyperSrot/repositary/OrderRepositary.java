package com.HyperSrot.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.HyperSrot.model.Order;

@Repository
public interface OrderRepositary  extends JpaRepository<Order, Integer>{

}
