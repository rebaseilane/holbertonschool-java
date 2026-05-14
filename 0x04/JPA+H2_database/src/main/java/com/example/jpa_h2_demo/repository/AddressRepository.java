package com.example.jpa_h2_demo.repository;

import com.example.jpa_h2_demo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Address entity.
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
