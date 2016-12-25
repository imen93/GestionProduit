package tn.enis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "CATEGORIE")
public class Categorie implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CATEGORIE_ID")
	private int id;
	@Column(name = "NOM", nullable = false, length = 100)
	private String nom;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Categorie( String nom) {
		
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Categorie(){}
}
