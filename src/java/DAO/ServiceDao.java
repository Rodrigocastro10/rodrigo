/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.ServiceOfferBean;
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
public class ServiceDao {
     SessionFactory sf = HibernateUtil.getSessionFactory();
     
     public void saveOffer(ServiceOfferBean offer) {
        Session session = sf.openSession();
        try {
            
            session.beginTransaction();//inicia a transação
            session.merge(offer);//recebe o usuario
            session.flush();
            session.getTransaction().commit();// executar inclusão do usuario no banco

            System.out.print("Salvou oferta, Disgraaaaaça! Chupa, Renan!");
        } catch (HibernateException ex) {
            session.getTransaction().rollback();
            System.out.print("Oferta não pode ser salva");

        }
        session.close();//fecha sessão
    }
     
     public ServiceOfferBean searchByIdService(int idservice) {
         Session session = sf.openSession();
        ServiceOfferBean offer = new ServiceOfferBean();
       try {   
            
            session.beginTransaction();//inicia a transação
            String hql = "from ServiceOfferBean where idservice like "+idservice;//cria uma string contendo o HQL que será interpretado em SQL
            Query query = session.createQuery(hql);//cria a seção da Query utilizando o HQL como parâmetro
            List <ServiceOfferBean> serviceList = query.list();//cria a lista de resultados para receber a consulta da query
          
            query.setMaxResults(1);//informa para a query que será necessário apenas um resultado
            offer = serviceList.get(0);//pega o primeiro resultado da lista e adiciona no User para poder retorná-lo
            
            session.getTransaction().commit();
            
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.print("Transação não pode ser efetuada ou usuario não existe");
        } finally {
            session.close();
           
        } 
            return  offer;
     
     
     }
    
}
