package com.oehm4.LaptopProj.dto;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Laptop_Details")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class LaptopDTO implements Serializable
{
	@Id
	@Column(name="ID")
	@GenericGenerator(name="laptop_id",strategy = "increment")
	@GeneratedValue(generator = "laptop_id")
	private Long id;
	@Column(name="BRAND")
	private String brand;
	@Column(name="OS")
	private String os;
	@Column(name="GENERATION_PROCESSOR")
	private String gp;
	@Column(name="RAM")
	private String ram;
	@Column(name="PRICE")
	private Double price;
	
	public LaptopDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getGp() {
		return gp;
	}
	public void setGp(String gp) {
		this.gp = gp;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "LaptopDTO [id=" + id + ", brand=" + brand + ", os=" + os + ", gp=" + gp + ", ram=" + ram + ", price="
				+ price + "]";
	}
	
}
