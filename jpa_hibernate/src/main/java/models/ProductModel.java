package models;

import entities.Product;
import javax.persistence.*;
import java.util.List;

public class ProductModel {

    private EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        return emf.createEntityManager();
    }

    public void create(Product p) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Product p) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Product p) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Product prod = em.find(Product.class, p.getId());
        em.remove(prod);
        em.getTransaction().commit();
        em.close();
    }

    public Product findById(Product p) {
        EntityManager em = getEntityManager();
        Product prod = em.find(Product.class, p.getId());
        em.close();
        return prod;
    }

    public List<Product> findAll() {
        EntityManager em = getEntityManager();
        List<Product> products = em.createQuery("FROM Product", Product.class).getResultList();
        em.close();
        return products;
    }
}
