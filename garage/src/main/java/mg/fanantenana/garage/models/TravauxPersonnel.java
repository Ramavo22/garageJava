package mg.fanantenana.garage.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TravauxPersonnel {

    Long travauxId;

    Long employeId;

}
