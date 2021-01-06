package com.example.bml489.controller;


import com.example.bml489.entity.Olay;
import com.example.bml489.service.OlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(value = "/api/olay")
public class OlayController {
    @Autowired
    private OlayService olayService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public @ResponseBody HttpStatus createOlay(@RequestBody Olay olay){
        olayService.createOlay(olay);
        return  HttpStatus.OK;
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public @ResponseBody
    List<Olay> readAll(){
        System.out.println("Get olay'a vurdu");
        return olayService.readAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public @ResponseBody Olay readOlay(@PathVariable int id){
        return olayService.readOlay(id);
    }

    @RequestMapping(value = "",method = RequestMethod.PUT)
    public @ResponseBody HttpStatus updateOlay(@RequestBody Olay olay){
        olayService.updateOlay(olay);
        return  HttpStatus.OK;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus deleteOlay(@PathVariable int id){
        olayService.deleteOlay(id);
        return HttpStatus.OK;
    }

}
