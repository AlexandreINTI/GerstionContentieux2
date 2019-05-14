package com.adaming.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AffaireHisto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAffaire;
	private String reference;
	private String titre;
	private String description;
	private int status;

	public AffaireHisto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AffaireHisto(Long idAffaire, String reference, String titre, String description, int status) {
		super();
		this.idAffaire = idAffaire;
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.status = status;
	}

	public AffaireHisto(String reference, String titre, String description, int status) {
		super();
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.status = status;
	}

	public Long getIdAffaire() {
		return idAffaire;
	}

	public void setIdAffaire(Long idAffaire) {
		this.idAffaire = idAffaire;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AffaireHisto [idAffaire=" + idAffaire + ", reference=" + reference + ", titre=" + titre
				+ ", description=" + description + ", status=" + status + "]";
	}

}
