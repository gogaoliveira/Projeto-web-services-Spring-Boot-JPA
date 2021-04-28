package douglasOliveiracourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import douglasOliveiracourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
