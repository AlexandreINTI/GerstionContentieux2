package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.entity.Utilisateur;
import com.adaming.service.interfaces.IUtilisateurHistoService;
import com.adaming.service.interfaces.IUtilisateurService;

@Controller
public class UtilisateurController {
	
	@Autowired
	IUtilisateurService utilisateurService;
	
	@Autowired
	IUtilisateurHistoService utilhistoserv;
	
	@RequestMapping(value="users", method=RequestMethod.GET)
	public List<Utilisateur> findAll(){
		return utilisateurService.findAll(Utilisateur.class);
	}
	
	@RequestMapping(value="users/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		Utilisateur u1 = new Utilisateur();
		u1=utilisateurService.getById(Utilisateur.class, id);
		utilhistoserv.create(u1);
		utilisateurService.delete(u1);
	}
	
	@RequestMapping(value="users", method=RequestMethod.POST)
	public Utilisateur save(@RequestBody Utilisateur utilisateur) {
		Utilisateur u1 = new Utilisateur();
		u1.setEmail(utilisateur.getEmail());
		u1.setNom(utilisateur.getNom());
		u1.setPassword(utilisateur.getPassword());
		u1.setPrenom(utilisateur.getPrenom());
		u1.setUsername(utilisateur.getUsername());
		utilisateurService.create(u1);
		return u1;
	}
	
	@RequestMapping(value="users/{id}", method=RequestMethod.PUT)
	public Utilisateur update(@PathVariable("id") Long id, Utilisateur utilisateur) {
		Utilisateur u1 = new Utilisateur();
		u1=utilisateurService.getById(Utilisateur.class, id);
		u1.setEmail(utilisateur.getEmail());
		u1.setNom(utilisateur.getNom());
		u1.setPassword(utilisateur.getPassword());
		u1.setPrenom(utilisateur.getPrenom());
		u1.setUsername(utilisateur.getUsername());
		utilisateurService.update(u1);
		return u1;
	}
	
	public Utilisateur getById(@PathVariable("id") Long id) {
		return utilisateurService.getById(Utilisateur.class, id);
	}
	

}
