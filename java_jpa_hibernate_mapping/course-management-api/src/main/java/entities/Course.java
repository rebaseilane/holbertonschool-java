package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    private Teacher teacher;

    @ManyToMany
    @JoinTable(
        name = "course_student",
        joinColumns = @JoinColumn(name = "course_id"),
        inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;

    @OneToOne(mappedBy = "course", cascade = CascadeType.ALL)
    private CourseMaterial material;

    public Course() {}

    public Course(String title, Teacher teacher) {
        this.title = title;
        this.teacher = teacher;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setMaterial(CourseMaterial material) {
        this.material = material;
    }
}
