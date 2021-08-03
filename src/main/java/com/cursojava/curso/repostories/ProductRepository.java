package com.cursojava.curso.repostories;

import com.cursojava.curso.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
        
}
