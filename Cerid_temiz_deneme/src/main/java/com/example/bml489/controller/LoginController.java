package com.example.bml489.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/login")
public class LoginController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public @ResponseBody  HttpStatus echo(){
        //System.out.println("Login'e vurdu");
        return HttpStatus.OK;
    }

    /*@RequestMapping(value = "",method = RequestMethod.POST)
    public @ResponseBody  HttpStatus deneme(){
        System.out.println("Deneme");
        return HttpStatus.OK;
    }*/
}
