package com.galeria.entity.dto.requestDto;

import com.galeria.entity.Tipo;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class AutorRequestDto {
    private Integer id;

    private String nombre;

    private String apellido;

    private String nacionalidad;

    private Tipo tipo;

    private Boolean alta = true;
}
