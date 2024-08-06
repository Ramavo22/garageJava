package mg.fanantenana.garage.repositories;

import org.springframework.data.repository.CrudRepository;

import mg.fanantenana.garage.models.Users;

public interface UserRepository extends CrudRepository<Users,Long>{
    
}
