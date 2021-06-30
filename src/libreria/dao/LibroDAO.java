/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.dao;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Libro;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LibroDAO extends DAO {

      public  Libro crear(Libro a) throws Exception {

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
    
    
    
    public  void eliminarLibro (Libro a) throws Exception {

       try {
            em.getTransaction().begin(); //Para iniciar la conexion a la base de datos
            em.remove(a); //Mandamos el objeto a la base de dato. INICIAMOS CONSULTA
            em.getTransaction().commit(); //COMO TOCAR EL RAYITO DE MSQL O INICIAR EL PROGRAMA
           //Return por si el Rodri la cagó
        } catch (Exception e) {

            em.getTransaction().rollback(); //   ----->   SI HAY UN ERROR = TE VUELVE AL ESTADO ORIGINAL
            throw new Exception ("Te mandaste una cagada al eliminar al cliente");
        }
       
    }
    
    public void modificarLibro(Libro a) throws Exception {

       try {
            em.getTransaction().begin(); //Para iniciar la conexion a la base de datos
            em.merge(a); //Modificar
            em.getTransaction().commit(); //COMO TOCAR EL RAYITO DE MSQL O INICIAR EL PROGRAMA
           //Return por si el Rodri la cagó
        } catch (Exception e) {

            em.getTransaction().rollback(); //   ----->   SI HAY UN ERROR = TE VUELVE AL ESTADO ORIGINAL
            throw new Exception ("Te mandaste una cagada al modificar al Libro");
        }
       
    }
    
    @SuppressWarnings("unchecked")
    public List<Libro>mostrarLibros(Libro a) throws Exception{
    
        try {
            return em.createQuery("Select a from Autor a").getResultList();
            
        } catch (Exception e) {
            throw new Exception ("No se mostró porque te mandaste una cagada en el codigo, Abigail");
        }
} 
    
    
     public void buscarId(Long id) throws Exception{
    
        try {
            
            Libro libro = em.find(Libro.class, id); //Busco mi libro con isbn
            
            
            if (libro == null) {
                System.out.println("No existe");
            }else{
                System.out.println(libro);
            }
            // return em.createQuery("Select a from Autor a").getResultList();
        } catch (Exception e) {
            throw new Exception ("No se mostró porque te mandaste una cagada en el codigo, Abigail");
        }
} 
   
       
    
             //Usar contol + h

}
