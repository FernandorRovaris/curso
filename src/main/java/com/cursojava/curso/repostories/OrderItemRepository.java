package com.cursojava.curso.repostories;

import com.cursojava.curso.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
        
}
