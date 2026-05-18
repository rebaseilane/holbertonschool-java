package com.example.jpah2demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity representing a phone number.
 */
@Entity
public class Phone {

    /**
     * Phone ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Phone number.
     */
    private String number;

    /**
     * Default constructor.
     */
    public Phone() {
    }

    /**
     * Gets phone ID.
     *
     * @return phone ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets phone ID.
     *
     * @param id phone ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets phone number.
     *
     * @return phone number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets phone number.
     *
     * @param number phone number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}
