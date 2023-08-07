package com.business;

//import java.util.ArrayList;
//import java.util.List;

import com.dao.PersonneIDao;
import com.dao.impl.PersonneDaoImp;
import com.model.Personne;

public class PersonneBusiness {
	private PersonneIDao prDao  = new PersonneDaoImp();
//	private List<Personne> listPersonne = new ArrayList();

	private Personne pr = new Personne();

	public void ajouter() {
		prDao.saveOrUpdate(pr);
		pr = new Personne();
	}

	public String quitter() {
		return "quitter";
	}

	public void annuler() {
		pr = new Personne();
	}

	public Personne getpr() {
		return pr;
	}

	public void setpr(Personne pr) {
		this.pr = pr;
	}

	public PersonneIDao getprDao() {
		return prDao;
	}

	public void setprDao(PersonneIDao prDao) {
		this.prDao = prDao;
	}

//	public List<Personne> getListPersonne() {
//		listPersonne = prDao.findAll(Personne.class);
//		return listPersonne;
//	}
//
//	public void setListPersonne(List<Personne> listPersonne) {
//		this.listPersonne = listPersonne;
//	}

}
