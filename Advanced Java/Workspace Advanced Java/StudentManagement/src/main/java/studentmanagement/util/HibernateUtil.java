package studentmanagement.util;





import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import studentmanagement.model.Address;
import studentmanagement.model.Batch;
import studentmanagement.model.Student;



public class HibernateUtil {
	static SessionFactory sf ;
	
	static {
		Properties properties = new Properties();

		InputStream inputStream =
		        HibernateUtil.class
		                .getClassLoader()
		                .getResourceAsStream("config.properties");

		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Configuration config = new Configuration();
		config.addProperties(properties);
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Address.class);
		config.addAnnotatedClass(Batch.class);
		
		sf = config.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sf ;
	}
}
