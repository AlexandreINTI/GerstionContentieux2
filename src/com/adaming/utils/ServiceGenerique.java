package com.adaming.utils;

import java.util.List;

public interface ServiceGenerique<T> {

	public void create(T o);

	public void delete(T o);

	public void update(T o);

	public List<T> findAll(Class<T> o);

	public T getById(Class<T> o, Long id);
}