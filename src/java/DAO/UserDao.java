/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.UserBean;
import conexao.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rodrigo
 */
public class UserDao {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session session = sf.openSession();
    
    public void saveUser (UserBean user){
        try{
            
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();
            session.close();
            System.out.print("Salvou, Disgraaaaaça! Chupa, Renan!");
        }catch(HibernateException ex){
            session.getTransaction().rollback();
        
        }
        }
}
