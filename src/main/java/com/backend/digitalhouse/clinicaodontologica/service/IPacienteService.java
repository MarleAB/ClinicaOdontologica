package com.backend.digitalhouse.clinicaodontologica.service;

import com.backend.digitalhouse.clinicaodontologica.dto.entrada.PacienteEntradaDto;
import com.backend.digitalhouse.clinicaodontologica.dto.salida.PacienteSalidaDto;
import org.apache.velocity.exception.ResourceNotFoundException;


import java.util.List;

public interface IPacienteService {

    PacienteSalidaDto registrarPaciente(PacienteEntradaDto paciente);

    List<PacienteSalidaDto> listarPacientes();

    PacienteSalidaDto buscarPacientePorId(Long id);

    void eliminarPaciente(Long id) throws ResourceNotFoundException;

    PacienteSalidaDto modificarPaciente(PacienteEntradaDto pacienteEntradaDto, Long id) throws ResourceNotFoundException;
}
