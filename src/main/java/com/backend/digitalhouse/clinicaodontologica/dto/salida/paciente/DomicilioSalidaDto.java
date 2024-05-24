package com.backend.digitalhouse.clinicaodontologica.dto.salida.paciente;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DomicilioSalidaDto {

    Long id;
    String calle;
    int numero;
    String localidad;
    String provincia;

}
