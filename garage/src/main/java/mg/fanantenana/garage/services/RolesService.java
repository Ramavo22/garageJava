package mg.fanantenana.garage.services;

import java.util.List;

import org.springframework.stereotype.Service;

import mg.fanantenana.garage.models.Roles;
import mg.fanantenana.garage.repositories.RolesRepository;

@Service
public class RolesService {
    RolesRepository rolesRepository;

    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public List<Roles> getListRoles(){
        return rolesRepository.getListRoles();
    }
}
