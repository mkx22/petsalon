package njuics.demos.petsalon.service;

import njuics.demos.petsalon.model.Service;
import njuics.demos.petsalon.repository.ServiceRepository;
import org.omg.CORBA.ServerRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class ServeService {
    @Autowired
    private ServiceRepository serviceRepository;

    public Service findService(Integer id){
        return serviceRepository.findById(id).get();
    }

    public void deleteService(Integer id){
        serviceRepository.deleteById(id);
        //return "chenggong";
    }

}
