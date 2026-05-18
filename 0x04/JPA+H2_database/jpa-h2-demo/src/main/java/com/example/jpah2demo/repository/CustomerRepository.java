package com.example.jpah2demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpah2demo.entity.Customer;

/**
 * Repository interface for Customer entity.
 */
@Repository
public interface CustomerRepository
    extends JpaRepository<Customer, Long> {
}
