package org.number.store.shared.dto;

import java.io.Serializable;

public class NumberDto implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4886306822331107228L;
	private long id;
	private String numId;
	private int num;
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
	public NumberDto(long id, String numId, int num) {
		super();
		this.id = id;
		this.numId = numId;
		this.num = num;
	}
	public NumberDto(String numId, int num) {
		super();
		this.numId = numId;
		this.num = num;
	}
	public NumberDto(int num) {
		super();
		this.num = num;
	}
	public NumberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
 
	
}