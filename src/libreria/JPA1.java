/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import libreria.dao.AutorDAO;
import libreria.dao.ClienteDAO;
import libreria.dao.LibroDAO;
import libreria.entidades.Autor;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class JPA1 {

    private static Autor a;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Cliente cliente = new Cliente(454454L, "pepe", "papu", "egg", "564564");
            ClienteDAO clienteDao = new ClienteDAO();

            clienteDao.crear(cliente); //Crear
        } catch (Exception e) {
            System.out.println(e.getMessage()); //error de la excepcion en main

        }
        
        
        try {
           Libro libro = new Libro(454454L, "pepe", 5051, 5242, 45124);
           LibroDAO libroDao = new LibroDAO();
           libroDao.crear(libro);
           libroDao.buscarId(libro.getIsbn()); //Crear
        } catch (Exception e) {
            System.out.println(e.getMessage()); //error de la excepcion en main

        }

    }

}
