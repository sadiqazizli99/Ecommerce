package az.itbrains.ecommerce.repositories;

import az.itbrains.ecommerce.models.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
