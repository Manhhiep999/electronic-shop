package org.example.electronicshop.controller;

import org.example.electronicshop.dto.request.ProductCreationRequest;
import org.example.electronicshop.model.Product;
import org.example.electronicshop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody ProductCreationRequest request) {
        return productService.createProduct(request);
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}