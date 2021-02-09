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

import it.beije.ananke.web.rubrica.Contatto;
import it.beije.ananke.web.rubrica.JPAEntityManager;

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
	
	@Column(name = "password")
	private String password;
	
	public static boolean registraNuovoUtente(String email, String nome, String cognome, String password) {
		
		
		EntityManager entityManager = JPAEntityManager.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Utente u = new Utente();
		
		
		entityManager.persist(u);
		entityTransaction.commit();
		
		return true;
		
	}
	
	public static boolean cercaUtente(String email) {
		
		List<Contatto> list = new ArrayList<>();
		EntityManager entityManager = JPAEntityManager.getEntityManager();
		
		String jpqlSelect = "SELECT u FROM Utente as u " + "WHERE email = " + "'" + email + "'";
				  
		
		Query query = entityManager.createQuery(jpqlSelect);
		list = query.getResultList();
		
		if(list != null)
			return true;
		else
			return false;
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
