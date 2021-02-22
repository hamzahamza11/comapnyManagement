package com.example.company.entity;

 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import javax.persistence.CascadeType;








@Entity
@Table(name="dossier")
public class dossier {

	public dossier() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="titre")
	private String titre;
	
	@Column(name="type")
	private String type;
	
	@Column(name="nbrLigneProduit")
	private String nbrLigneProduit;
	
	@Column(name="nomFornisseur")
	private String nomFornisseur;
	
	@Column(name="numFacture")
	private int numFacture;
	
	@Column(name="devise")
	private String devise;
	
	@Column(name="intercom")
	private String intercom;
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private frais frais;
	
	
    
 
    
    
	
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNbrLigneProduit() {
		return nbrLigneProduit;
	}

	public void setNbrLigneProduit(String nbrLigneProduit) {
		this.nbrLigneProduit = nbrLigneProduit;
	}

	public String getNomFornisseur() {
		return nomFornisseur;
	}

	public void setNomFornisseur(String nomFornisseur) {
		this.nomFornisseur = nomFornisseur;
	}

	public int getNumFacture() {
		return numFacture;
	}

	public void setNumFacture(int numFacture) {
		this.numFacture = numFacture;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public String getIntercom() {
		return intercom;
	}

	public void setIntercom(String intercom) {
		this.intercom = intercom;
	}

	public frais getFrais() {
		return frais;
	}

	public void setFrais(frais frais) {
		this.frais = frais;
	}


	

}
