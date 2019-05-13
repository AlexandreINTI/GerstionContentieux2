package com.adaming.utils;

import java.util.List;

public interface DaoGenerique<T> {
	
	public void create(T o);
	public void delete(T o);
	public void update(T o);
	public List<T> findAll(Class<T> o);
	public T findOne (Class<T> o, Long id);

}
