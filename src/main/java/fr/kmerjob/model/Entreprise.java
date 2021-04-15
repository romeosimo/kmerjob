package fr.kmerjob.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Entreprise")
public class Entreprise extends Personne {
	
	@Column(name ="per_siret")
	private String siret;

	@Override
	public PersonneType getType() {
		// TODO Auto-generated method stub
		return PersonneType.Entreprise;
	}
	
	public Entreprise() { }

}
