package models;

import entities.Course;

import javax.persistence.*;
import java.util.List;

public class CourseModel {

    public void create(Course course) {
        EntityManager em = Persistence.createEntityManagerFactory("course-management-jpa").createEntityManager();
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        em.close();
    }

    public Course findById(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("course-management-jpa").createEntityManager();
        Course course = em.find(Course.class, id);
        em.close();
        return course;
    }

    public List<Course> findAll() {
        EntityManager em = Persistence.createEntityManagerFactory("course-management-jpa").createEntityManager();
        List<Course> list = em.createQuery("SELECT c FROM Course c", Course.class).getResultList();
        em.close();
        return list;
    }

    public void update(Course course) {
        EntityManager em = Persistence.createEntityManagerFactory("course-management-jpa").createEntityManager();
        em.getTransaction().begin();
        em.merge(course);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Course course) {
        EntityManager em = Persistence.createEntityManagerFactory("course-management-jpa").createEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(course) ? course : em.merge(course));
        em.getTransaction().commit();
        em.close();
    }
}
