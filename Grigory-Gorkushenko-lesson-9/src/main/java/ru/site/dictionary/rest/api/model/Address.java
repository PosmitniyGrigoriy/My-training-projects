package ru.site.dictionary.rest.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue
	private Long id;

	
	@NotBlank
	private String address;
	
	
//	@NotBlank
//	private String country;
//	
//	@NotBlank
//	private String city;
//	
//	@NotBlank
//	private String street;
//	
//	@NotBlank
//	private int house;
//	
//	@NotBlank
//	private int apartment;

	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	private People people;
	
	public Address() {
		super();
	}
		
	 public Address(String address) {
	    	this.address = address;
	    }
	
	
//	public Address(String country, String city, String street,int house, int apartment) {
//		this.country = country;
//		this.city = city;
//		this.street = street;
//		this.house = house;
//		this.apartment = apartment;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//	
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//	
//	public String getStreet() {
//		return street;
//	}
//
//	public void setStreet(String street) {
//		this.street = street;
//	}
//	
//	public int getHouse() {
//		return house;
//	}
//
//	public void setHouse(int house) {
//		this.house = house;
//	}
//	
//	public int getApartment() {
//		return apartment;
//	}
//
//	public void setApartment(int apartment) {
//		this.apartment = apartment;
//	}
	
	
	
	
	// Это должно быть в комментах, чтобы не было рекурсии по выводу текста в браузере
//	public People getPeople() {
//		return people;
//	}
//
//	public void setPeople(People people) {
//		this.people = people;
//	}
	
}
