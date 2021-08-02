package com.cursojava.curso.config;

import java.time.Instant;
import java.util.Arrays;

import com.cursojava.curso.entities.Category;
import com.cursojava.curso.entities.Order;
import com.cursojava.curso.entities.User;
import com.cursojava.curso.entities.enums.OrderStatus;
import com.cursojava.curso.repostories.CategoryRepository;
import com.cursojava.curso.repostories.OrderRepository;
import com.cursojava.curso.repostories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
       
       User u1 = new User(null, "Maria", "maria@email.com", "4899648065", "123456");
       User u2 = new User(null, "Alex", "alex@email.com", "4899648065", "123456");
       
       Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
       Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WATTING_PAYMENT, u2);
       Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WATTING_PAYMENT, u1); 
      
       Category cat1 = new Category(null, "Electronics");
       Category cat2 = new Category(null, "Books");
       Category cat3 = new Category(null, "Computers");


       userRepository.saveAll(Arrays.asList(u1,u2));
       orderRepository.saveAll(Arrays.asList(o1,o2,o3));
       categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

    }

  

}