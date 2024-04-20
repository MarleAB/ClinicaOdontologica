package com.backend.digitalhouse.clinicaodontologica.controller;

import com.backend.digitalhouse.clinicaodontologica.dto.entrada.TurnoEntradaDto;
import com.backend.digitalhouse.clinicaodontologica.dto.salida.TurnoSalidaDto;
import com.backend.digitalhouse.clinicaodontologica.service.ITurnoService;
import jakarta.validation.Valid;
import org.apache.coyote.BadRequestException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    private ITurnoService turnoService;

    public TurnoController(ITurnoService turnoService) {
        this.turnoService = turnoService;
    }

    //POST
    @PostMapping("/registrar")
    public ResponseEntity<TurnoSalidaDto> registrarPaciente(@RequestBody @Valid TurnoEntradaDto turnoEntradaDto) throws BadRequestException, ResourceNotFoundException {
        return new ResponseEntity<>(turnoService.registrarTurno(turnoEntradaDto), HttpStatus.CREATED);
    }
}
