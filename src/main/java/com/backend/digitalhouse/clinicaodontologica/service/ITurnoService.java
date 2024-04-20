package com.backend.digitalhouse.clinicaodontologica.service;

import com.backend.digitalhouse.clinicaodontologica.dto.entrada.TurnoEntradaDto;
import com.backend.digitalhouse.clinicaodontologica.dto.salida.TurnoSalidaDto;
import org.apache.coyote.BadRequestException;
import org.apache.velocity.exception.ResourceNotFoundException;

import java.util.List;


public interface ITurnoService {

    TurnoSalidaDto registrarTurno(TurnoEntradaDto turnoEntradaDto) throws BadRequestException, ResourceNotFoundException;

    List<TurnoSalidaDto> listarTurnos();

    TurnoSalidaDto buscarTurnoPorId(Long id);

    void eliminarTurno(Long id) throws ResourceNotFoundException;

    TurnoSalidaDto modificarTurno(TurnoEntradaDto turnoEntradaDto, Long id);
}

