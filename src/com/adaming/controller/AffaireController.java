package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entity.Affaire;
import com.adaming.entity.AffaireHisto;
import com.adaming.service.interfaces.IAffaireHistoService;
import com.adaming.service.interfaces.IAffaireService;

@RestController
public class AffaireController {
	
	@Autowired
	IAffaireService affserv;
	
	@Autowired
	IAffaireHistoService affhistserv;
	
	@RequestMapping(value="affaires",method=RequestMethod.GET)
	public List<Affaire> findAll(){
		return affserv.findAll(Affaire.class);
	}
	
	@RequestMapping(value="affaires/{id}", method=RequestMethod.GET)
	public Affaire findOne(@PathVariable("id")Long id) {
		return affserv.getById(Affaire.class, id);
	}
	
	@RequestMapping(value="affaires/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id")Long id) {
		Affaire a1=new Affaire();
		a1=affserv.getById(Affaire.class, id);
		AffaireHisto a2 = new AffaireHisto();
		a2.setDescription(a1.getdescription());
		a2.setIdAffaire(a1.getIdAffaire());
		a2.setReference(a1.getreference());
		a2.setStatus(a1.getStatus());
		a2.setTitre(a1.gettitre());
		affhistserv.create(a2);
		affserv.delete(a1);
	}
	
	@RequestMapping(value="affaires",method=RequestMethod.POST)
	public Affaire save(@RequestBody Affaire affaire) {
		Affaire a1=new Affaire();
		a1.setdescription(affaire.getdescription());
		a1.setreference(affaire.getreference());
		a1.settitre(affaire.gettitre());
		a1.setStatus(affaire.getStatus());
		affserv.create(a1);
		return a1;
	}
	
	@RequestMapping(value="Affaires/{id}",method=RequestMethod.PUT)
	public Affaire update(@PathVariable("id")Long id,@RequestBody Affaire affaire) {
		Affaire a1=new Affaire();
		a1=affserv.getById(Affaire.class, id);
		a1.setdescription(affaire.getdescription());
		a1.setreference(affaire.getreference());
		a1.settitre(affaire.gettitre());
		a1.setStatus(affaire.getStatus());
		affserv.update(a1);
		return a1;
	}

}
