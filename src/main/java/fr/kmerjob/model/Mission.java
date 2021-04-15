package fr.kmerjob.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="MIS_ID")
	private int id;
	
	@Column(name="MIS_libelle", length = 30, nullable = false)
	private String libelle;
	
	@Column(name="MIS_description", length = 200, nullable = false)
	private String description;
	
	@Column(name="MIS_prix")
	private int tjm;
	
	@Column(name="MIS_duree")
	private int duree;
	
	@Column(name="MIS_disponibilite")
	private boolean disponibilite;
	
	@Column(name="MIS_date_publication")
	private Date datePublication;
	
	@Column(name="MIS_date_demarrage")
	private Date dateDemarrage;
	
	
	public Mission () {
		
	}

}
