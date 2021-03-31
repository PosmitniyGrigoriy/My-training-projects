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
    
    public People() {
    	super();
    }
    
    public People(String firstName) {
    	this.firstName = firstName;
    }
    
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
    
}