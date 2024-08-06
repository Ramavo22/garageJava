package mg.fanantenana.garage.services;

import java.util.List;

import org.springframework.stereotype.Service;

import mg.fanantenana.garage.models.Slot;
import mg.fanantenana.garage.repositories.SlotRepository;

@Service
public class SlotService {

    SlotRepository slotRepository;

    public SlotService(SlotRepository slotRepository) {
        this.slotRepository = slotRepository;
    }

    public List<Slot> getListSlot(){
        return slotRepository.getListSlot();
    }
    
}
