/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.entidades;

import java.io.Serializable;
import java.util.Scanner;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

@Entity
public class Libro implements Serializable  {

    //SERIALIZABLE = BYTES
    
    @Id  //Anotación
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long isbn;
    @ManyToOne //manytoOne de libros a autor 
    private Autor autor;
    @ManyToOne
    private Editorial editorial;
    private String titulo;
    private Integer ejemplares;
    private Integer prestados;
    private Integer anio;

    public Libro() {
    }

    public Libro(long isbn, String titulo, Integer ejemplares, Integer prestados, Integer anio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
        this.anio = anio;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getPrestados() {
        return prestados;
    }

    public void setPrestados(Integer prestados) {
        this.prestados = prestados;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", ejemplares=" + ejemplares + ", prestados=" + prestados + ", anio=" + anio + '}';
    }
    
    
    
    
    
    
    
    

}
