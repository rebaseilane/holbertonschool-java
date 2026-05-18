package com.example.jpah2demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity representing an address.
 */
@Entity
public class Address {

    /**
     * Address ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * City name.
     */
    private String city;

    /**
     * Street name.
     */
    private String street;

    /**
     * Default constructor.
     */
    public Address() {
    }

    /**
     * Gets address ID.
     *
     * @return address ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets address ID.
     *
     * @param id address ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets city.
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets street.
     *
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets street.
     *
     * @param street street name
     */
    public void setStreet(String street) {
        this.street = street;
    }
}
