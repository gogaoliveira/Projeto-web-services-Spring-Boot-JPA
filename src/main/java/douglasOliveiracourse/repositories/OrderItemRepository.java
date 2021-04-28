package douglasOliveiracourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import douglasOliveiracourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
