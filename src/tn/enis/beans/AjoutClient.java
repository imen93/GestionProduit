package tn.enis.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import tn.enis.dao.ClientDao;
import tn.enis.dao.ClientDaoImpl;
import tn.enis.model.Client;
import tn.enis.service.ClientService;
import tn.enis.service.ClientServiceImpl;

@ManagedBean
@RequestScoped
public class AjoutClient implements Serializable {
	private static final long serialVersionUID = 1L;

	private Client client;
	private ClientDao clientDao;
	private ClientService clientService;

	public AjoutClient() {
		client = new Client();
		clientDao = new ClientDaoImpl();
		clientService = (ClientService) new ClientServiceImpl(clientDao);
	}

	public void ajout() {
		//Client client1=new Client(client.getNom(),client.getAdresse());
		clientService.ajouter(client);
		FacesMessage message = new FacesMessage("Succès de l'ajout !");
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public Client getClient() {
		return client;
	}

}
