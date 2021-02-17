package io.Hashedin.Tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TrackController {

@Autowired
    private ServiceService serviceService;

    @RequestMapping("/api/v1/service-details")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Service> getAllServices(){
        return serviceService.getAllServices();
    }
    @RequestMapping("/api/v1/service-details/{id}")
    public Service getHistory(@PathVariable Integer id)
    {
        return serviceService.getService(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/api/v1/service-details")
    public void addService(@RequestBody Service service)
    {
        serviceService.addService(service);
    }

}
