package douglasOliveiracourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import douglasOliveiracourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
