package com.backend.digitalhouse.clinicaodontologica.dto.entrada.modificacion;


import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TurnoModificacionEntradaDto {

    @NotNull
    Long id;

    @NotNull()
    Long pacienteId;

    @NotNull()
    Long odontologoId;

    @NotNull()
    LocalDateTime fechaYHora;

}
