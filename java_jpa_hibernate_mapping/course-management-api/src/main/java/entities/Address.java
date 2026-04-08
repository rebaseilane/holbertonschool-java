package entities;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String city;

    @ManyToOne
    private Student student;

    public Address() {}

    public Address(String city, Student student) {
        this.city = city;
        this.student = student;
    }
}
