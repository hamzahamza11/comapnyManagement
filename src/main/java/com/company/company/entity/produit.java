package com.company.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="qte")
	private String qte;
	
	@Column(name="prud")
	private float prud;
	
	@Column(name="prudh")
	private float prudh;
	
	@Column(name="dossierId")
	private String dossierId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQte() {
		return qte;
	}

	public void setQte(String qte) {
		this.qte = qte;
	}

	public float getPrud() {
		return prud;
	}

	public void setPrud(float prud) {
		this.prud = prud;
	}

	public float getPrudh() {
		return prudh;
	}

	public void setPrudh(float prudh) {
		this.prudh = prudh;
	}

	public String getDossierId() {
		return dossierId;
	}

	public void setDossierId(String dossierId) {
		this.dossierId = dossierId;
	}
	
	

}
