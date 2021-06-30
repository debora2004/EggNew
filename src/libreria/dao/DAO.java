/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DAO {
    
   protected EntityManager em = Persistence.createEntityManagerFactory("JPA1PU").createEntityManager();
    
    
    
    
    

}
