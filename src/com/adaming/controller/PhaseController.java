package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entity.Phase;
import com.adaming.service.interfaces.IPhaseService;

@RestController
public class PhaseController {

	@Autowired
	IPhaseService phaseService;
	
	@RequestMapping(value="phases", method=RequestMethod.GET)
	public List<Phase> findAll(){
		return phaseService.findAll(Phase.class);
	}
	
	@RequestMapping(value="phases/{id}", method=RequestMethod.GET)
	public Phase getById(@PathVariable("id") Long id) {
		return phaseService.getById(Phase.class, id);
	}
	
	@RequestMapping(value="phases", method=RequestMethod.POST)
	public Phase save(@RequestBody Phase phase) {
		Phase p1 = new Phase();
		p1.setDateDebut(phase.getDateDebut());
		p1.setDateFin(phase.getDateFin());
		p1.setNom(phase.getNom());
		phaseService.create(p1);
		return p1;
	}
	
	@RequestMapping(value="phases/{id}", method=RequestMethod.PUT)
	public Phase update(@PathVariable("id") Long id, @RequestBody Phase phase) {
		Phase p1 = new Phase();
		p1=phaseService.getById(Phase.class, id);
		p1.setDateDebut(phase.getDateDebut());
		p1.setDateFin(phase.getDateFin());
		p1.setNom(phase.getNom());
		phaseService.update(p1);
		return p1;
	}
}
