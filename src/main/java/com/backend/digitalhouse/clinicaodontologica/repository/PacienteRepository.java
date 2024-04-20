package com.backend.digitalhouse.clinicaodontologica.repository;

import com.backend.digitalhouse.clinicaodontologica.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    Paciente findByDni(int dni);

    Paciente findByDniAndNombre(int dni, String nombre);
}
