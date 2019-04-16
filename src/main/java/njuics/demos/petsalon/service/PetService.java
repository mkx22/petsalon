package njuics.demos.petsalon.service;

import njuics.demos.petsalon.model.Pet;
import njuics.demos.petsalon.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PetService {
    @Autowired
    private PetRepository petRepository;

    public Pet findPet(Integer id){
        return petRepository.findById(id).get();
    }

    public void deletePet(Integer id){
        petRepository.deleteById(id);
        //return "chenggong";
    }

}
