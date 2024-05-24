package com.backend.digitalhouse.clinicaodontologica.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "ODONTOLOGOS")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Odontologo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(length = 50)
    String matricula;
    @Column(length = 50)
    String nombre;
    @Column(length = 50)
    String apellido;

}
