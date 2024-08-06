package mg.fanantenana.garage.repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import mg.fanantenana.garage.models.Slot;

public interface SlotRepository extends CrudRepository<Slot,Short> {
    
    @Query("SELECT id,label FROM slot")
    List<Slot> getListSlot();
}
