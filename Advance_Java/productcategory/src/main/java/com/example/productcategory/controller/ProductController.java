package com.example.productcategory.controller;

import com.example.productcategory.entity.Product;
import com.example.productcategory.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/{categoryId}")
    public Product create(@PathVariable Long categoryId,
                          @RequestBody Product product) {
        return service.createProduct(categoryId, product);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteProduct(id);
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getByCategory(@PathVariable Long categoryId) {
        return service.getProductsByCategory(categoryId);
    }

    @GetMapping("/search/{name}")
    public List<Product> search(@PathVariable String name) {
        return service.searchByName(name);
    }
}