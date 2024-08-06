package mg.fanantenana.garage.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder.Default;

@Getter
@Setter
@Builder
public class Travaux {
    @Id
    Long id;

    LocalDateTime dateHeureDebut;

    LocalDateTime dateHeureFin;

    Long userId;

    Integer serviceId;

    Short slotId;

    Double prix;

    @Default
    LocalDateTime datePaiement = null;

}
