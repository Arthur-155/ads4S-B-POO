package com.ab.service;

import com.ab.model.Model;
import com.ab.repository.FestaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class FestaService {

    private final FestaRepository repository;

    public FestaService(FestaRepository repository){
        this.repository = repository;
    }

    public Model pessoaDaFesta (Model pessoa){
        return repository.save(pessoa);
    }
}
