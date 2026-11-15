package az.itbrains.ecommerce.services.impls;

import az.itbrains.ecommerce.repositories.SubCategoryRepository;
import az.itbrains.ecommerce.services.SubCategoryService;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

    private final SubCategoryRepository subCategoryRepository;

    public SubCategoryServiceImpl(SubCategoryRepository subCategoryRepository) {
        this.subCategoryRepository = subCategoryRepository;
    }
}
