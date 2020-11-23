package com.kyle.pizzalist.subscriber;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class PizzaList {

	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private String pizzaChoice;
	
	@Column
	
	@CreationTimestamp
	private Date signedUp;
	
	public PizzaList() {
		
	}
	
	public PizzaList(String name, String email, String pizzaChoice, Date signedUp) {
		this.name = name;
		this.email = email;
		this.pizzaChoice = pizzaChoice;
		this.signedUp = signedUp;
	}

	public Date getSignedUp() {
		return signedUp;
	}

	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPizzaChoice() {
		return pizzaChoice;
	}

	public void setPizzaChoice(String pizzaChoice) {
		this.pizzaChoice = pizzaChoice;
	}

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", name=" + name + ", email=" + email
				+ ", pizzaChoice=" + pizzaChoice + ", signedUp=" + signedUp + "]";
	}
	
	
}