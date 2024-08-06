package mg.fanantenana.garage.models;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeEmploye {

    @Id
    Short id;

    @NotBlank
    String label;

    @PositiveOrZero(message = "Le salaire doit être postif")
    Double salaire;

}
