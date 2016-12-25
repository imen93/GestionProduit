package tn.enis.service;

import java.math.BigDecimal;

import tn.enis.dao.GenericDao;
import tn.enis.dao.LigneFactureDao;
import tn.enis.model.LigneFacture;

public class LigneFactureServiceImpl extends GenericServicesImpl<LigneFacture, BigDecimal>implements LigneFactureService {

	public LigneFactureServiceImpl(){};
	public LigneFactureServiceImpl(GenericDao<LigneFacture, 	BigDecimal> ligneFactureDao){
		super.genericDao=(LigneFactureDao)ligneFactureDao;
	};

	
}
