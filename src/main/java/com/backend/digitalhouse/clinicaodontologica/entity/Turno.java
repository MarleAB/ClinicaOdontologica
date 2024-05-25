package com.backend.digitalhouse.clinicaodontologica.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "TURNOS")

@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Setter
    @ManyToOne
    @JoinColumn(name = "odontologo_id")
    Odontologo odontologo;

    @Setter
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    Paciente paciente;

    @Setter
    LocalDateTime fechaYHora;

    public Turno(Odontologo odontologo, Paciente paciente, LocalDateTime fechaYHora) {
        this.odontologo = odontologo;
        this.paciente = paciente;
        this.fechaYHora = fechaYHora;
    }

    public void actualizaCita(Paciente paciente, Odontologo odontologo, LocalDateTime fechaYHora) {

        if(paciente == null) {
            throw new RuntimeException("El paciente no puede ser nulo");
        }
        if(odontologo == null) {
            throw new RuntimeException("El odontologo no puede ser nulo");
        }

        if(fechaYHora.isAfter(LocalDateTime.now())) {
            throw new RuntimeException("El odontologo no puede ser nulo");
        }

        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fechaYHora = fechaYHora;
    }

}
