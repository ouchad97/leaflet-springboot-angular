package org.basma.store.responses;

public class ProductResponse {

	private String titleProduct;

	private String descriptionProduct;

	private double prixProduct;

	private int qtStockProduct;
	
	private int idCategorie;

	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getTitleProduct() {
		return titleProduct;
	}

	public void setTitleProduct(String titleProduct) {
		this.titleProduct = titleProduct;
	}

	public String getDescriptionProduct() {
		return descriptionProduct;
	}

	public void setDescriptionProduct(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}

	public double getPrixProduct() {
		return prixProduct;
	}

	public void setPrixProduct(double prixProduct) {
		this.prixProduct = prixProduct;
	}

	public int getQtStockProduct() {
		return qtStockProduct;
	}

	public void setQtStockProduct(int qtStockProduct) {
		this.qtStockProduct = qtStockProduct;
	}

}
