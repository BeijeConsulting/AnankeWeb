package it.beije.ananke.web.rubrica;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager {
	
	private static Configuration configuration;
	private static SessionFactory sessionFactory;
	private static Session session;
	
	public static Session apriSessione() {
		
		configuration = new Configuration().configure().addAnnotatedClass(Contatto.class);
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		
		return session;
		
	}
	
	public static void chiudiSessione() {
		session.close();
		sessionFactory.close();
	}

}