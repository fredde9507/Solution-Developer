package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customer")
    public List<Customer> getCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @PostMapping("/customer")
    void addCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
    }
}
