package lv.anna.rocketshop.ecommerce.repository;

import lv.anna.rocketshop.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}