package com.example.product.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * In-memory repository for products.
 */
@Repository
public class ProductRepository {

    private List<Product> list = new ArrayList<>();

    public List<Product> getAllProducts() {
        return list;
    }

    public Product getProductById(Long id) {
        return list.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addProduct(Product p) {
        list.add(p);
    }

    public void updateProduct(Product p) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(p.getId())) {
                list.set(i, p);
                return;
            }
        }
    }

    public void removeProduct(Product p) {
        list.remove(p);
    }

    public void addList(List<Product> listOfProducts) {
        list.addAll(listOfProducts);
    }
}
