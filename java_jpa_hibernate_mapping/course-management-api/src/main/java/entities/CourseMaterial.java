package entities;

import javax.persistence.*;

@Entity
public class CourseMaterial {

    @Id
    @GeneratedValue
    private Long id;

    private String url;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public CourseMaterial() {}

    public CourseMaterial(String url, Course course) {
        this.url = url;
        this.course = course;
    }
}
