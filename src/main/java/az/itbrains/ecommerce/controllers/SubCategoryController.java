package az.itbrains.ecommerce.controllers;

import az.itbrains.ecommerce.services.SubCategoryService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubCategoryController {
    private final SubCategoryService subCategoryService;

    public SubCategoryController(SubCategoryService subCategoryService) {
        this.subCategoryService = subCategoryService;
    }
}
