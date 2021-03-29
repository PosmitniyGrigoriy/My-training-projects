package ru.site.dictionary.rest.api.onetoone;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long user_id;
    
    @NotBlank
    private String firstName;

//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    @MapsId
//    private Address addressPeople;

    
    
    @ JoinColumn (name = "address_id")
    private int address_id;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;
    
    
    
    
    public User(){
        super();
    }

    public User(Long user_id, String firstName) {
        super();
        this.user_id = user_id;
        this.firstName = firstName;
    }
    
    public Long getId() {
        return user_id;
    }
    
    public void setId(Long user_id) {
        this.user_id = user_id;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
}