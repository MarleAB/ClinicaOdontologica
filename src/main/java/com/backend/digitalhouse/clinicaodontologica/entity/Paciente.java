package com.backend.digitalhouse.clinicaodontologica.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "PACIENTES")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length = 50)
    String nombre;
    @Column(length = 50)
    String apellido;
    @Column(length = 20)
    int dni;
    LocalDate fechaIngreso;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

}
