package com.example.jpah2demo.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity representing a customer.
 */
@Entity
public class Customer {

    /**
     * Customer ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Customer name.
     */
    private String name;

    /**
     * Customer email.
     */
    private String email;

    /**
     * List of customer phone numbers.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Phone> phones;

    /**
     * List of customer addresses.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresses;

    /**
     * Default constructor.
     */
    public Customer() {
    }

    /**
     * Gets customer ID.
     *
     * @return customer ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets customer ID.
     *
     * @param id customer ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets customer name.
     *
     * @return customer name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets customer name.
     *
     * @param name customer name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets customer email.
     *
     * @return customer email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets customer email.
     *
     * @param email customer email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets phone list.
     *
     * @return list of phones
     */
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Sets phone list.
     *
     * @param phones list of phones
     */
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    /**
     * Gets address list.
     *
     * @return list of addresses
     */
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Sets address list.
     *
     * @param addresses list of addresses
     */
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
