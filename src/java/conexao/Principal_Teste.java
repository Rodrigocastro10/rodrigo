package conexao;

import BEAN.ServiceOfferBean;
import BEAN.UserBean;
import DAO.ServiceDao;
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
       // UserDao usuario = new UserDao();
        
        /*System.out.println("Iniciando...");
        UserBean user = new UserBean();
        user.setAge(100);
        user.setEmail("Sr incrivel@gmail.com");
        user.setName("hulk");
        user.setNick("C&B");
        user.setPassword("223s");
        user.setSkills("parangaricotirimirruarocompilador");
        usuario.saveUser(user);
        */
        ServiceDao serv= new ServiceDao();
        ServiceOfferBean offer= new ServiceOfferBean();
        /*offer.setIduser(3);
        offer.setDeadline(10);
        offer.setIduser(2);
        offer.setDescription("Consertar pc");
        offer.setName("jlll");
        offer.setSkillsrequired("ddddlise outros");
        serv.saveOffer(offer);*/
        
        offer=serv.searchByIdService(2);
        System.out.println("numero do serviço é "+offer.getIdservice()+" nome do serviço "+offer.getName());
        
          
        
       
        System.exit(0);
    }
    
}
