package com.business;

import java.util.ArrayList;
import java.util.List;

import com.dao.PiloteIDao;
import com.dao.impl.PiloteDaoImp;
import com.model.Pilote;

public class PiloteBusiness {

	private PiloteIDao piDao  = new PiloteDaoImp();
	private List<Pilote> listPilote = new ArrayList();

	private Pilote pi = new Pilote();

	public void ajouter() {
		piDao.saveOrUpdate(pi);
		pi = new Pilote();
	}

	public String quitter() {
		return "quitter";
	}

	public void annuler() {
		pi = new Pilote();
	}

	public Pilote getPi() {
		return pi;
	}

	public void setPi(Pilote pi) {
		this.pi = pi;
	}

	public PiloteIDao getpiDao() {
		return piDao;
	}

	public void setpiDao(PiloteIDao piDao) {
		this.piDao = piDao;
	}

	public List<Pilote> getListPilote() {
		listPilote = piDao.findAll(Pilote.class);
		return listPilote;
	}

	public void setListContact(List<Pilote> listPilote) {
		this.listPilote = listPilote;
	}

}
