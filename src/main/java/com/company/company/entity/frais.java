package com.company.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="frais")
public class frais {

	public frais() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="interetBank")
	private float interetBank;
	
	@Column(name="fraisTransite")
	private float fraisTransite;
	
	@Column(name="droitdouanes")
	private float droitDouanes;
	
	@Column(name="transport")
	private float transport;
	
	@Column(name="assurances")
	private float assurances;
	
	@Column(name="autre")
	private float autre;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getInteretBank() {
		return interetBank;
	}

	public void setInteretBank(float interetBank) {
		this.interetBank = interetBank;
	}

	public float getFraisTransite() {
		return fraisTransite;
	}

	public void setFraisTransite(float fraisTransite) {
		this.fraisTransite = fraisTransite;
	}

	public float getDroitDouanes() {
		return droitDouanes;
	}

	public void setDroitDouanes(float droitDouanes) {
		this.droitDouanes = droitDouanes;
	}

	public float getTransport() {
		return transport;
	}

	public void setTransport(float transport) {
		this.transport = transport;
	}

	public float getAssurances() {
		return assurances;
	}

	public void setAssurances(float assurances) {
		this.assurances = assurances;
	}

	public float getAutre() {
		return autre;
	}

	public void setAutre(float autre) {
		this.autre = autre;
	}
	
	
	
}
