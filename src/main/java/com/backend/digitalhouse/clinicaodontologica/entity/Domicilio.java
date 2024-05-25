package com.backend.digitalhouse.clinicaodontologica.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DOMICILIOS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String calle;

    @Column(length = 8)
    private int numero;

    @Column(length = 50)
    private String localidad;

    @Column(length = 50)
    private String provincia;
    

}
