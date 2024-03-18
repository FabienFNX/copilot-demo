package com.copilot.demo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Optional;

import com.copilot.demo.controllers.CustomerController;
import com.copilot.demo.models.Customer;
import com.copilot.demo.repositories.CustomerRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {

    @MockBean
    private CustomerRepository repository;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUpdateCustomer() throws Exception {
        // Arrange
        Long customerId = 1L;
        Customer existingCustomer = new Customer();
        existingCustomer.setId(customerId);
        existingCustomer.setFirstName("John");
        existingCustomer.setLastName("Doe");

        Customer updatedCustomer = new Customer();
        updatedCustomer.setId(customerId);
        updatedCustomer.setFirstName("Jane");
        updatedCustomer.setLastName("Smith");

        when(repository.findById(customerId)).thenReturn(Optional.of(existingCustomer));
        when(repository.save(existingCustomer)).thenReturn(updatedCustomer);

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.put("/api/customers/{id}", customerId)
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"firstName\":\"Jane\",\"lastName\":\"Smith\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(customerId))
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value("Jane"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName").value("Smith"));

        // Verify that the repository methods were called
        verify(repository, times(1)).findById(customerId);
        verify(repository, times(1)).save(existingCustomer);
    }
}