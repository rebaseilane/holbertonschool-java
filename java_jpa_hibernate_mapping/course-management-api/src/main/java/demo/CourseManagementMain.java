package demo;

import entities.*;
import models.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;

public class CourseManagementMain {

    public static void main(String[] args) {

        Student student = new Student("John");

        Address address = new Address("Johannesburg", student);
        Phone phone = new Phone("123456789", student);

        student.setAddresses(Arrays.asList(address));
        student.setPhones(Arrays.asList(phone));

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("course-management-jpa");
        EntityManager em = emf.createEntityManager();

        Teacher teacher = new Teacher("Mr Smith");

        em.getTransaction().begin();
        em.persist(teacher);
        em.getTransaction().commit();
        em.close();

        Course course = new Course("Java ORM", teacher);
        course.setStudents(Arrays.asList(student));

        CourseMaterial material = new CourseMaterial("www.material.com", course);
        course.setMaterial(material);

        StudentModel studentModel = new StudentModel();
        CourseModel courseModel = new CourseModel();

        studentModel.create(student);
        courseModel.create(course);

        System.out.println("Data inserted successfully");
    }
}
