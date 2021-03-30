package ru.kirillch.springdata.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue
	private int id;
	private String number;

	@OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
	private Person person;
	
	public Passport() {
	}

	public Passport(String number) {
		this.number = number;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "\nPassport [id=" + id + ", number=" + number + ", person=" + person + "]";
	}
	
	

}
