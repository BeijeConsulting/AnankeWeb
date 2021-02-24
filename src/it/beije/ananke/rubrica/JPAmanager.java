package it.beije.ananke.rubrica;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;

public class JPAmanager {
	EntityManager entityManager = RubricaEntityManager.getEntityManager();
	
	public void aggiungiContattoJPA(Contatto contatto) {
		//apro transazione
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();		
		entityManager.persist(contatto);		
		entityTransaction.commit();
			
	}
	
	public List<Contatto> leggiDB(){
		String ricerca = "SELECT c FROM Contatto as c";
		Query query = entityManager.createQuery(ricerca);
		List<Contatto> contatti = query.getResultList();
		return contatti;
	}
	
	public void eliminaContattoJPA(int id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.find(Contatto.class, id);
		entityManager.remove(entityManager.find(Contatto.class, id));
		entityTransaction.commit();
	}
	
	public Contatto ricercaContattoJPA(int id) {
		return entityManager.find(Contatto.class, id);		 
	}
	
	public List<Contatto> ricercaContattoJPA(Contatto contatto) {
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
				
		Query query = entityManager.createQuery(ricerca);
		List<Contatto> contatti = query.getResultList();
				
		for(Contatto c : contatti) {
			System.out.println(c.toString());
		}
		
		return contatti;
	}

	public void modificaContattoJPA(int id, Contatto contattoModificato) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Contatto contatto = new Contatto();
		contatto = entityManager.find(Contatto.class, id);
		contatto.setNome(contattoModificato.getNome());
		contatto.setCognome(contattoModificato.getCognome());
		contatto.setEmail(contattoModificato.getEmail());
		contatto.setTelefono(contattoModificato.getTelefono());
		entityManager.persist(contatto);
		entityTransaction.commit();
	}
	
	public void modificaContattoJPA(List<Contatto> contatti,Contatto contattoModificato) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
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
			entityManager.persist(contatto);
		}	
		entityTransaction.commit();
		System.out.println("Contatti modificati");
	}
	
	public void eliminaContattoJPA(List<Contatto> contatti) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		for(Contatto contatto : contatti) {
			entityManager.remove(contatto);
		}
		entityTransaction.commit();
		System.out.println("Contatti eliminati");
	}
	
	public void importaJPA(List<Contatto> contatti) {
		for(Contatto contatto : contatti) {
			aggiungiContattoJPA(contatto);
		}
		System.out.println("Contatti importati");
	}
	
	public List<Contatto> esportaJPA() {
		String select = "SELECT c FROM contatto as c";
		Contatto contatto = null;
		List<Contatto> contatti = new ArrayList<Contatto>();
		
		Query query = entityManager.createQuery(select);
		contatti = query.getResultList();
		
		return contatti;
	}
}