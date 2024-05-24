package com.backend.digitalhouse.clinicaodontologica.dto.salida.turno;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TurnoSalidaDto {

    Long id;
    PacienteTurnoSalidaDto pacienteTurnoSalidaDto;
    OdontologoTurnoSalidaDto odontologoTurnoSalidaDto;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    LocalDateTime fechaYHora;

}
