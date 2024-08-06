package mg.fanantenana.garage.models;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Employe {
    
    @Id
    Long id;

    Long userId;

    Short typeEmployeId;
}
