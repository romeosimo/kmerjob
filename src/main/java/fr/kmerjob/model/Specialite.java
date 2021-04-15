package fr.kmerjob.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Specialite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="SPE_ID")
	private int id;
	
	@Column(name="SPE_libelle", length = 30, nullable = false)
	private String libelle; 
	
	@Column(name="SPE_description", length = 200, nullable = false)
	private String description; 
	
	public Specialite() {
		
	}

}
