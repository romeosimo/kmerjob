package fr.kmerjob.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IMG_ID")
	private int id;
	
	@Column(name="IMG_url", length = 200, nullable = false)
	private String url;
	
	
	public Image () {
		
	}

}
