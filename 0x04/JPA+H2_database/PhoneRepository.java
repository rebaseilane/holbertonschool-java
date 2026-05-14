package com.example.jpa_h2_demo.repository;

import com.example.jpa_h2_demo.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Phone entity.
 */
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
