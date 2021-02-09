package it.beije.ananke.commerce;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_item")
public class OrderItemBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="product_id")
	private int productId;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="amount")
	private double amount;

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public int getOrderId() {
		return orderId;
	}

	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	
	public int getProductId() {
		return productId;
	}

	
	public void setProductId(int productId) {
		this.productId = productId;
	}

	
	public int getQuantity() {
		return quantity;
	}

	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public double getAmount() {
		return amount;
	}

	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
