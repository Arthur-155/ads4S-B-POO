package com.ab.controller;

import com.ab.model.Model;
import com.ab.service.FestaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/festa")
public class Controller {

    private final FestaService service;

    public Controller (FestaService service){
        this.service = service;
    }

}
