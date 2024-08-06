package mg.fanantenana.garage.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder.Default;

@Setter
@Getter
@Builder
public class DayOff {
    @Id
    Long id;
    
    Long employeId;

    LocalDate dateDebut;

    Integer numberOfDays;

    LocalDateTime dateDemande;

    @Default
    LocalDateTime dateReponse = null;

    @Default
    Boolean isValidated = null;


}
