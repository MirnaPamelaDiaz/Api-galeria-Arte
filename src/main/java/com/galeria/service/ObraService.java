package com.galeria.service;

import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.List;

public interface ObraService {
    ResponseEntity<Categoria> guardarCategorias(Categoria categoria);

    ResponseEntity<Categoria> eliminarCategoria(Long id);

    ResponseEntity<Collection<Producto>> listarProductoPorCategoria(Long id);

    ResponseEntity<List<CategoriaResponseDto>> listarCategoriasDto();

    ResponseEntity<Categoria> guardarCategorias(CategoriaRequestDto categoriaRequestDto);

    ResponseEntity<CategoriaRequestDto> guardarCategoriasDto(CategoriaRequestDto categoriaRequestDto);
}
