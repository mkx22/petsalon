package njuics.demos.petsalon.repository;


import njuics.demos.petsalon.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
//    @Modifying
//    @Transactional
//    @Query("delete from User u where u.id=:id")
//    public int deleteOwner(@Param("id") Integer id);

}
