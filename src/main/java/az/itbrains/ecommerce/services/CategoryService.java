package az.itbrains.ecommerce.services;

import az.itbrains.ecommerce.dtos.category.CategoryCreateDTO;
import az.itbrains.ecommerce.dtos.category.CategoryFeaturedDTO;
import az.itbrains.ecommerce.dtos.category.CategoryHomeDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryHomeDTO> geAllCategories();

    List<CategoryFeaturedDTO> getAllFeaturedCategories();

    CategoryCreateDTO createCategory(CategoryCreateDTO createDTO);
}
