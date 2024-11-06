package com.Proyecto_BrandonJVM.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public void setRutaImagen(String a) {
        rutaImagen = a;
    }

    public Long getIdCategoria() {
        return this.idCategoria;
    }

    public Categoria() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }
}
