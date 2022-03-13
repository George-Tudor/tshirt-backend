package com.georgetudor.tshirt.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (unique = true, length = 100)
    private String username;

    @Column(length = 50)
    private String firstName;

    @Column(length = 50)
    private String lastName;

    @Column(length = 100)
    private String streetAddress;

    @Column(length = 15)
    private String state;

    @Column(length = 9)
    private String postalCode;

    @Column(length = 254)
    private String email;
    
    @Column
    @JsonIgnore
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }
}

