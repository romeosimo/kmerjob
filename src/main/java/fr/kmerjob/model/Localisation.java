package fr.kmerjob.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Localisation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="LOC_ID")
	private int id;
	
	@Column(name="LOC_province", length = 30, nullable = false)
	private String province;
	
	@Column(name="LOC_ville", length = 30, nullable = false)
	private String ville;
	
	public Localisation() {
		
	}

}
