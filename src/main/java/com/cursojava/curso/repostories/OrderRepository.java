package com.cursojava.curso.repostories;

import com.cursojava.curso.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
        
}
