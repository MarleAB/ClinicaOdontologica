package com.backend.digitalhouse.clinicaodontologica.dto.entrada.modificacion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DomicilioModificacionEntradaDto {

    @NotNull
    Long id;

    @NotNull
    String calle;

    @NotNull
    int numero;

    @NotNull
    String localidad;

    @NotNull
    String provincia;

}
