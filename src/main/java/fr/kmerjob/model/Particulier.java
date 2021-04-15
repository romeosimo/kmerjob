package fr.kmerjob.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Particulier")
public class Particulier extends Personne {
	
	@Column(name ="Per_prenom", length = 50, nullable = false)
	private String prenom;

	@Override
	public PersonneType getType() {
		// TODO Auto-generated method stub
		return PersonneType.Particulier;
	}
	
	public Particulier() { }

}
