package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;

    public Teacher() {}

    public Teacher(String name) {
        this.name = name;
    }
}
