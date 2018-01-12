/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import BEAN.MessageBean;
import conexao.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author Diego Peres
 */
public class MessageDao {
    //Abertura se sessão Hibernate
    SessionFactory sf = HibernateUtil.getSessionFactory();
    
    //metodo para salvar a mensagem no banco de dados
    public void saveMessage(MessageBean message){
    Session session = sf.openSession();
         
        try{
            session.beginTransaction();//inicia a transação com o banco de dados
            session.merge(message);//mescla a mensagem
            session.flush();
            session.getTransaction().commit();// executar inclusão da mensagem no banco
            System.out.print("A mensagem está pronta para ser salva.");
 
        } catch (HibernateException ex) {
            session.getTransaction().rollback();
        }
        session.close();//fecha sessão
    }
    //metodo para deletar mensagens de usuarios do banco de dados
    public void delet(MessageBean message){
            Session session = sf.openSession();
        try {
            int id = message.getiDMessage();
            session.beginTransaction();
            session.delete(message);
        } catch (HibernateException ex){
            session.getTransaction().rollback();
        }
        session.close();
    }
   
    
    
   
}
