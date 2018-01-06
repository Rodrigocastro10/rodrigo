/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.UserBean;
import conexao.HibernateUtil;
import java.util.List;
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
    
    public UserBean searchById(int iduser) {
        UserBean user = new UserBean();
       try {   
            session.beginTransaction();//inicia a transação
            String hql = "from UserBean where idUser like "+iduser;//cria uma string contendo o HQL que será interpretado em SQL
            Query query = session.createQuery(hql);//cria a seção da Query utilizando o HQL como parâmetro
            List <UserBean> UserList = query.list();//cria a lista de resultados para receber a consulta da query
           // query.setParameter("keyword", iduser);
            query.setMaxResults(1);//informa para a query que será necessário apenas um resultado
            user = UserList.get(0);//pega o primeiro resultado da lista e adiciona no User para poder retorná-lo
            
            session.getTransaction().commit();
            
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
           
        } 
            return  user;
        
 }
    
    
}
