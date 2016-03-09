package com.example.service;

import com.example.data.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by swip on 08/03/2016.
 *
 * CrudRepository -> permet de travailler sur Customers avec des méthode persistantes
 *                                         - Saving
 *                                         - Deleting
 *                                         - Finding
 *                   customers entity
 */
@Service
public interface CustomersRepository extends CrudRepository<Customers, Long>{

    List<Customers> findByLastName(String lastName);
}
