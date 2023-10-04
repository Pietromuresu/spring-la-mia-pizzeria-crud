package org.java.POJO;

import java.math.BigDecimal;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(length=100, nullable = false)
	private String name;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String description;
	
	@Column(length=100, nullable = false, columnDefinition = "TEXT")
	private String fotoUrl;
	
	@Column(length=100, nullable = false)
	private BigDecimal price;
	
	
	public Pizza() {}
	public Pizza(String name, String description, String fotoUrl, BigDecimal price) {
		
		setDescription(description);
		setFotoUrl(fotoUrl);
		setId(id);
		setName(name);
		setPrice(price);
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public String getFotoUrl() {
		return fotoUrl;
	}
	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}


	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "[" + id + "]" + name + " \n"
				+ description;
	}
	
}
