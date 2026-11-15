package az.itbrains.ecommerce.services.impls;

import az.itbrains.ecommerce.repositories.CategoryRepository;
import az.itbrains.ecommerce.services.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
