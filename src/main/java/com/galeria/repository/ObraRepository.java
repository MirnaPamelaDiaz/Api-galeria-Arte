package com.galeria.repository;

import com.galeria.entity.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObraRepository extends JpaRepository<Obra,Integer> {
}
