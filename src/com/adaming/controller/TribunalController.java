package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entity.Tribunal;
import com.adaming.service.interfaces.ITribunalService;

@RestController
public class TribunalController {

	@Autowired
	ITribunalService tribunalService;
	
	@RequestMapping(value="tribunals", method=RequestMethod.GET)
	public List<Tribunal> findAll(){
		return tribunalService.findAll(Tribunal.class);
	}
	
	@RequestMapping(value="tribunals/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		Tribunal t1 = new Tribunal();
		tribunalService.delete(t1);
	}
	
	@RequestMapping(value="tribunals", method=RequestMethod.POST)
	public Tribunal save(@RequestBody Tribunal tribunal) {
		Tribunal t1= new Tribunal();
		t1.setAdresse(tribunal.getAdresse());
		t1.setFax(tribunal.getFax());
		t1.setRegion(tribunal.getRegion());
		t1.setTel(tribunal.getTel());
		tribunalService.create(t1);
		return t1;
	}
	
	@RequestMapping(value="tribunals/{id}", method=RequestMethod.PUT)
	public Tribunal update(@PathVariable("id") Long id, Tribunal tribunal) {
		Tribunal t1= new Tribunal();
		t1=tribunalService.getById(Tribunal.class, id);
		t1.setAdresse(tribunal.getAdresse());
		t1.setFax(tribunal.getFax());
		t1.setRegion(tribunal.getRegion());
		t1.setTel(tribunal.getTel());
		tribunalService.update(t1);
		return t1;
	}
	
	@RequestMapping(value="tribunals/{id}", method=RequestMethod.GET)
	public Tribunal getById(@PathVariable("id") Long id) {
		return tribunalService.getById(Tribunal.class, id);
	}
}
