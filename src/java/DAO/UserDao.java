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
    

    //Método para salvar usuário no banco de dados
    public void saveUser(UserBean user) {
        Session session = sf.openSession();
        try {
            
            session.beginTransaction();//inicia a transação
            session.merge(user);//recebe o usuario
            session.flush();
            session.getTransaction().commit();// executar inclusão do usuario no banco

            System.out.print("Salvou, Disgraaaaaça! Chupa, Renan!");
        } catch (HibernateException ex) {
            session.getTransaction().rollback();

        }
        session.close();//fecha sessão
    }

    //Método para deletar dados de usuários do banco de dados
    public void delete(UserBean user) {
         Session session = sf.openSession();
        try {
       
            int id = user.getIdUser();
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
            System.out.print("usuario "+ id+ " deletado");

        } catch (HibernateException ex) {
            session.getTransaction().rollback();
            System.out.print("Usuario nao pode ser deletado ou não existe");

        }
        session.close();
    }

    //Método para atualizar dados do Usuário
    public void update(UserBean user) {
        Session session = sf.openSession();
        try {
            session.beginTransaction();
            session.update(user);
            session.flush();
            session.getTransaction().commit();
            
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            System.out.print("Problemas ao realizar update");
        }
        session.close();
    }
    
    public UserBean searchById(int iduser) {
         Session session = sf.openSession();
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
            System.out.print("Transação não pode ser efetuada ou usuario não existe");
        } finally {
            session.close();
           
        } 
            return  user;
        
 }
    
    
}
