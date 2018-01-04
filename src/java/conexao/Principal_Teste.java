package conexao;

import BEAN.UserBean;
import DAO.UserDao;


//import org.hibernate.Session;
//import org.hibernate.SessionFactory;


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
       /* UserBean user = new UserBean();
        user.setAge(100);
        user.setEmail("ana@gmail.com");
        user.setName("juba Rodrigues");
        user.setNick("Maaaafffni");
        user.setPassword("12345678zz9");
        user.setSkils("parangaricotirimirruarocompilador");*/
      
        UserDao usuario = new UserDao();
        //usuario.saveUser(user);
        UserBean user= usuario.searchById(3);
        System.out.print(user.getName()+user.getIdUser()+ user.getEmail());
        //usuario.delete(user);
        /**
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.close();
        
        System.out.print("Salvou, Disgraaaaaça! Chupa, Renan!");

        System.out.println("Finalizando...");
        **/
    }
    
}
