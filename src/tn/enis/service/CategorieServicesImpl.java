package tn.enis.service;

import java.math.BigDecimal;

import tn.enis.dao.CategorieDao;
import tn.enis.dao.GenericDao;
import tn.enis.model.Categorie;

public class CategorieServicesImpl extends GenericServicesImpl<Categorie, BigDecimal> implements CategorieService{

	public CategorieServicesImpl(){};
	public CategorieServicesImpl(GenericDao<Categorie, BigDecimal> categorieDao){
		super.genericDao=(CategorieDao)categorieDao;
	}
}
