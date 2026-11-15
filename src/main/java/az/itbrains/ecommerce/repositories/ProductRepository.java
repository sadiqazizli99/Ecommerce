package az.itbrains.ecommerce.repositories;

import az.itbrains.ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
