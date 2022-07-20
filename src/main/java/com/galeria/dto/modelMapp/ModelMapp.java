package com.galeria.entity.dto.modelMapp;

import com.galeria.entity.dto.responseDto.AutorResponseDto;
import com.galeria.entity.Autor;

import java.util.List;

public interface ModelMapp {

    AutorResponseDto autorMapResponseDto(Autor autor);
    List<AutorResponseDto> autorMapResponseDto(List<Autor> listAutor);
}
