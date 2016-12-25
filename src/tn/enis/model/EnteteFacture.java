package tn.enis.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "ENTETEFACTURE")
public class EnteteFacture {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ENTETEFACTURE_ID")
	int id;
	@Column(name = "DATE")
	Date date;
	@ManyToOne(cascade = CascadeType.ALL)	
	@JoinColumn (name="CLIENT_ID")
	Client client;
	public EnteteFacture() {
	}

	public EnteteFacture(Date date, Client client) {
		this.date = date;
		this.client = client;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
