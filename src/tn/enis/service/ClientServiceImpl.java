package tn.enis.service;

import java.math.BigDecimal;

import tn.enis.dao.ClientDao;
import tn.enis.dao.GenericDao;
import tn.enis.model.Client;

public class ClientServiceImpl extends GenericServicesImpl<Client, BigDecimal> implements ClientService{

	public ClientServiceImpl(){};
	public ClientServiceImpl(GenericDao<Client, BigDecimal> clientDao){
		super.genericDao=(ClientDao)clientDao;
	}
}
