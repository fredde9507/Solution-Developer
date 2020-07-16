package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



    @Bean
    CommandLineRunner init(CustomerRepository customerRepository) {
        return args -> {
            Stream.of("Lisa", "Robert", "Jonas", "Daniel", "Kalle").forEach(name -> {
                Customer customer = new Customer();
                customerRepository.save(customer);
            });
            customerRepository.findAll().forEach(System.out::println);
        };
    }
}

