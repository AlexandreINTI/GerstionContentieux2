package com.adaming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.dao.impl.DaoGeneriqueImpl;
import com.adaming.utils.ServiceGenerique;

@Service
@Transactional
public class ServiceGeneriqueImpl<T> implements ServiceGenerique<T>{
	
	@Autowired
	@Qualifier("daogen")
	private DaoGeneriqueImpl<T> daogen;

	public void create(T o) {
		daogen.create(o);
		
	}

	public void delete(T o) {
		daogen.delete(o);
		
	}

	public void update(T o) {
		daogen.update(o);
		
	}

	public List<T> findAll(Class<T> o) {
		// TODO Auto-generated method stub
		return daogen.findAll(o);
	}

	public T getById(Class<T> o, Long id) {
		// TODO Auto-generated method stub
		return daogen.findOne(o, id);
	}

}
