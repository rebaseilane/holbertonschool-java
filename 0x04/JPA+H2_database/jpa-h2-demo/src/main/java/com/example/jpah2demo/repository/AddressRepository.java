package com.example.jpah2demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpah2demo.entity.Address;

/**
 * Repository interface for Address entity.
 */
@Repository
public interface AddressRepository
    extends JpaRepository<Address, Long> {
}
