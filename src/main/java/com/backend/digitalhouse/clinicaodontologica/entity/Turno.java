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


}
