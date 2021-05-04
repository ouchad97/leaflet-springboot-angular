package org.basma.store.shared.dto;

import java.io.Serializable;

public class CategorieDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7624704134195738202L;

	private int id;
	private String categorieId;
	private String titreCategorie;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdCategorie() {
		return categorieId;
	}

	public void setIdCategorie(String idCategorie) {
		this.categorieId = idCategorie;
	}

	public String getTitreCategorie() {
		return titreCategorie;
	}

	public void setTitreCategorie(String titreCategorie) {
		this.titreCategorie = titreCategorie;
	}

	public CategorieDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategorieDto(String titreCategorie) {
		this.titreCategorie = titreCategorie;
	}

}
