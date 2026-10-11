package com.saas.delivery.controller;

import com.saas.delivery.model.Categoria;
import com.saas.delivery.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @GetMapping
    public List listarTodas() {
        return repository.findAll();
    }
}