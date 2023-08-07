package com.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.dao.ArticleIDao;
import com.dao.impl.ArticleDaoImp;
import com.model.Article;

public class ArticleBusiness implements Serializable {

	private static final long serialVersionUID = 1L;
	private ArticleIDao artIDao = new ArticleDaoImp();
	private Article art = new Article();
	private List<Article> listrArt = new ArrayList<Article>();
	private Article selectedArt;
	private List<Article> filteredArt;
	 
	public void init() {
		listrArt = artIDao.findAll(Article.class);
	}
	
	public  ArticleBusiness() {
	}
	
	public void addArticle() {

		artIDao.saveOrUpdate(art);
		art = new Article();
		listrArt = artIDao.findAll(Article.class);
	}

	public void updateArticle() {

	}

	public void deleteArticle() {
		
		artIDao.delete(selectedArt);
		listrArt = artIDao.findAll(Article.class);
	}

	public void findAllArticle() {

	}

	public void finddArticleByArticle() {

	}

	public String quitter() {
		return "quitter";
	}

	public void annuler() {
		art = new Article();
	}

	public void onRowEdit(RowEditEvent event) {

		Article art = (Article) event.getObject();
		artIDao.saveOrUpdate(art);
		listrArt = artIDao.findAll(Article.class);
		FacesMessage msg = new FacesMessage("Car Edited",
				((Article) event.getObject()).getLibArtArt());

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Edit Cancelled",
				((Article) event.getObject()).getCodArtArt());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onCellEdit(CellEditEvent event) {
		Object oldValue = event.getOldValue();
		Object newValue = event.getNewValue();
		System.out.println("newValue" + newValue + "old" + oldValue);

		if (newValue != null && !newValue.equals(oldValue)) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"MAJ avec succès ,", "Acienne Valeur: " + oldValue
							+ ", Nouvelle Valuer:" + newValue);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public void info() {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "PrimeFaces Rocks."));
	}

	public void warn() {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", "Watch out for PrimeFaces."));
	}

	public void error() {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Contact admin."));
	}

	public void fatal() {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "System Error"));
	}
	
	public ArticleIDao getArtIDao() {
		return artIDao;
	}

	public void setArtIDao(ArticleIDao artIDao) {
		this.artIDao = artIDao;
	}

	public Article getArt() {
		return art;
	}

	public void setArt(Article art) {
		this.art = art;
	}

	public List<Article> getListrArt() {
	if(listrArt.size()==0) {
		listrArt = artIDao.findAll(Article.class);
	}
		return listrArt;
	}

	public void setListrArt(List<Article> listrArt) {
		this.listrArt = listrArt;
	}

	public Article getSelectedArt() {
		return selectedArt;
	}

	public void setSelectedArt(Article selectedArt) {
		this.selectedArt = selectedArt;
	}

	public List<Article> getFilteredArt() {
		return filteredArt;
	}

	public void setFilteredArt(List<Article> filteredArt) {
		this.filteredArt = filteredArt;
	}

}
