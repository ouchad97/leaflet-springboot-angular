package org.number.store.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="numbers")
public class NumberEntity implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1497590107634648409L;
	
	@Id
	@GeneratedValue
	private long id;
	//
	@Column(nullable=false)
	private String numId;
	//
	@Column(nullable=false, length=50)
	private int num;
	//
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumId() {
		return numId;
	}
	public void setNumId(String numId) {
		this.numId = numId;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public NumberEntity(int num) {
		super();
		this.num = num;
	}
	public NumberEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	


}
