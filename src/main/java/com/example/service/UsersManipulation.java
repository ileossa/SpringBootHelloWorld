package com.example.service;

import com.example.data.UsersData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by swip on 09/03/2016.
 */
@Service
public interface UsersManipulation extends CrudRepository<UsersData, Long> {

    /*
    Permet de rechercher n'importe quelles valeurs dans la base de données et de retourner le résultat en forme de liste
     */
    List<UsersData> findByUsersDatas(String valueAtSearch);
}
