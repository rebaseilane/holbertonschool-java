package com.example.jpa_h2_demo.controller;

import com.example.jpa_h2_demo.model.Customer;
import com.example.jpa_h2_demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing customers.
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Adds a new customer.
     *
     * @param customer Customer object
     * @return saved customer
     */
    @PostMapping("/addClient")
    public ResponseEntity<Customer> addClient(@RequestBody Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    /**
     * Retrieves all customers.
     *
     * @return list of customers
     */
    @GetMapping("/findAllClients")
    public ResponseEntity<List<Customer>> findAllClients() {
        List<Customer> customers = customerRepository.findAll();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    /**
     * Finds customer by ID.
     *
     * @param idClient customer ID
     * @return customer if found
     */
    @GetMapping("/findClientById/{id}")
    public ResponseEntity<Customer> findClientById(@PathVariable("id") Long idClient) {
        Optional<Customer> customer = customerRepository.findById(idClient);

        return customer.map(value ->
                new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() ->
                new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * Deletes customer by ID.
     *
     * @param idClient customer ID
     */
    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeCustomer(@PathVariable("id") Long idClient) {
        customerRepository.deleteById(idClient);
    }

    /**
     * Updates an existing customer.
     *
     * @param id customer ID
     * @param customer new customer data
     */
    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable("id") Long id,
                               @RequestBody Customer customer) {

        Customer existingCustomer = customerRepository.findById(id)
                .orElse(null);

        if (existingCustomer != null) {
            existingCustomer.setName(customer.getName());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setPhones(customer.getPhones());
            existingCustomer.setAddresses(customer.getAddresses());

            customerRepository.save(existingCustomer);
        }
    }
}
