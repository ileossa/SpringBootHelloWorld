package com.example.controller;

import com.example.data.UsersData;
import com.example.service.UsersManipulation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by swip on 08/03/2016.
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UsersManipulation usersManipulation;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public boolean userLogin(
            @RequestParam(value = "name", defaultValue = "none", required = true) String name,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "email", defaultValue = "none") String email) {

        for (UsersData userData : usersManipulation.findByUsersDatas(name)) {
            if (password.equals(userData.getPassword())) {
                log.info("User find : \nParams Enter: " + name + password + email + "\nUser Data: " + userData.toString());
                return true;
            }
        }
        return false;
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void userRegister(
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "email", required = true) String email) {

        UsersData user = usersManipulation.save(new UsersData(name, password, email));
        log.info("User isert DB : " + user.toString());
    }


}
