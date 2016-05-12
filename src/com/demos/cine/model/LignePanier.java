package com.demos.cine.model;

public class LignePanier {
	private Article art;
	private int qte;
	public LignePanier(Article art, int qte) {
		super();
		this.art = art;
		this.qte = qte;
	}
	public Article getArt() {
		return art;
	}
	public int getQte() {
		return qte;
	}
	
	
}
