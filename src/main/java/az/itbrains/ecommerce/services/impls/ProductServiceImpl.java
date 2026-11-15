package az.itbrains.ecommerce.services.impls;

import az.itbrains.ecommerce.repositories.ProductRepository;
import az.itbrains.ecommerce.services.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
