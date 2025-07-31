package com.pipeline.controller;

import com.pipeline.dto.ProductRequest;
import com.pipeline.model.Product;
import com.pipeline.service.ProductService;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody @Valid ProductRequest request) {
        Product processed = service.processProduct(request);
        return ResponseEntity.ok(processed);
    }
}
