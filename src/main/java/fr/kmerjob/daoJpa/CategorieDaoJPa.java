package fr.kmerjob.daoJpa;

import java.util.List;

import fr.kmerjob.dao.ICategorieDao;
import fr.kmerjob.model.Categorie;

public class CategorieDaoJPa extends DaoJpa implements ICategorieDao {

	@Override
	public List<Categorie> findAll() {
		// TODO Auto-generated method stub
		return em
				.createQuery("select c from Categorie c", Categorie.class)
				.getResultList();
	}

	@Override
	public Categorie findById(int id) {
		// TODO Auto-generated method stub
		return em
				.createQuery("select c from Categorie c where c.id= :id", Categorie.class)
				.setParameter("id", id)
				.getSingleResult();
	}

	@Override
	public Categorie add(Categorie entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie save(Categorie entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
