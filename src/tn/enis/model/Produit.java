package tn.enis.model;

import java.io.Serializable;

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
@Table(name = "PRODUIT")
public class Produit implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "PRODUIT_ID")
	private int id;
	@Column(name = "LIBELLE", nullable = false, length = 100)
	private String libelle;
	@Column(name = "QUANTITESTOCK", nullable = false)
	private Double quantiteStock;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn (name="CATEGORIE_ID")
	Categorie categorie;
	public Produit() {
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public Double getQuantiteStock() {
		return quantiteStock;
	}


	public void setQuantiteStock(Double quantiteStock) {
		this.quantiteStock = quantiteStock;
	}


	public Produit(String libelle, Double quantiteStock,
			Categorie categorie) {
		this.libelle = libelle;
		this.quantiteStock = quantiteStock;
		this.categorie = categorie;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	
	
}
