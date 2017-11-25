package conexao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author Rodrigo
 */
public class Principal_Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando...");
    
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.close();
        
        System.out.print("Salvou, Disgraaaaaça! Chupa, Renan!");

        System.out.println("Finalizando...");
    }
    
}
