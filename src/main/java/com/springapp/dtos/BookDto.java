package com.springapp.dtos;


public class BookDto {

	private String name;
	private int nbrpages;
	private double price;
	private Long userId;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbrpages() {
		return nbrpages;
	}

	public void setNbrpages(int nbpages) {
		this.nbrpages = nbpages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

 
	

}