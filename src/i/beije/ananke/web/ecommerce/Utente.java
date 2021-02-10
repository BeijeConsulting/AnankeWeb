package i.beije.ananke.web.ecommerce;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Table;



@Entity
@Table(name = "user")
public class Utente{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "first_name")
	private String nome;
	
	@Column(name = "second_name")
	private String cognome;
	
	@Column(name = "pasword")
	private String password;
	
	public static boolean registraNuovoUtente(String email, String nome, String cognome, String password) {

		EntityManager entityManager = JPAEntityManager.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Utente u = new Utente();
		u.setNome(nome);
		u.setCognome(cognome);
		u.setEmail(email);
		u.setPassword(password);
		
		entityManager.persist(u);
		entityTransaction.commit();
		
		return true;
		
	}
	
	@SuppressWarnings("unchecked")
	public static int login(String email, String password) {
		
		int id = 0;
		List<Utente> list = new ArrayList<>();
		List<Integer> listId = new ArrayList<>();
		EntityManager entityManager = JPAEntityManager.getEntityManager();
		
		String jpqlSelect = "SELECT u FROM Utente as u " + "WHERE email = " + "'" + email + "'";
		String jpqlSelectId = "SELECT id FROM Utente as u " + "WHERE email = " + "'" + email + "'";  
		
		Query query = entityManager.createQuery(jpqlSelect);
		Query query2 = entityManager.createQuery(jpqlSelectId);
		listId = query2.getResultList();
		list = query.getResultList();
		
		
		if(list != null) {
			if(list.get(0).getPassword().equals(password) == true) {
				id = listId.get(0);
				return id;
			}
		}
		
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	public static boolean cercaUtente(String email) {
		
		List<Utente> list = new ArrayList<>();
		EntityManager entityManager = JPAEntityManager.getEntityManager();
		String jpqlSelect = "SELECT u FROM Utente as u " + "WHERE email = " + "'" + email + "'";
				  
		
		Query query = entityManager.createQuery(jpqlSelect);
		list = query.getResultList();
		
		if(list.size() == 0) {
			System.out.println("UTENTE DA REGITSRARE");
			return false;
		}else {
			System.out.println("UTENTE GIA NEL DB");
			return true;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
