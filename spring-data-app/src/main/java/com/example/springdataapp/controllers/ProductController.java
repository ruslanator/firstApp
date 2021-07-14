package com.example.springdataapp.controllers;

import com.example.springdataapp.model.Product;
import com.example.springdataapp.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id).get();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/remove/{id}")
    public List<Product> removeProductById(@PathVariable Long id) {
        productRepository.deleteById(id);
        return productRepository.findAll();
    }
}
