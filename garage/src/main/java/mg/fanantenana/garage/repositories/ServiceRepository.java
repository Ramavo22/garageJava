package mg.fanantenana.garage.repositories;

import org.springframework.data.repository.CrudRepository;

import mg.fanantenana.garage.models.ServiceModel;

public interface ServiceRepository extends CrudRepository<ServiceModel,Integer>{
    
}
