/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import libreria.entidades.Prestamo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

public class PrestamosDAO extends DAO{
    
    public  Prestamo crear(Prestamo a) throws Exception {

        try {
            em.getTransaction().begin(); //Para iniciar la conexion a la base de datos
            em.persist(a); //Mandamos el objeto a la base de dato. INICIAMOS CONSULTA
            em.getTransaction().commit(); //COMO TOCAR EL RAYITO DE MSQL O INICIAR EL PROGRAMA
            return a;
        } catch (Exception e) {

            em.getTransaction().rollback(); //   ----->   SI HAY UN ERROR = TE VUELVE AL ESTADO ORIGINAL
            throw new Exception ("Salio todo mal");
        }
       

    }

    public  void eliminarPrestamo(Prestamo a) throws Exception {

       try {
            em.getTransaction().begin(); //Para iniciar la conexion a la base de datos
            em.remove(a); //Mandamos el objeto a la base de dato. INICIAMOS CONSULTA
            em.getTransaction().commit(); //COMO TOCAR EL RAYITO DE MSQL O INICIAR EL PROGRAMA
           //Return por si el Rodri la cagó
        } catch (Exception e) {

            em.getTransaction().rollback(); //   ----->   SI HAY UN ERROR = TE VUELVE AL ESTADO ORIGINAL
            throw new Exception ("Te mandaste una cagada al eliminar al autor");
        }
       
    }
    
    public void modificarPrestamo(Prestamo a) throws Exception {

       try {
            em.getTransaction().begin(); //Para iniciar la conexion a la base de datos
            em.merge(a); //Modificar
            em.getTransaction().commit(); //COMO TOCAR EL RAYITO DE MSQL O INICIAR EL PROGRAMA
           //Return por si el Rodri la cagó
        } catch (Exception e) {

            em.getTransaction().rollback(); //   ----->   SI HAY UN ERROR = TE VUELVE AL ESTADO ORIGINAL
            throw new Exception ("Te mandaste una cagada al eliminar al autor");
        }
       
    }
    
    @SuppressWarnings("unchecked")
    public List<Prestamo>mostrarPrestamoes(Prestamo a) throws Exception{
    
        try {
            return em.createQuery("Select a from Prestamo a").getResultList();
            
        } catch (Exception e) {
            throw new Exception ("Te mandaste una cagada al eliminar al autor");
        }
        
} 
             //Usar contol + h
    

}
