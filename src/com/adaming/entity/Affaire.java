package com.adaming.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Affaire implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAffaire;
	private String email;
	private String nom;
	private String prenom;
	private int status;
	
	@OneToMany(mappedBy="affaire")
	private Set<Document> listDocument;
	
	@OneToMany(mappedBy="affaire")
	private Set<Tache> listTache;

	public Affaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Affaire(Long idAffaire, String email, String nom, String prenom,int status) {
		super();
		this.idAffaire = idAffaire;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.status=status;
	}

	public Affaire(String email, String nom, String prenom,int status) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.status=status;
	}

	public Long getIdAffaire() {
		return idAffaire;
	}

	public void setIdAffaire(Long idAffaire) {
		this.idAffaire = idAffaire;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Set<Document> getListDocument() {
		return listDocument;
	}

	public void setListDocument(Set<Document> listDocument) {
		this.listDocument = listDocument;
	}
	

	public Set<Tache> getListTache() {
		return listTache;
	}

	public void setListTache(Set<Tache> listTache) {
		this.listTache = listTache;
	}

	@Override
	public String toString() {
		return "Affaire [idAffaire=" + idAffaire + ", email=" + email + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
