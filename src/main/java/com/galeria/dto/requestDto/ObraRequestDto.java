package com.galeria.dto.requestDto;

import com.galeria.entity.Tipo;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ObraRequestDto {
    private String titulo;

    private Integer anio;

    private String autorNombre;

    private String descripcion;

    private String foto;

    private Tipo tipo;

}
