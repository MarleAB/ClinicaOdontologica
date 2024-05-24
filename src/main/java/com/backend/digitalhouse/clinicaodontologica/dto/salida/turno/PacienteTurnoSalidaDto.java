package com.backend.digitalhouse.clinicaodontologica.dto.salida.turno;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PacienteTurnoSalidaDto {

    Long id;
    String nombre;
    String apellido;

}
