package it.beije.ananke.rubrica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HDBManager {
	Configuration configuration = new Configuration().configure()
			.addAnnotatedClass(Contatto.class);
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	
	public Session getSession() {	
		Session session = sessionFactory.openSession();
		return session;
	}
	
	public void aggiungiContattoHDB(Contatto contatto, Session session) {
		Transaction transaction = session.beginTransaction();
		
		Contatto newContatto = new Contatto();
		newContatto.setNome(contatto.getNome());
		newContatto.setCognome(contatto.getCognome());
		newContatto.setEmail(contatto.getEmail());
		newContatto.setTelefono(contatto.getTelefono());
		
		session.save(newContatto);
		transaction.commit();
		System.out.println("Contatto aggiunto");
			
	}

	public List<Contatto> ricercaContattoHDB(Contatto contatto, Session session) {
		
		System.out.println("Ricerca contatti");
		boolean controlloAnd = false;
		String ricerca = "SELECT c FROM Contatto as c WHERE ";
		
		if(!contatto.getNome().trim().equals("")) {
			ricerca += "nome ='" + contatto.getNome() + "'"; 
			controlloAnd = true;
		}
		
		if(!contatto.getCognome().trim().equals("")) {
			if(controlloAnd) {
				ricerca += " AND ";
			}
			ricerca += "cognome ='" + contatto.getCognome() + "'";
			controlloAnd = true;
		}
		
		if(!contatto.getEmail().trim().equals("")) {
			if(controlloAnd) {
				ricerca += " AND ";
			}
			ricerca += "email ='" + contatto.getEmail() + "'";
			controlloAnd = true;
		}
				
		if(!contatto.getTelefono().trim().equals("")) {
			if(controlloAnd) {
				ricerca += " AND ";
			}
			ricerca += "telefono ='" + contatto.getTelefono() + "'";
		}
				
		Query<Contatto> query = session.createQuery(ricerca);
		
		List<Contatto> contatti = query.list();
				
		for(Contatto c : contatti) {
			System.out.println(c.toString());
		}
		
		return contatti;
	}
	
	public void modificaContattoHDB(List<Contatto> contatti,Contatto contattoModificato, Session session) {
		Transaction transaction = session.beginTransaction();
		
		for(Contatto contatto: contatti) {
			if(!contattoModificato.getNome().equals("")) {
				contatto.setNome(contattoModificato.getNome());
			}
			if(!contattoModificato.getCognome().equals("")) {
				contatto.setCognome(contattoModificato.getCognome());
			}
			if(!contattoModificato.getEmail().equals("")) {
				contatto.setEmail(contattoModificato.getEmail());
			}
			if(!contattoModificato.getTelefono().equals("")) {
				contatto.setTelefono(contattoModificato.getTelefono());
			}
			session.save(contatto);
		}	
		transaction.commit();
		
		System.out.println("Contatti modificati");
	}
	
	public void eliminaContattoHDB(List<Contatto> contatti, Session session) {
		Transaction transaction = session.beginTransaction();
		for(Contatto contatto : contatti) {
			session.delete(contatto);
		}
		transaction.commit();
		System.out.println("Contatti eliminati");
	}
	
	public void importaHDB(List<Contatto> contatti, Session session) {
		for(Contatto contatto : contatti) {
			aggiungiContattoHDB(contatto, session);
		}
		System.out.println("Contatti importati");
	}
	
	public List<Contatto> esportaHDB(Session session) {
		String select = "SELECT c FROM contatto as c";
		Contatto contatto = null;
		List<Contatto> contatti = new ArrayList<Contatto>();
		
		Query<Contatto> query = session.createQuery(select);
		
		contatti = query.list();
		
		return contatti;
	}
}
