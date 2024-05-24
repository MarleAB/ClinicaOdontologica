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
public class OdontologoModificacionEntradaDto {

    @NotNull
    Long id;

    @NotNull
    String matricula;

    @NotNull
    String nombre;

    @NotNull
    String apellido;

}
