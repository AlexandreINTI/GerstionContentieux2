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
public class Tribunal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTribunal;
	private String adresse;
	private String fax;
	private String tel;
	private String region;

	@OneToMany(mappedBy = "tribunal",fetch=FetchType.EAGER)
	private Set<Tache> ListTache;

	public Tribunal(Long idTribunal, String adresse, String fax, String tel, String region) {
		super();
		this.idTribunal = idTribunal;
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
	}

	public Tribunal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tribunal(String adresse, String fax, String tel, String region) {
		super();
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
	}

	public Long getIdTribunal() {
		return idTribunal;
	}

	public void setIdTribunal(Long idTribunal) {
		this.idTribunal = idTribunal;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set<Tache> getListTache() {
		return ListTache;
	}

	public void setListTache(Set<Tache> listTache) {
		ListTache = listTache;
	}

	@Override
	public String toString() {
		return "Tribunal [idTribunal=" + idTribunal + ", adresse=" + adresse + ", fax=" + fax + ", tel=" + tel
				+ ", region=" + region + ", ListTache=" + ListTache + "]";
	}

}
