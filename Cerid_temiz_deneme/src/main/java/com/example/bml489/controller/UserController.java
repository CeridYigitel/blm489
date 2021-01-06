package com.example.bml489.controller;

import com.example.bml489.entity.Cevap;
import com.example.bml489.entity.User;
import com.example.bml489.service.CevapService;
import com.example.bml489.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public @ResponseBody
    HttpStatus createUser(@RequestBody User user){
        System.out.println("User post vurdu");
        userService.createUser(user);

        return  HttpStatus.OK;
    }
}
