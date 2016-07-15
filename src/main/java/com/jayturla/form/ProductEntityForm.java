package com.jayturla.form;

import java.util.Date;

import com.jayturla.model.Product;

public class ProductEntityForm {
	
	private String name;
	private double price;
	private Date date = new Date();
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Product build(){
		Product p = new Product();
		
		p.setName(this.name);
		p.setDescription(this.description);
		p.setPrice(this.price);
		p.setCreated_date(date);
		
		return p;
		
	}

}
