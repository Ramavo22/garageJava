package mg.fanantenana.garage.services;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import mg.fanantenana.garage.repositories.ServiceRepository;
import mg.fanantenana.garage.models.ServiceModel;

@Service
public class ServiceService {
    
    ServiceRepository serviceRepository;

    public ServiceService(mg.fanantenana.garage.repositories.ServiceRepository serviceRepositoryu) {
        serviceRepository = serviceRepositoryu;
    }

    
    public void create(String label,double prix,LocalTime heure){
        ServiceModel service = ServiceModel.builder()
                            .label(label)
                            .prix(prix)
                            .heure(heure)
                            .build();
        serviceRepository.save(service);
    }

    
    public void update(Integer id,String label,double prix,LocalTime heure){
        ServiceModel service =  ServiceModel.builder()
                                .id(id)
                                .label(label)
                                .prix(prix)
                                .heure(heure)
                                .build();
        serviceRepository.save(service);
    }

    public void delete(Integer id){
        ServiceModel service = ServiceModel.builder().id(id).build();
        serviceRepository.delete(service);
    }

    public List<ServiceModel> findAll(){
        // Utilise StreamSupport avec serviceRepository.findAll() pour obtenir un Stream
        Stream<ServiceModel> streamServices = StreamSupport.stream(serviceRepository.findAll().spliterator(), false);

        // Convertit le Stream en List
        List<ServiceModel> services = streamServices.collect(Collectors.toList());
        return services;
    }


}
