package com.cursojava.curso.repostories;

import com.cursojava.curso.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
        
}
