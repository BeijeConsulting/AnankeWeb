package it.beije.ananke.web;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


public class JPAManager {
	public ArrayList<Contatto> returnList(){
		EntityManager entityManager = JPASession.getEntityManager();

		String JPASelect = "SELECT c FROM Contatto as c";
		Query query = entityManager.createQuery(JPASelect);
		
		
		return (ArrayList<Contatto>) query.getResultList();
		
	}
	public void  addContatto(Contatto c){
		EntityManager entityManager = JPASession.getEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		System.out.println("inzio trans");
		Contatto z= c;
		entityManager.persist(z);
		entityTransaction.commit();
		System.out.println("comit");
		entityManager.close();
}
	public void stampaContatti() {
		EntityManager entityManager = JPASession.getEntityManager();

		String JPASelect = "SELECT c FROM Contatto as c";
		Query query = entityManager.createQuery(JPASelect);
		ArrayList<Contatto>c =(ArrayList<Contatto>) query.getResultList();
			for(Contatto z:c) {
				System.out.println(z.getId()+": "+z.getNome()+" "+z.getCognome()+" "+z.getEmail()+" "+z.getTel());
			}		
	}
	/*private boolean controlloIndice(int indice) {
		for(Contatto z:c)
			if(z.getId()==indice)
				return true;
		return false;
	}*/
	public void stampaLista(ArrayList<Contatto> d) {
		for(Contatto z:d) {
			System.out.println(z.getId()+": "+z.getNome()+" "+z.getCognome()+" "+z.getEmail()+" "+z.getTel());
		}
	}
	public void ricercaContatti() {
		Scanner s=new Scanner(System.in);
		 ArrayList<Contatto> trovati= new ArrayList<>();
		 EntityManager entityManager = JPASession.getEntityManager();
		 
			String query="";
			String nome,cognome,email,telefono;
			boolean stop=true;
		
			
			System.out.println("Seleziona 1 per effettuare la ricerca in base al nome");
			System.out.println("Seleziona 2 per effettuare la ricerca in base al nome e al cognome");
			System.out.println("Seleziona 3 per effettuare la ricerca in base all'email");
			System.out.println("Seleziona 4 per effettuare la ricerca in base al telefono");

			 String scelta=s.nextLine();
			switch(scelta) {
			case "1":
				do {
					System.out.println("digita il nome");
					nome=s.nextLine();
					
				}while(nome.length()==0);
				query="Select c from Contatto as c where name='"+nome+"'";
				break;
			case "2":
				do {
					System.out.println("digita il nome");
					nome=s.nextLine();
					System.out.println("digita il cognome");
					cognome=s.nextLine();
				}while(nome.length()==0||cognome.length()==0);
				query="Select c from Contatto as c where name='"+nome+"' and surname='"+cognome+"';";
				
				
				break;
			case "3":
				do {
					System.out.println("digita l'email");
					email=s.nextLine();
					
				}while(email.length()==0);
				query="Select c from Contatto as c where email='"+email+"' ;";
		
				break;
			case "4":
				do {
					
					System.out.println("digita il numero di telefono");
					telefono=s.nextLine();
					
				}while(telefono.length()==0);
				query="Select c from Contatto as C where telephone='"+telefono+"' ;";
				
				break;
			default: 
				System.out.println("Attenzio non avete selezionato nulla, ritorno al menu precedente..."); 
			break;
			}
			Query result = entityManager.createQuery(query);
			stampaLista((ArrayList<Contatto>)result.getResultList());
			entityManager.close();
	}
	public void removeContatto() {
		stampaContatti();
		 EntityManager entityManager = JPASession.getEntityManager();
			EntityTransaction transaction= entityManager.getTransaction();
		 transaction.begin();
		Scanner s= new Scanner(System.in);
		int indice=0;
		do {
		System.out.println("Indica l'indice di quale contatto vuoi andare a eliminare");
		 indice= Integer.parseInt(s.nextLine());
		if(entityManager.find(Contatto.class, indice)==null)
			System.out.println("Attenzione l'indice inserito non è valido...");

		}while(entityManager.find(Contatto.class, indice)==null);
		Contatto delete=entityManager.find(Contatto.class, indice);
		
	
		entityManager.remove(delete);
		transaction.commit();
		entityManager.close();
		
		
	}public ArrayList<Contatto> ricercaContatti(String nome, String cognome, String email, String telefono) {
		Scanner s=new Scanner(System.in);
		 ArrayList<Contatto> trovati= new ArrayList<>();
		 EntityManager entityManager = JPASession.getEntityManager();
		 	String query="Select c from Contatto as c where";

		
	
		
		
						if(nome.trim().length()>0)
				query+=" name='"+nome+"'";
			if(cognome.trim().length()>0)
				query+=" and surname='"+cognome+"'";
				if(email.trim().length()>0)
				query+=" and email='"+email+"' ";

					
				if(telefono.trim().length()>0)
				query+=" and telephone='"+telefono+"' ";
			
			
			Query result = entityManager.createQuery(query);
		
		return (ArrayList<Contatto>)result.getResultList();
			
	}
	public void removeID(int id) {
		
		 EntityManager entityManager = JPASession.getEntityManager();
			EntityTransaction transaction= entityManager.getTransaction();
		 transaction.begin();
		
		Contatto delete=entityManager.find(Contatto.class, id);
		entityManager.remove(delete);
		transaction.commit();
		entityManager.close();
		
	}
	public void modificaid(int id, String nome, String cognome, String email , String tel) {
		 EntityManager entityManager = JPASession.getEntityManager();

	
			
			Contatto c1=entityManager.find(Contatto.class, id);
	EntityTransaction entityTransaction= entityManager.getTransaction();
	entityTransaction.begin();

			
				if(nome.trim().length()>0) 
				c1.setNome(nome);
					
			
				if(cognome.trim().length()>0) 
					c1.setCognome(cognome);
					
				
				if(email.trim().length()>0) 
					c1.setEmail(email);
					
				
				if(tel.trim().length()>0) 
				c1.setTel(tel);
				
					if(!(nome.length()>0||cognome.length()>0||tel.length()>0||email.length()>0)) {
					
						entityTransaction.rollback();
						entityManager.close();
					}else {
						entityManager.persist(c1);
						entityTransaction.commit();
						entityManager.close();
					}
						
				
			
		}
		
	
	public void modificaContatto() {
		 EntityManager entityManager = JPASession.getEntityManager();
		stampaContatti();
		Scanner s= new Scanner(System.in);
		int indice=0;
		do {
		System.out.println("Indica l'indice di quale contatto vuoi andare a modificare");
		 indice= Integer.parseInt(s.nextLine());
		if(entityManager.find(Contatto.class, indice)==null)
			System.out.println("Attenzione l'indice inserito non è valido...");

		}while(entityManager.find(Contatto.class, indice)==null);
		
		Contatto c1=entityManager.find(Contatto.class, indice);
EntityTransaction entityTransaction= entityManager.getTransaction();
entityTransaction.begin();
			String nome,cognome,telefono,email;
			do {
			System.out.println("Inserisci il nome o premi invio per non inserirlo");
			 nome= s.nextLine();
			if(nome.length()>0) {
			c1.setNome(nome);
				
			}
			System.out.println("Inserisci il cognome o premi invio per non inserirlo");
			 cognome= s.nextLine();
			if(cognome.length()>0) {
				c1.setCognome(cognome);
				
			}
			System.out.println("Inserisci il email o premi invio per non inserirlo");
			 email= s.nextLine();
			if(email.length()>0) {
				c1.setEmail(email);
				
			}
			System.out.println("Inserisci il telefono o premi invio per non inserirlo");
			 telefono= s.nextLine();
			if(telefono.length()>0) {
			c1.setTel(telefono);
			}
				if(!(nome.length()>0||cognome.length()>0||telefono.length()>0||email.length()>0)) {
					System.out.println("Attenzione non hai inserito nessun campo");
					System.out.println("Digita 0 se vuoi ritornare al menu precedente senza effettuare modifiche");
					System.out.println("Altrimenti premi un tasto qualsisi escluso 0 per riprovare la modifica");
					String stop=s.nextLine();
					if(stop.equalsIgnoreCase("0")){
						break;
					}
				
				}else {
					entityManager.persist(c1);
					entityTransaction.commit();
					entityManager.close();
				}
					
			}while(!(nome.length()>0||cognome.length()>0||telefono.length()>0||email.length()>0));
		
	}
	
	public Contatto returnContatto(int id) {
		 EntityManager entityManager = JPASession.getEntityManager();		
		return entityManager.find(Contatto.class, id);
	
		
		
	}
}
