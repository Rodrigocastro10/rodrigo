/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.UserBean;
import conexao.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rodrigo
 */
public class UserDao {
    //Abertura se sessão Hibernate
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session session = sf.openSession();

    //Método para salvar usuário no banco de dados
    public void saveUser(UserBean user) {
        try {

            session.beginTransaction();
            session.merge(user);
            session.flush();
            session.getTransaction().commit();

            System.out.print("Salvou, Disgraaaaaça! Chupa, Renan!");
        } catch (HibernateException ex) {
            session.getTransaction().rollback();

        }
        session.close();
    }

    //Método para deletar dados de usuários do banco de dados
    public void delete(UserBean user) {

        try {
            int id = user.getIdUser();
            session.beginTransaction();
            session.delete(user);

        } catch (HibernateException ex) {
            session.getTransaction().rollback();

        }
        session.close();
    }

    //Método para atualizar dados do Usuário
    public void update(UserBean user) {
       
        try {
            session.beginTransaction();
            session.update(user);
            session.flush();
            session.getTransaction().commit();
            
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
        session.close();
    }
    /*
    public UserBean searchByRecord(String name) {
        
        try {
            session.beginTransaction();
            Query qu = session.createQuery("select usuario where usuario name =:name"); 
            qu.setParameter("recordNo", RecordNo);
            daoSearchList = qu.list();
            int count = daoSearchList.size();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return daoSearchList;
        
 }
    */
    
    
    
    
    
    
}
