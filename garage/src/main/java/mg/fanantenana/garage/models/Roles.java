package mg.fanantenana.garage.models;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Roles {
    @Id
    Short id;

    @NotBlank
    String label;
}
