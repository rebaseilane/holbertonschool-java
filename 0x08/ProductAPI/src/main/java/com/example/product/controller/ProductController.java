package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Product REST Controller.
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "WELCOME TO PRODUCT REST API.";
    }

    @GetMapping("/allProducts")
    public Object getAllProducts() {
        List<Product> list = repo.getAllProducts();

        if (list.size() > 1000) {
            return "Code 11: Warning - the process returned more than 1000 products.";
        }
        return list;
    }

    @GetMapping("/findProductById/{id}")
    public Object findById(@PathVariable Long id) {
        if (id == null) {
            return "Code 12: The field id not informed. This information is required.";
        }

        Product p = repo.getProductById(id);
        return p;
    }

    @PostMapping("/addProduct")
    public Object addProduct(@RequestBody Product product) {
        if (product == null || product.getId() == null) {
            return "Code 10: Required fields not informed.";
        }
        repo.addProduct(product);
        return product;
    }

    @PutMapping("/updateProduct")
    public Object updateProduct(@RequestBody Product product) {
        Product existing = repo.getProductById(product.getId());

        if (existing != null && existing.equals(product)) {
            return "Code 14: No information has been updated. The new information is the same as recorded in the database.";
        }

        repo.updateProduct(product);
        return product;
    }

    @DeleteMapping("/removeProduct")
    public Object removeProduct(@RequestBody Product product) {
        return "Code 13: User not allowed to remove a product from this category.";
    }
}
