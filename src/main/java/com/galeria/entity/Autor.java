package com.galeria.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autor")
    private Integer id;

    private String nombre;

    private String apellido;

    private String nacionalidad;

    private Tipo tipo;

    @Column(nullable = false)
    private Boolean alta = true;
    
    @OneToMany
    private List<Obra> obraList = new ArrayList<>();
}
