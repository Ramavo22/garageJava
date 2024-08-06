package mg.fanantenana.garage.models;

import java.time.LocalTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@Table(name = "services")
@ToString
public class ServiceModel {
    @Id
    Integer id;

    @NotBlank
    String label;

    Double prix;

    LocalTime heure;


}
