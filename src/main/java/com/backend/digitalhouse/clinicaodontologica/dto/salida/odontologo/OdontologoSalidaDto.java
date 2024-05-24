package com.backend.digitalhouse.clinicaodontologica.dto.salida.odontologo;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OdontologoSalidaDto {

    Long id;
    String matricula;
    String nombre;
    String apellido;

}
