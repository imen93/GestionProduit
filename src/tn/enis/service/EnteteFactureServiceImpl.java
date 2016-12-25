package tn.enis.service;

import java.math.BigDecimal;

import tn.enis.dao.EnteteFactureDao;
import tn.enis.dao.GenericDao;
import tn.enis.model.EnteteFacture;

public class EnteteFactureServiceImpl extends GenericServicesImpl<EnteteFacture, BigDecimal>implements EnteteFactureService {

	EnteteFactureServiceImpl(){};
	public EnteteFactureServiceImpl(GenericDao<EnteteFacture,BigDecimal> enteteFactureDao){
		super.genericDao=(EnteteFactureDao)enteteFactureDao;
	};

	
}
