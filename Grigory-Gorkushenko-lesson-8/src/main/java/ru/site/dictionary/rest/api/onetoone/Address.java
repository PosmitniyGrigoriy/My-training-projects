package ru.site.dictionary.rest.api.onetoone;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Long address_id;
    
    @NotBlank
    private String addressPeople;

    @OneToOne(mappedBy = "address_id", cascade = CascadeType.ALL)
    private User user;
    
    public Address(){
        super();
    }

    public Address(Long address_id, String addressPeople) {
        super();
        this.address_id = address_id;
        this.addressPeople = addressPeople;
    }
    
    public Long getAddress_id() {
        return address_id;
    }
    
    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }
    
    public String getAddressPeople() {
        return addressPeople;
    }
    
    public void setAddressPeople(String addressPeople) {
        this.addressPeople = addressPeople;
    }
    
    
    
    
    
    
//    @Entity
//    @Table(name = "users")
//    public class User {
//         
//        @Id
//        @Column(name = "id")
//        @GeneratedValue(strategy = GenerationType.AUTO)
//        private Long id;
//         
//        @OneToOne(cascade = CascadeType.ALL)
//        @JoinTable(name = "user_passport",
//            joinColumns = @JoinColumn(name="user_id"),
//            inverseJoinColumns = @JoinColumn(name="passport_id")
//        )
//        private Passport passport;
//    }
//
//
//
//
//    @Entity
//    @Table(name = "passports")
//    public class Passport {
//     
//        @Id
//        @Column(name = "id")
//        @GeneratedValue(strategy = GenerationType.AUTO)
//        private Long id;
//         
//        @OneToOne(mappedBy = "passport")
//        private User user;
//    }
    
    
    
    
    
    
}