package njuics.demos.petsalon.repository;


import njuics.demos.petsalon.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface OwnerRepository extends JpaRepository<Owner, Integer> {

}
