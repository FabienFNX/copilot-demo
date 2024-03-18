package com.copilot.demo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.copilot.demo.repositories.CustomerRepository;
import com.copilot.demo.models.Customer;

/**
 * This class represents the controller for managing customer-related operations.
 * It handles HTTP requests related to customers and interacts with the CustomerRepository.
 */
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerRepository repository;

    /**
     * Constructs a new CustomerController with the specified CustomerRepository.
     *
     * @param repository the CustomerRepository to be used
     */
    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    /**
     * Retrieves all customers.
     *
     * @return a list of all customers
     */
    @GetMapping
    public List<Customer> getAllCustomers() {
        return (List<Customer>) repository.findAll();
    }

    /**
     * Retrieves a customer by their ID.
     *
     * @param id the ID of the customer to retrieve
     * @return the customer with the specified ID, or null if not found
     */
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Creates a new customer.
     *
     * @param customer the customer to create
     * @return the created customer
     */
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }

    /**
     * Updates an existing customer.
     *
     * @param id       the ID of the customer to update
     * @param customer the updated customer information
     * @return the updated customer, or null if not found
     */
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return repository.findById(id).map(existingCustomer -> {
            existingCustomer.setFirstName(customer.getFirstName());
            existingCustomer.setLastName(customer.getLastName());
            return repository.save(existingCustomer);
        }).orElse(null);
    }

    /**
     * Deletes a customer by their ID.
     *
     * @param id the ID of the customer to delete
     */
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        repository.deleteById(id);
    }
}