package tn.enis.service;

import java.util.List;

import tn.enis.dao.GenericDao;

public class GenericServicesImpl <T, ID > implements GenericServices<T, ID>{
	protected GenericDao<T, ID> genericDao;
	 
    public GenericServicesImpl(GenericDao<T,ID> genericDao) {
        this.genericDao=genericDao;
    }
 
    public GenericServicesImpl() {
    }
	
	@Override
	public void ajouter(T entity) {
		genericDao.ajouter(entity);
	}

	@Override
	public void modifier(T entity) {
		genericDao.modifier(entity);
	}

	@Override
	public void supprimer(T entity) {
		genericDao.supprimer(entity);
	}

	@Override
	public T findByID(@SuppressWarnings("rawtypes") Class clazz, Integer id) {
		genericDao.findByID(clazz, id);
		return null;
	}

	@Override
	public List<T> findAll(@SuppressWarnings("rawtypes") Class clazz) {
		genericDao.findAll(clazz);
		return null;
	}


}
