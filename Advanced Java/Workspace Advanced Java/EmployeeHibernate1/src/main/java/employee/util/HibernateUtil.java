package employee.util;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory sf ;
	
	static {
		Configuration config = new  Configuration();
		config.configure();
		
		sf = config.buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sf ;
	}
}
