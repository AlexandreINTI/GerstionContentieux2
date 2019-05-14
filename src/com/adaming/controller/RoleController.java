package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.entity.Role;
import com.adaming.service.interfaces.IRoleService;

@Controller
public class RoleController {

	@Autowired
	IRoleService roleService;
	
	@RequestMapping(value="roles", method=RequestMethod.GET)
	public List<Role> findAll(){
		return roleService.findAll(Role.class);
	}
	
	@RequestMapping(value= "roles/{id}", method=RequestMethod.GET)
	public Role getById(@PathVariable("id") Long id) {
		return roleService.getById(Role.class, id);
	}
	
	@RequestMapping(value="roles", method=RequestMethod.POST)
	public Role save(@RequestBody Role role) {
		Role r1 = new Role();
		r1.setLibelle(role.getLibelle());
		roleService.create(r1);
		return r1;
	}
	
	@RequestMapping(value="roles/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		Role r1 = new Role ();
		r1=roleService.getById(Role.class, id);
		roleService.delete(r1);
	}
	
	@RequestMapping(value="roles/{id}", method=RequestMethod.PUT)
	public Role update(@PathVariable("id") Long id, Role role) {
		Role r1 = new Role();
		r1=roleService.getById(Role.class, id);
		r1.setLibelle(role.getLibelle());
		roleService.update(r1);
		return r1;
	}
}
