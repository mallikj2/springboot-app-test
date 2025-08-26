package com.codewithraman.productservice.controller;

// Create a Spring Boot REST controller named ProductController with a GET endpoint /products that returns a hardcoded list of 3 different Product objects.

import com.codewithraman.productservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
public class ProductController {

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = Arrays.asList(
            new Product(1L, "Laptop", 999.99),
            new Product(2L, "Smartphone", 499.99),
            new Product(3L, "Tablet", 299.99)
        );
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
