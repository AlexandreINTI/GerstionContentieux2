package com.adaming.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Utilisateur implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String email;
	private String prenom;
	private String nom;
	@Column(unique=true)
	private String username;
	private String password;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="Utilisateur_Tache",
			joinColumns= {@JoinColumn(name="idUtilisateur",referencedColumnName="idUtilisateur")},
				inverseJoinColumns= {@JoinColumn(name="IdTache",table="tache",referencedColumnName="idTache")})
	private Set<Tache> listtache=new HashSet<Tache>();
	@ManyToMany
	@JoinTable(name="Utilisateur_Role",
			joinColumns= {@JoinColumn(name="idUtilisateur",referencedColumnName="idUtilisateur")},
				inverseJoinColumns= {@JoinColumn(name="idRole",table="role",referencedColumnName="idRole")})
	private Set<Role> listrole=new HashSet<Role>();
	
	@OneToOne
	private UtilisateurHisto utilisateurHisto;

	public Utilisateur() {
		super();
	}

	public Utilisateur(Long idUtilisateur, String email, String prenom, String nom, Set<Tache> listtache) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.prenom = prenom;
		this.nom = nom;
		this.listtache = listtache;
	}

	public Utilisateur(Long idUtilisateur, String email, String prenom, String nom, Set<Tache> listtache,
			Set<Role> listrole) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.prenom = prenom;
		this.nom = nom;
		this.listtache = listtache;
		this.listrole = listrole;
	}

	public Utilisateur(String email, String prenom, String nom, Set<Tache> listtache) {
		super();
		this.email = email;
		this.prenom = prenom;
		this.nom = nom;
		this.listtache = listtache;
	}

	public Utilisateur(String email, String prenom, String nom) {
		super();
		this.email = email;
		this.prenom = prenom;
		this.nom = nom;
	}

	public Utilisateur(Long idUtilisateur, String email, String prenom, String nom, String username, String password,
			Set<Tache> listtache, Set<Role> listrole) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.prenom = prenom;
		this.nom = nom;
		this.username = username;
		this.password = password;
		this.listtache = listtache;
		this.listrole = listrole;
	}

	public Utilisateur(String email, String prenom, String nom, String username, String password) {
		super();
		this.email = email;
		this.prenom = prenom;
		this.nom = nom;
		this.username = username;
		this.password = password;
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

	public Set<Tache> getListtache() {
		return listtache;
	}

	public void setListtache(Set<Tache> listtache) {
		this.listtache = listtache;
	}

	public Set<Role> getListrole() {
		return listrole;
	}

	public void setListrole(Set<Role> listrole) {
		this.listrole = listrole;
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
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", email=" + email + ", prenom=" + prenom + ", nom="
				+ nom + ", username=" + username + ", password=" + password + "]";
	}
	

}
