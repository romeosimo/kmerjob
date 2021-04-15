package fr.kmerjob.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commentaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="COM_ID")
	private int id;
	
	@Column(name="COM_commentaire", length = 200, nullable = false)
	private String commentaire; 
	
	@Column(name="COM_date_publication", nullable = false)
	private Date datePublication;
	
	@Column(name="COM_note", nullable = false)
	private int note; 
	
	public Commentaire () {
		
	}

}
