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
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Carrello {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_user")
	private int idUtente;
	
	@Column(name="id_prod")
	private int idProdotto;
	
	@Column(name="qta")
	private int qta;
	
	
	public static void aggiungiProdCarrello(int idUtente, int idProdotto, List<Integer> qta) {
		
		EntityManager entityManager = JPAEntityManager.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		List<Prodotto> listP = new ArrayList<>();
		listP = DbManager.getProdotti();
		int i = 0;
		
		for(Prodotto p : listP) {
			
			Carrello c = new Carrello();
			c.setIdProdotto(idProdotto);
			c.setIdUtente(idUtente);
			c.setQta(qta.get(i));
			entityManager.persist(c);
			entityTransaction.commit();
			i++;
			
		}
		
		
	}
	

	
	public static void rimuoviProdCarrello() {
		
		
		
	}
	
	

	public int getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public int getQta() {
		return qta;
	}

	public void setQta(int qta) {
		this.qta = qta;
	}
	
	
	
}



