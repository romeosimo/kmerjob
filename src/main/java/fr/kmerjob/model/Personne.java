package fr.kmerjob.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import fr.kmerjob.model.PersonneType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PERSONNE")
public abstract class  Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="PER_ID")
	private int id;
	
	@Column(name ="Per_nom", length = 50, nullable = false)
	private String nom;
	
	@Column(name ="Per_email", length = 150, nullable = false)
	private String email;
	
	@Column(name ="Per_adresse", length = 150, nullable = false)
	private String adresse;
	
	@Column(name ="Per_tel", length = 20, nullable = false)
	private String tel;
	
	@Column(name ="Per_date_naissance")
	private Date date;
	
	@Column(name ="Per_password", length = 50, nullable = false)
	private String password;
	
	@Column(name ="Per_question", length = 255)
	private String question;
	
	@Column(name ="Per_response", length = 255)
	private String response;
	
	public Personne() { }
	
	
	
	public abstract PersonneType getType();
	
	
}