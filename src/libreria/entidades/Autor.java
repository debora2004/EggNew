/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Entity
public class Autor implements Serializable {

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
   @OneToMany(mappedBy = "autor") //list de libros
    private List<Libro> libros;
    private String nombre;

    public Autor() {
    }

    public Autor(String nombre) {
    
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}
