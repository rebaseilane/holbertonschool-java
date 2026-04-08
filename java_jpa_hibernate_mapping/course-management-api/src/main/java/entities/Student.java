package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Address> addresses;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Phone> phones;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setAddresses(List<Address> addresses) { this.addresses = addresses; }
    public void setPhones(List<Phone> phones) { this.phones = phones; }
}
