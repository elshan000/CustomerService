package org.example;

import org.example.Customer;
import org.example.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping

    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }
           // ID- ye gor musterini tap
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

       // Butun musterileri sirala
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // PUT — Müştəri məlumatlarını yeniləyir
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    // DELETE — Müştərini deaktiv edir (soft delete)
    @DeleteMapping("/{id}")
    public Customer deactivateCustomer(@PathVariable Long id) {
        return customerService.deactivateCustomer(id);
    }




}

