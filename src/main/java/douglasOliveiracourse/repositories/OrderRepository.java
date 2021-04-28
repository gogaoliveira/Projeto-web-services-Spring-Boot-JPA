package douglasOliveiracourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import douglasOliveiracourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
