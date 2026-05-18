package com.example.jpah2demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpah2demo.entity.Phone;

/**
 * Repository interface for Phone entity.
 */
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
