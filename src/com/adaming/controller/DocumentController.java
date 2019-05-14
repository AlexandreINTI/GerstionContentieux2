package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entity.Document;
import com.adaming.service.interfaces.IDocumentService;

@RestController
public class DocumentController {
	
	@Autowired
	IDocumentService docserv;
	
	@RequestMapping(value="documents",method=RequestMethod.GET)
	public List<Document> findAll(){
		return docserv.findAll(Document.class);
	}
	
	@RequestMapping(value="documents/{id}",method=RequestMethod.GET)
	public Document findOne(@PathVariable("id")Long id) {
		return docserv.getById(Document.class, id);
	}
	
	@RequestMapping(value="documents", method=RequestMethod.POST)
	public Document save(@RequestBody Document document) {
		Document d1=new Document();
		d1.setDateCreation(document.getDateCreation());
		d1.setDescription(document.getDescription());
		d1.setNom(document.getNom());
		docserv.create(d1);
		return d1;
	}
	
	@RequestMapping(value="documents/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id")Long id) {
		Document d1=new Document();
		d1=docserv.getById(Document.class, id);
		docserv.delete(d1);
	}
	
	@RequestMapping
	public Document update(@PathVariable("id")Long id,@RequestBody Document document) {
		Document d1=new Document();
		d1=docserv.getById(Document.class, id);
		d1.setDateCreation(document.getDateCreation());
		d1.setDescription(document.getDescription());
		d1.setNom(document.getNom());
		docserv.update(d1);
		return d1;
	}
	
	
	

}
