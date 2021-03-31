package ru.site.dictionary.rest.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "people")
public class People {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String firstName;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
//	private Address country;
//	private Address city;
//	private Address street;
//	private Address house;
//	private Address apartment;
    
    public People() {
    	super();
    }
    
    public People(String firstName) {
    	this.firstName = firstName;
    }
    
//    public People(String firstName, Address country, Address city, Address street, Address house, Address apartment) {
//		this.firstName = firstName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
    
    
    public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
//    public Address getCountry() {
//		return country;
//	}
//
//	public void setCountry(Address country) {
//		this.country = country;
//	}
//	
//	public Address getCity() {
//		return city;
//	}
//
//	public void setCity(Address city) {
//		this.city = city;
//	}
//	
//	public Address getStreet() {
//		return street;
//	}
//
//	public void setStreet(Address street) {
//		this.street = street;
//	}
//	
//	public Address getHouse() {
//		return house;
//	}
//
//	public void setHouse(Address house) {
//		this.house = house;
//	}
//	
//	public Address getApartment() {
//		return apartment;
//	}
//
//	public void setApartment(Address apartment) {
//		this.apartment = apartment;
//	}

}