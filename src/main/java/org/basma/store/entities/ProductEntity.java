package org.basma.store.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;


@Data
@Entity(name="products")
public class ProductEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1786055311038178423L;

	@Id
	@GeneratedValue
	private long idProduct;

	@Column(nullable=false)
	private String productId;
	
	@Column(nullable=false, length=50)
	private String titleProduct;
	
	@Column(nullable=false, length=200)
	private String descriptionProduct;

	@Column(nullable=false)
	private double prixProduct;
	
	@Column(nullable=false)
	private int qtStockProduct;
	
	    @ManyToOne
	    @JoinColumn(name = "idCategorie")
	private CategorieEntity categorie;
	
  
	 
 
	public ProductEntity(String titleProduct, String descriptionProduct, double prixProduct, int qtStockProduct) {
		super();
		this.titleProduct = titleProduct;
		this.descriptionProduct = descriptionProduct;
		this.prixProduct = prixProduct;
		this.qtStockProduct = qtStockProduct;
	}

	
	
	 
	
	public ProductEntity(String titleProduct, String descriptionProduct, double prixProduct, int qtStockProduct,
			CategorieEntity categorie) {
		super();
		this.titleProduct = titleProduct;
		this.descriptionProduct = descriptionProduct;
		this.prixProduct = prixProduct;
		this.qtStockProduct = qtStockProduct;
		this.categorie = categorie;
	}

	
	public ProductEntity(String productId, String titleProduct, String descriptionProduct, double prixProduct,
			int qtStockProduct, CategorieEntity categorie) {
		super();
		this.productId = productId;
		this.titleProduct = titleProduct;
		this.descriptionProduct = descriptionProduct;
		this.prixProduct = prixProduct;
		this.qtStockProduct = qtStockProduct;
		this.categorie = categorie;
	}

	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}





	public long getIdProduct() {
		return idProduct;
	}





	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}





	public String getProductId() {
		return productId;
	}





	public void setProductId(String productId) {
		this.productId = productId;
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





	public CategorieEntity getCategorie() {
		return categorie;
	}


	



	public void setCategorie(CategorieEntity categorie) {
		this.categorie = categorie;
	}
 
	
	
	
	
}
