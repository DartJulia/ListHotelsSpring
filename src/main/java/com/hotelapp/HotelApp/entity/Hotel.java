package com.hotelapp.HotelApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel_listing")
public class Hotel {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotel_id")
	private Long id; // long can work too
	@Column(name = "hotel_name")
	private String name;
	@Column(name = "city")
	private String city;
	@Column(name = "price_per_night")
	private double price;

	public Hotel() {

	}

	public Hotel(String name, String city, double price) {
		super();
		this.name = name;
		this.city = city;
		this.price = price;
	}

	public Hotel(Long id, String name, String city, double price) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.price = price;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", city=" + city + ", price=" + price;
	}

}
