package com.backend.digitalhouse.clinicaodontologica.dto.entrada.odontologo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OdontologoEntradaDto {

    @NotNull(message = "La matricula no puede ser nulo")
    @NotBlank(message = "Debe especificarse la matricula del odontólogo")
    //@Pattern(regexp = "^[A-Z]{2}-\\d{1,3}\\d*$")
    @Size(min = 10, max = 50, message = "El campo debe tener mínimo 10 caracteres")
    String matricula;

    @Size(min = 2, max = 50, message = "El nombre del odontólogo debe tener hasta 50 caracteres")
    @NotNull(message = "El nombre de odontólogo no puede ser nulo")
    @NotBlank(message = "Debe especificarse el nombre del odontólogo")
    String nombre;

    @Size(min = 2, max = 50, message = "El apellido de odontólogo debe tener hasta 50 caracteres")
    @NotNull(message = "El apellido de odontólogo no puede ser nulo")
    @NotBlank(message = "Debe especificarse el apellido del odontólogo")
    String apellido;

}
