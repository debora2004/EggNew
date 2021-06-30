/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

@Entity
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;
  
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY) // solo para long -> para autoincremetar
    private String id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Temporal(TemporalType.DATE)
    private Date devolucion;
    @ManyToOne
    private Cliente cliente;
    @OneToMany
    private List<Libro> libro;
    
    public Prestamo() {
    }

    public Prestamo(String id, Date fecha, Date devolucion) {
        this.id = id;
        this.fecha = fecha;
        this.devolucion = devolucion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", fecha=" + fecha + ", devolucion=" + devolucion + '}';
    }
    
     
    
    
}
