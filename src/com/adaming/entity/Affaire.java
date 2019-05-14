package com.adaming.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private String reference;
	private String titre;
	private String description;
	private int status;
	
	@OneToMany(mappedBy="affaire",fetch=FetchType.EAGER)
	private Set<Document> listDocument;
	
	@OneToMany(mappedBy="affaire",fetch=FetchType.EAGER)
	private Set<Tache> listTache;

	public Affaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Affaire(Long idAffaire, String reference, String titre, String description,int status) {
		super();
		this.idAffaire = idAffaire;
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.status=status;
	}

	public Affaire(String reference, String titre, String description,int status) {
		super();
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.status=status;
	}

	public Long getIdAffaire() {
		return idAffaire;
	}

	public void setIdAffaire(Long idAffaire) {
		this.idAffaire = idAffaire;
	}

	public String getreference() {
		return reference;
	}

	public void setreference(String reference) {
		this.reference = reference;
	}

	public String gettitre() {
		return titre;
	}

	public void settitre(String titre) {
		this.titre = titre;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
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
		return "Affaire [idAffaire=" + idAffaire + ", reference=" + reference + ", titre=" + titre + ", description=" + description + "]";
	}
	
	

}
