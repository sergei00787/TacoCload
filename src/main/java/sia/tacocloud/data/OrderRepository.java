package sia.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

//    Order save(Order order);
//    List<Order> findByDeliveryZip(String deliveryZip);
}
