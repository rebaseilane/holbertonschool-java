package models;

import entities.Person;
import javax.persistence.*;
import java.util.List;

public class PersonModel {

    private EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        return emf.createEntityManager();
    }

    public void create(Person p) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Person p) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Person p) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Person per = em.find(Person.class, p.getId());
        em.remove(per);
        em.getTransaction().commit();
        em.close();
    }

    public Person findById(Person p) {
        EntityManager em = getEntityManager();
        Person per = em.find(Person.class, p.getId());
        em.close();
        return per;
    }

    public List<Person> findAll() {
        EntityManager em = getEntityManager();
        List<Person> persons = em.createQuery("FROM Person", Person.class).getResultList();
        em.close();
        return persons;
    }
}
