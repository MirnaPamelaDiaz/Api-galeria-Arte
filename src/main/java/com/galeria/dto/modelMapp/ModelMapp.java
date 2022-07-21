package com.galeria.dto.modelMapp;

import com.galeria.dto.requestDto.AutorRequestDto;
import com.galeria.dto.responseDto.AutorResponseDto;
import com.galeria.entity.Autor;

import java.util.List;

public interface ModelMapp {
    AutorResponseDto autorMapResponseDto(Autor autor);

    List<AutorResponseDto> autorMapResponseDtos(List<Autor> listAutor);

    Autor requestDtoMapAutor(AutorRequestDto autorRequestDto);
}
