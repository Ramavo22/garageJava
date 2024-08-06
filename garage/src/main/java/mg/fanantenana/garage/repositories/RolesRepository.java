package mg.fanantenana.garage.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import mg.fanantenana.garage.models.Roles;

/**
 * RolesRepository
 */
public interface RolesRepository extends CrudRepository<Roles,Short>{
    @Query("SELECT id,label FROM roles")
    List<Roles> getListRoles();
}