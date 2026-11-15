package az.itbrains.ecommerce.controllers;
import az.itbrains.ecommerce.dtos.category.CategoryHomeDTO;
import az.itbrains.ecommerce.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryHomeDTO>> getAll(){

        return new ResponseEntity<>(List.of(), HttpStatus.OK);

    }
}
