package com.example.productcategory.service;

import com.example.productcategory.entity.Product;
import java.util.List;

public interface ProductService {

    Product createProduct(Long categoryId, Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);

    List<Product> getProductsByCategory(Long categoryId);

    List<Product> searchByName(String name);
}