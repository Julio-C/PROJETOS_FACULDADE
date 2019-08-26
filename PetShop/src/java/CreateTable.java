
import com.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class CreateTable {
        public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();      
        Session session1 = session; 
        session1.close();         

    }
}
