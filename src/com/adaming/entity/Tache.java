package com.adaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Tache implements Serializable{

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
	@OneToMany(mappedBy="tache",fetch=FetchType.EAGER)
	private List<Phase> listphase=new ArrayList<Phase>();
	@ManyToOne
	private Affaire affaire;
	@ManyToOne
	private Tribunal tribunal;
	@OneToOne
	private TacheHisto tacheHisto;
	
	public Tache() {
		super();
	}

	public Tache(Long idTache, Date dateCreation, String titre, String description, boolean statusAudience,
			List<Phase> listphase, Affaire affaire, Tribunal tribunal) {
		super();
		this.idTache = idTache;
		this.dateCreation = dateCreation;
		this.titre = titre;
		this.description = description;
		this.statusAudience = statusAudience;
		this.listphase = listphase;
		this.affaire = affaire;
		this.tribunal = tribunal;
	}

	public Tache(Date dateCreation, String titre, String description, boolean statusAudience, List<Phase> listphase,
			Affaire affaire, Tribunal tribunal) {
		super();
		this.dateCreation = dateCreation;
		this.titre = titre;
		this.description = description;
		this.statusAudience = statusAudience;
		this.listphase = listphase;
		this.affaire = affaire;
		this.tribunal = tribunal;
	}

	public Tache(Date dateCreation, String titre, String description, boolean statusAudience) {
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

	public List<Phase> getListphase() {
		return listphase;
	}

	public void setListphase(List<Phase> listphase) {
		this.listphase = listphase;
	}

	public Affaire getAffaire() {
		return affaire;
	}

	public void setAffaire(Affaire affaire) {
		this.affaire = affaire;
	}

	public Tribunal getTribunal() {
		return tribunal;
	}

	public void setTribunal(Tribunal tribunal) {
		this.tribunal = tribunal;
	}

	@Override
	public String toString() {
		return "Tache [idTache=" + idTache + ", dateCreation=" + dateCreation + ", titre=" + titre + ", description="
				+ description + ", statusAudience=" + statusAudience + "]";
	}
	
	
	

}
