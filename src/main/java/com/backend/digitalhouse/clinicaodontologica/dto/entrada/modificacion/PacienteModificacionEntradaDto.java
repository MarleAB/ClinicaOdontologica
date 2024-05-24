package com.backend.digitalhouse.clinicaodontologica.dto.entrada.modificacion;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class
PacienteModificacionEntradaDto {

    @NotNull(message = "Debe proveerse el id del paciente que se desea modificar")
    Long id;

    @Size(min =2, max = 50, message = "El nombre debe tener hasta 50 caracteres")
    @NotNull(message = "El nombre del paciente no puede ser nulo")
    @NotBlank(message = "Debe especificarse el nombre del paciente")
    String nombre;

    @Size(max = 50, message = "El apellido debe tener hasta 50 caracteres")
    @NotNull(message = "El apellido del paciente no puede ser nulo")
    @NotBlank(message = "Debe especificarse el apellido del paciente")
    String apellido;

    @NotNull(message = "Debe especificarse el dni del paciente")
    @Digits(integer = 8, fraction = 0, message = "El número debe tener como máximo 8 dígitos")
    int dni;

    @FutureOrPresent(message = "La fecha no puede ser anterior al día de hoy")
    @NotNull(message = "Debe especificarse la fecha de ingreso del paciente")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    LocalDate fechaIngreso;

    @NotNull(message = "El domicilio del paciente no puede ser nulo")
    @Valid
    DomicilioModificacionEntradaDto domicilio;

}
