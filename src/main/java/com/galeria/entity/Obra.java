package com.galeria.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "obra")
public class Obra {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_obra")
  private Integer id;

  private String titulo;

  private Integer año;

  @ManyToOne
  private Autor autor;

  private String descripcion;

  private String foto;

  private Tipo tipo;
}
