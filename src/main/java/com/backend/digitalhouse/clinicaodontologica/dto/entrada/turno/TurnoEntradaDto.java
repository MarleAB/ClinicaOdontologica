package com.backend.digitalhouse.clinicaodontologica.dto.entrada.turno;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TurnoEntradaDto {

    @NotNull(message = "El paciente no puede ser nulo")
    Long pacienteId;

    @NotNull(message = "El odontologo no puede ser nulo")
    Long odontologoId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    @FutureOrPresent(message = "La fecha no puede ser anterior al día de hoy")
    @NotNull(message = "Debe especificarse la fecha y hora del turno")
    LocalDateTime fechaYHora;

}
