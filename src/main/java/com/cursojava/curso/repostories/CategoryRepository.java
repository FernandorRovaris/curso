package com.cursojava.curso.repostories;

import com.cursojava.curso.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
        
}
