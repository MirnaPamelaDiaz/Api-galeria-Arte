package com.galeria.entity.dto.modelMapp;

import com.galeria.entity.dto.responseDto.AutorResponseDto;
import com.galeria.entity.Autor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModelMappImpl implements ModelMapp{
    ModelMapper mm = new ModelMapper();

    @Override
    public AutorResponseDto autorMapResponseDto(Autor autor) {
        return mm.map(autor,AutorResponseDto.class);
    }

    @Override
    public List<AutorResponseDto> autorMapResponseDto(List<Autor> listAutor) {
        return listAutor.stream().map(this::autorMapResponseDto).collect(Collectors.toList());
    }
}
