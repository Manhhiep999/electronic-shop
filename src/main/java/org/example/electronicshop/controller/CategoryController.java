package org.example.electronicshop.controller;

import org.example.electronicshop.dto.request.CategoryCreationRequest;
import org.example.electronicshop.model.Category;
import org.example.electronicshop.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public Category createCategory(@RequestBody CategoryCreationRequest request) {
        return categoryService.createCategory(request);
    }

    @GetMapping
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }

}