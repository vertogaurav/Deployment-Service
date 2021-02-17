package io.Hashedin.Tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;


        public List<io.Hashedin.Tracker.Service>getAllServices(){
            List<io.Hashedin.Tracker.Service> services=new ArrayList<>();
            serviceRepository.findAll().forEach(services::add);

            return services;
        }
        public io.Hashedin.Tracker.Service getService(Integer id)
        {
                return serviceRepository.getById(id);
//             return services.stream().filter(t->t.getId().equals(id)).findFirst().get();
        }

    public void addService(io.Hashedin.Tracker.Service service) {

            serviceRepository.save(service);
    }
}
