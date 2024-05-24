package com.backend.digitalhouse.clinicaodontologica.dto.salida.paciente;

import com.backend.digitalhouse.clinicaodontologica.dto.salida.paciente.DomicilioSalidaDto;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PacienteSalidaDto {

    Long id;
    String nombre;
    String apellido;
    int dni;
    LocalDate fechaIngreso;
    DomicilioSalidaDto domicilioSalidaDto;

}
