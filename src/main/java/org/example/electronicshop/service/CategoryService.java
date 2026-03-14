package org.example.electronicshop.service;

import org.example.electronicshop.dto.request.CategoryCreationRequest;
import org.example.electronicshop.model.Category;
import org.example.electronicshop.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(CategoryCreationRequest request) {

        Category category = new Category();

        category.setName(request.getName());

        return categoryRepository.save(category);
    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

}