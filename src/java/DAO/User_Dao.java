/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rodrigo
 */
public class User_Dao {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    
    
    public void saveUser (){
        Session session = sf.openSession();
        session.close();
        System.out.print("Salvou, Disgraaaaaça! Chupa, Renan!");
    }
}
