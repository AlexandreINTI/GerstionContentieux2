package com.adaming.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.utils.DaoGenerique;

@Repository("daogen")
public class DaoGeneriqueImpl<T> implements DaoGenerique<T>{
	
	@Autowired
	private SessionFactory sessionfactory;

	public void create(T o) {
		// TODO Auto-generated method stub
		Session session =this.sessionfactory.getCurrentSession();
		session.save(o);
		
	}

	public void delete(T o) {
		// TODO Auto-generated method stub
		Session session=this.sessionfactory.getCurrentSession();
		session.delete(o);
		
	}

	public void update(T o) {
		// TODO Auto-generated method stub
		Session session=this.sessionfactory.getCurrentSession();
		session.update(o);
		
	}

	public List<T> findAll(Class<T> o) {
		// TODO Auto-generated method stub
		Session session=this.sessionfactory.getCurrentSession();
		Criteria crit=session.createCriteria(o);
		return crit.list();
	}

	public T findOne(Class<T> o, Long id) {
		// TODO Auto-generated method stub
		Session session=this.sessionfactory.getCurrentSession();
		return (T) session.get(o, id);
	}

}
