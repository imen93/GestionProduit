package tn.enis.service;

import java.math.BigDecimal;

import tn.enis.dao.GenericDao;
import tn.enis.dao.ProduitDao;
import tn.enis.model.Produit;

public class ProduitServiceImpl extends GenericServicesImpl<Produit, BigDecimal>implements ProduitService {

	public ProduitServiceImpl(){};
	public ProduitServiceImpl(GenericDao<Produit, 	BigDecimal> produitDao){
		super.genericDao=(ProduitDao)produitDao;
	};

	
}
