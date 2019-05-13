package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.adaming.entity.Tache;
import com.adaming.service.interfaces.ITacheService;

@Controller
public class TacheController {
	
	@Autowired
	ITacheService tacheserv;
	
	
	public List<Tache> findAll(){
		return null;
	}

}
