package fr.kmerjob.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="CAT_ID")
	private int id;
	
	@Column(name="CAT_libelle", length = 30, nullable = false)
	private String libelle;
	
	@Column(name="CAT_description", length = 200, nullable = false)
	private String description;
	
	
	
	
	public Categorie() {
		
	}

}
