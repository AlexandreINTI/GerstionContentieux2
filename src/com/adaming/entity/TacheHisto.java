package com.adaming.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TacheHisto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long idTache;
	private Date dateCreation;
	private String titre;
	private String description;
	private boolean statusAudience;

	public TacheHisto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TacheHisto(Long idTache, Date dateCreation, String titre, String description, boolean statusAudience) {
		super();
		this.idTache = idTache;
		this.dateCreation = dateCreation;
		this.titre = titre;
		this.description = description;
		this.statusAudience = statusAudience;
	}

	public TacheHisto(Date dateCreation, String titre, String description, boolean statusAudience) {
		super();
		this.dateCreation = dateCreation;
		this.titre = titre;
		this.description = description;
		this.statusAudience = statusAudience;
	}

	public Long getIdTache() {
		return idTache;
	}

	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
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

	public boolean isStatusAudience() {
		return statusAudience;
	}

	public void setStatusAudience(boolean statusAudience) {
		this.statusAudience = statusAudience;
	}

	@Override
	public String toString() {
		return "TacheHisto [idTache=" + idTache + ", dateCreation=" + dateCreation + ", titre=" + titre
				+ ", description=" + description + ", statusAudience=" + statusAudience + "]";
	}

}
