package lv.anna.rocketshop.ecommerce.repository;

import lv.anna.rocketshop.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}