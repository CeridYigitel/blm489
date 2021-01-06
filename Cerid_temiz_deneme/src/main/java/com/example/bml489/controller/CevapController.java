package com.example.bml489.controller;


import com.example.bml489.entity.Cevap;
import com.example.bml489.service.CevapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/api/cevap")
public class CevapController {
    @Autowired
    private CevapService cevapService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public @ResponseBody
    HttpStatus createCevap(@RequestBody Cevap cevap){
        cevapService.createCevap(cevap);
        System.out.println("Cevap post vurdu");
        return  HttpStatus.OK;
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public @ResponseBody
    List<Cevap> readAll(){
        //System.out.println("");
        return cevapService.readAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public @ResponseBody Cevap readCevap(@PathVariable int id){
        return cevapService.readCevap(id);
    }

    @RequestMapping(value = "",method = RequestMethod.PUT)
    public @ResponseBody HttpStatus updateCevap(@RequestBody Cevap cevap){
        cevapService.updateCevap(cevap);
        return  HttpStatus.OK;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus deleteCevap(@PathVariable int id){
        cevapService.deleteCevap(id);
        return HttpStatus.OK;
    }
}
