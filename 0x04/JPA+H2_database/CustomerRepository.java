package com.example.jpa_h2_demo.repository;

import com.example.jpa_h2_demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Customer entity.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
