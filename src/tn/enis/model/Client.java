package tn.enis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client {
	@Id
	@GeneratedValue
	@Column(name = "CLIENT_ID")
	int id;
	@Column(name = "NOM")
	String nom;
	@Column(name = "ADRESSE")
	String adresse;

	public Client() {
	}

	public Client(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
