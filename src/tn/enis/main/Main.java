package tn.enis.main;

import java.util.Date;

import tn.enis.dao.CategorieDao;
import tn.enis.dao.CategorieDaoImpl;
import tn.enis.dao.ClientDao;
import tn.enis.dao.ClientDaoImpl;
import tn.enis.dao.EnteteFactureDao;
import tn.enis.dao.EnteteFactureDaoImpl;
import tn.enis.dao.LigneFactureDao;
import tn.enis.dao.LigneFactureDaoImpl;
import tn.enis.dao.ProduitDao;
import tn.enis.dao.ProduitDaoImpl;
import tn.enis.model.Categorie;
import tn.enis.model.Client;
import tn.enis.model.EnteteFacture;
import tn.enis.model.LigneFacture;
import tn.enis.model.Produit;
import tn.enis.service.CategorieService;
import tn.enis.service.CategorieServicesImpl;
import tn.enis.service.ClientService;
import tn.enis.service.ClientServiceImpl;
import tn.enis.service.EnteteFactureService;
import tn.enis.service.EnteteFactureServiceImpl;
import tn.enis.service.LigneFactureService;
import tn.enis.service.LigneFactureServiceImpl;
import tn.enis.service.ProduitService;
import tn.enis.service.ProduitServiceImpl;

public class Main {

	public static void main(String[] args) {

		/*
		 * CategorieDao categorieDao = new CategorieDaoImpl(); CategorieService
		 * categorieService =(CategorieService)new
		 * CategorieServicesImpl(categorieDao); ProduitDao produitDao= new
		 * ProduitDaoImpl(); ProduitService produitService=(ProduitService) new
		 * ProduitServiceImpl(produitDao); Categorie categorie=new
		 * Categorie("ffff"); categorieService.ajouter(categorie); Produit
		 * produit=new Produit("egtthg",12.5,categorie);
		 * produitService.ajouter(produit);
		 */
		CategorieDao categorieDao = new CategorieDaoImpl();
		CategorieService categorieService = (CategorieService) new CategorieServicesImpl(
				categorieDao);
		ProduitDao produitDao = new ProduitDaoImpl();
		ProduitService produitService = (ProduitService) new ProduitServiceImpl(
				produitDao);
		Categorie categorie = new Categorie("facture4");
		categorieService.ajouter(categorie);
		Produit produit = new Produit("facture4", 25.545, categorie);
		produitService.ajouter(produit);
		ClientDao clientDao = new ClientDaoImpl();
		ClientService clientService = (ClientService) new ClientServiceImpl(
				clientDao);
		Client client = new Client("imen4", "home");
		clientService.ajouter(client);
		EnteteFactureDao enteteFactureDao = new EnteteFactureDaoImpl();
		EnteteFactureService enteteFactureService = (EnteteFactureService) new EnteteFactureServiceImpl(
				enteteFactureDao);
		Date date = null;
		EnteteFacture enteteFacture = new EnteteFacture(date, client);
		enteteFactureService.ajouter(enteteFacture);
		LigneFactureDao ligneFactureDao = new LigneFactureDaoImpl();
		LigneFactureService ligneFactureService = (LigneFactureService) new LigneFactureServiceImpl(
				ligneFactureDao);
		LigneFacture ligneFacture = new LigneFacture(produit, enteteFacture, 5);
		ligneFactureService.ajouter(ligneFacture);

	}

}
