package lv.anna.rocketshop.ecommerce.repository;

import lv.anna.rocketshop.ecommerce.model.OrderProduct;
import lv.anna.rocketshop.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}