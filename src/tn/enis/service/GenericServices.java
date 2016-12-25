package tn.enis.service;

import java.util.List;

public interface GenericServices<T, ID> {

	public void ajouter(T entity);

	public void modifier(T entity);

	public void supprimer(T entity);

	@SuppressWarnings("rawtypes")
	public T findByID(Class clazz, Integer id);

	@SuppressWarnings("rawtypes")
	public List<T> findAll(Class clazz);

}
