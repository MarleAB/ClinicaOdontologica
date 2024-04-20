package com.backend.digitalhouse.clinicaodontologica.dto.entrada;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class PacienteEntradaDto {

    @Size(max = 50, message = "El nombre debe tener hasta 50 caracteres")
    @NotNull(message = "El nombre del paciente no puede ser nulo")
    @NotBlank(message = "Debe especificarse el nombre del paciente")
    private String nombre;

    @Size(max = 50, message = "El apellido debe tener hasta 50 caracteres")
    @NotNull(message = "El apellido del paciente no puede ser nulo")
    @NotBlank(message = "Debe especificarse el apellido del paciente")
    private String apellido;

    @NotNull(message = "El dni del paciente no puede ser nulo")
    @Positive(message = "El dni del paciente no puede ser nulo o menor a cero")
    @Digits(integer = 8, fraction = 0, message = "El número debe tener como máximo 8 dígitos")
    private int dni;

    @FutureOrPresent(message = "La fecha no puede ser anterior al día de hoy")
    @NotNull(message = "Debe especificarse la fecha de ingreso del paciente")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    //@JsonProperty("date")
    private LocalDate fechaIngreso;

    @NotNull(message = "El domicilio del paciente no puede ser nulo")
    @Valid
    private DomicilioEntradaDto domicilio;

    public PacienteEntradaDto() {
    }

    public PacienteEntradaDto(String nombre, String apellido, int dni, LocalDate fechaIngreso, DomicilioEntradaDto domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {

        this.dni = dni;
    }

    public LocalDate getFechaIngreso() {

        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {

        this.fechaIngreso = fechaIngreso;
    }

    public DomicilioEntradaDto getDomicilioEntradaDto() {

        return domicilio;
    }

    public void setDomicilioEntradaDto(DomicilioEntradaDto domicilio) {
        this.domicilio = domicilio;
    }
}
