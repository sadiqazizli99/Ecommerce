package az.itbrains.ecommerce.repositories;

import az.itbrains.ecommerce.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
