package ru.site.dictionary.rest.api.onetoone;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "user_id")
    private Long id;
    
    @NotBlank
    private String firstName;
    
    @NotBlank
    private String addressPeople;

    //...

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
   
    //... getters and setters
}