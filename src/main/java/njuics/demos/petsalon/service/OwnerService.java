package njuics.demos.petsalon.service;

import njuics.demos.petsalon.model.Owner;
import njuics.demos.petsalon.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    public Owner findOwner(Integer id){
        return ownerRepository.findById(id).get();
    }
    public void deleteOwner(Integer id){
        ownerRepository.deleteById(id);
        //return "chenggong";
    }
}
