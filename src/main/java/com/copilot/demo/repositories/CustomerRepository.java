package com.copilot.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.copilot.demo.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}