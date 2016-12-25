package tn.enis.model;

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
@Table(name = "LIGNEFACTURE")
public class LigneFacture {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "LIGNEFACTURE_ID")
	int id;
	@ManyToOne(cascade = CascadeType.ALL)	
	@JoinColumn (name="PRODUIT_ID")
	Produit produit;
	@ManyToOne(cascade = CascadeType.ALL)	
	@JoinColumn (name="ENTETEFACTURE_ID")
	EnteteFacture enteteFacture;
	@Column(name = "QUANTITE")
	int quantite;

	public LigneFacture() {
	}

	

	public LigneFacture(Produit produit, EnteteFacture enteteFacture,
			int quantite) {
		this.produit = produit;
		this.enteteFacture = enteteFacture;
		this.quantite = quantite;
	}



	public EnteteFacture getEnteteFacture() {
		return enteteFacture;
	}



	public void setEnteteFacture(EnteteFacture enteteFacture) {
		this.enteteFacture = enteteFacture;
	}



	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
