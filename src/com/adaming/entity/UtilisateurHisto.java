package com.adaming.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UtilisateurHisto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String email;
	private String prenom;
	private String nom;
	@Column(unique = true)
	private String username;
	private String password;

	public UtilisateurHisto(Long idUtilisateur, String email, String prenom, String nom, String username,
			String password) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.prenom = prenom;
		this.nom = nom;
		this.username = username;
		this.password = password;
	}

	public UtilisateurHisto(String email, String prenom, String nom, String username, String password) {
		super();
		this.email = email;
		this.prenom = prenom;
		this.nom = nom;
		this.username = username;
		this.password = password;
	}

	public UtilisateurHisto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UtilisateurHisto [idUtilisateur=" + idUtilisateur + ", email=" + email + ", prenom=" + prenom + ", nom="
				+ nom + ", username=" + username + ", password=" + password + "]";
	}

}
