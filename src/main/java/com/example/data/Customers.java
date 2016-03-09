package com.example.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 * Created by swip on 08/03/2016.
 *
 *  @Entity : permet de mapper la class et de créer une table Customers, on aurait pus mettre aussi @Table pour la créer
 *
 */
@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;

    // Only exist for check JPA, don't use directly !!
    protected Customers(){}

    public Customers(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }

}
