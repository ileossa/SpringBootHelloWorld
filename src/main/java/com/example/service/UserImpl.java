package com.example.service;

import com.example.data.Customers;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by swip on 09/03/2016.
 */
@Service
@Slf4j
public class UserImpl {

    @Bean
    public CommandLineRunner demo(CustomersRepository customersRepository){
        return (args) -> {
            // save a couple of customers
            customersRepository.save(new Customers("Jack", "Bauer"));
            customersRepository.save(new Customers("Chloe", "O'Brian"));
            customersRepository.save(new Customers("Kim", "Bauer"));
            customersRepository.save(new Customers("David", "Palmer"));
            customersRepository.save(new Customers("Michelle", "Dessler"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customers customer : customersRepository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Customers customer = customersRepository.findOne(3L);
            log.info("Customer found with findOne(3L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            for (Customers bauer : customersRepository.findByLastName("Bauer")) {
                log.info(bauer.toString());
            }
            log.info("");
        };
    }
}
