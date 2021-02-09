package it.beije.ananke.web;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import it.beije.ananke.rubrica.ContattoMio;

public class Operazioni {

	public List<ContattoMio> lettura(EntityManager em){
		List<ContattoMio> contatti = new ArrayList<>();
		String jqlSelect = "SELECT c FROM ContattoMio as c";
		Query query = em.createQuery(jqlSelect);
		contatti = query.getResultList();
		return contatti;
	}
	
	
	
}
