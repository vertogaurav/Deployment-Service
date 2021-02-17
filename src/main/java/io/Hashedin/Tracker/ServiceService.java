package io.Hashedin.Tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

        private List<io.Hashedin.Tracker.Service> services= Arrays.asList(
                new io.Hashedin.Tracker.Service(1,"b","sdksdkj","abdhs","asdsk","ajshkjd","asbk","sjaksaj"),
                new io.Hashedin.Tracker.Service(2,"a","sdksdkj","abdhs","asdsk","ajshkjd","asbk","sjaksaj"),
                new io.Hashedin.Tracker.Service(3,"d","sdksdkj","abdhs","asdsk","ajshkjd","asbk","sjaksaj")
        );
        public List<io.Hashedin.Tracker.Service>getAllServices(){
            List<io.Hashedin.Tracker.Service> services=new ArrayList<>();
            serviceRepository.findAll().forEach(services::add);

            return services;
        }
        public io.Hashedin.Tracker.Service getService(Integer id)
        {
             return services.stream().filter(t->t.getId().equals(id)).findFirst().get();
        }

    public void addService(io.Hashedin.Tracker.Service service) {
            serviceRepository.save(service);
    }
}
