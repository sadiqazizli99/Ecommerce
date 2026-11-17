package az.itbrains.ecommerce.controllers;
import az.itbrains.ecommerce.dtos.category.CategoryCreateDTO;
import az.itbrains.ecommerce.dtos.category.CategoryFeaturedDTO;
import az.itbrains.ecommerce.dtos.category.CategoryHomeDTO;
import az.itbrains.ecommerce.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryHomeDTO>> getAll(){

        List<CategoryHomeDTO> categories = categoryService.geAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);

    }
    @GetMapping("/featured")
    public ResponseEntity<List<CategoryFeaturedDTO>> featuredCategory(){

        List<CategoryFeaturedDTO> categories = categoryService.getAllFeaturedCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<CategoryCreateDTO> create(@RequestBody CategoryCreateDTO createDTO){

        CategoryCreateDTO category = categoryService.createCategory(createDTO);

        return new ResponseEntity<>(category, HttpStatus.CREATED);

    }
}
