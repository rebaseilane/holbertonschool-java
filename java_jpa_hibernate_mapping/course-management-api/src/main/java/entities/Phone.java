package entities;

import javax.persistence.*;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private Long id;

    private String number;

    @ManyToOne
    private Student student;

    public Phone() {}

    public Phone(String number, Student student) {
        this.number = number;
        this.student = student;
    }
}
