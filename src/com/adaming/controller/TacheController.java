package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entity.Tache;
import com.adaming.entity.TacheHisto;
import com.adaming.service.interfaces.ITacheHistoService;
import com.adaming.service.interfaces.ITacheService;

@RestController
public class TacheController {
	
	@Autowired
	ITacheService tacheserv;
	
	@Autowired
	ITacheHistoService tachehistserv;
	
	@RequestMapping(value="taches",method=RequestMethod.GET)
	public List<Tache> findAll(){
		return tacheserv.findAll(Tache.class);
	}
	
	@RequestMapping(value="taches/{id}",method=RequestMethod.GET)
	public Tache findOne(@PathVariable("id")Long id) {
		return tacheserv.getById(Tache.class, id);
	}
	
	@RequestMapping(value="taches/{id}",method=RequestMethod.POST)
	public Tache save(@RequestBody Tache tache) {
		Tache t1=new Tache();
		t1.setTitre(tache.getTitre());
		t1.setDateCreation(tache.getDateCreation());
		t1.setDescription(tache.getDescription());
		t1.setStatusAudience(tache.isStatusAudience());
		tacheserv.create(t1);
		return t1;
	}
	
	@RequestMapping(value="taches{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id")Long id) {
		Tache t1=new Tache();
		t1=tacheserv.getById(Tache.class, id);
		TacheHisto t2 = new TacheHisto();
		t2.setDateCreation(t1.getDateCreation());
		t2.setDescription(t1.getDescription());
		t2.setIdTache(t1.getIdTache());
		t2.setStatusAudience(t1.isStatusAudience());
		t2.setTitre(t1.getTitre());
		tachehistserv.create(t2);
		tacheserv.delete(t1);
	}
	
	@RequestMapping(value="taches/{id}", method=RequestMethod.PUT)
	public Tache update(@PathVariable("id")Long id,@RequestBody Tache tache) {
		Tache t1=tacheserv.getById(Tache.class, id);
		t1.setDateCreation(tache.getDateCreation());
		t1.setDescription(tache.getDescription());
		t1.setStatusAudience(tache.isStatusAudience());
		t1.setTitre(tache.getTitre());
		tacheserv.update(t1);
		return t1;
	}

}
