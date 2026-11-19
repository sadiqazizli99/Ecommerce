package az.itbrains.ecommerce.services.impls;

import az.itbrains.ecommerce.dtos.category.CategoryCreateDTO;
import az.itbrains.ecommerce.dtos.category.CategoryFeaturedDTO;
import az.itbrains.ecommerce.dtos.category.CategoryHomeDTO;
import az.itbrains.ecommerce.models.Category;
import az.itbrains.ecommerce.repositories.CategoryRepository;
import az.itbrains.ecommerce.services.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;


    public CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CategoryHomeDTO> geAllCategories() {
        List<Category> categoryList = categoryRepository.findAll();
        if(!categoryList.isEmpty()){
            List<CategoryHomeDTO> categories = categoryList
                    .stream()
                    .map(category -> modelMapper.map(category, CategoryHomeDTO.class))
                    .toList();

            return categories;
        }
        return List.of();
    }

    @Override
    public List<CategoryFeaturedDTO> getAllFeaturedCategories() {
        return List.of();
    }

    @Override
    public CategoryCreateDTO createCategory(CategoryCreateDTO createDTO) {
        Category category = new Category();
        category.setName(createDTO.getName());
        category.setFeatured(false);
        categoryRepository.save(category);

        return createDTO;
    }
}
