package com.example.jpah2demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.jpah2demo.entity.Customer;
import com.example.jpah2demo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for customer operations.
 */
@RestController
public class CustomerController {

    /**
     * Customer repository.
     */
    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Adds a new customer.
     *
     * @param customer customer object
     * @return saved customer
     */
    @PostMapping("/addClient")
    public ResponseEntity<Customer> addClient(
        @RequestBody Customer customer) {

        Customer savedCustomer = customerRepository.save(customer);

        return new ResponseEntity<>(
            savedCustomer,
            HttpStatus.CREATED
        );
    }

    /**
     * Returns all customers.
     *
     * @return list of customers
     */
    @GetMapping("/findAllClients")
    public ResponseEntity<List<Customer>> findAllClients() {

        List<Customer> customers = customerRepository.findAll();

        return new ResponseEntity<>(
            customers,
            HttpStatus.OK
        );
    }

    /**
     * Finds customer by ID.
     *
     * @param idClient customer ID
     * @return customer object
     */
    @GetMapping("/findClientById/{id}")
    public ResponseEntity<Customer> findClientById(
        @PathVariable("id") Long idClient) {

        Optional<Customer> customer =
            customerRepository.findById(idClient);

        if (customer.isPresent()) {
            return new ResponseEntity<>(
                customer.get(),
                HttpStatus.OK
            );
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /**
     * Removes customer by ID.
     *
     * @param idClient customer ID
     */
    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeCustomer(
        @PathVariable("id") Long idClient) {

        customerRepository.deleteById(idClient);
    }

    /**
     * Updates customer by ID.
     *
     * @param id customer ID
     * @param customer updated customer object
     */
    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(
        @PathVariable("id") Long id,
        @RequestBody Customer customer) {

        customer.setId(id);

        customerRepository.save(customer);
    }
}
