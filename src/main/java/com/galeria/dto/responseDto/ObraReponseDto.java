package com.galeria.dto.responseDto;

import com.galeria.entity.Autor;
import com.galeria.entity.Tipo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ObraReponseDto {
    private String titulo;

    private Integer año;

    private String autorNombre;

    private String descripcion;

    private String foto;

    private Tipo tipo;

}
