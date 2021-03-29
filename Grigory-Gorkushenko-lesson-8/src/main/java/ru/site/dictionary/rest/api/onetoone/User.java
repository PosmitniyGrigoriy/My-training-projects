package ru.site.dictionary.rest.api.onetoone;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String firstName;
    private String addressPeople;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address;

    
    
    public User(){
        super();
    }

    public User(Long id, String firstName, String addressPeople) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.addressPeople = addressPeople;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }
    
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getAddressPeople() {
        return addressPeople;
    }
    
    public void setAddressPeople(String addressPeople) {
        this.addressPeople = addressPeople;
    }
    
    
}