package models;

import entities.Student;

import javax.persistence.*;
import java.util.List;

public class StudentModel {

    public void create(Student student) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("course-management-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    public Student findById(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("course-management-jpa").createEntityManager();
        Student student = em.find(Student.class, id);
        em.close();
        return student;
    }

    public List<Student> findAll() {
        EntityManager em = Persistence.createEntityManagerFactory("course-management-jpa").createEntityManager();
        List<Student> list = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
        em.close();
        return list;
    }

    public void update(Student student) {
        EntityManager em = Persistence.createEntityManagerFactory("course-management-jpa").createEntityManager();
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Student student) {
        EntityManager em = Persistence.createEntityManagerFactory("course-management-jpa").createEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(student) ? student : em.merge(student));
        em.getTransaction().commit();
        em.close();
    }
}
