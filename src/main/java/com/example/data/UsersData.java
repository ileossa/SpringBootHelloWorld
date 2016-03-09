package com.example.data;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by swip on 08/03/2016.
 */
@Data
@Entity
public class UsersData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String password;
    private String email;


    public UsersData(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
