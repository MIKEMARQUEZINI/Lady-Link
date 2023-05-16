package com.generation.ladylink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ladylink.model.Postagem;
import com.generation.ladylink.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")

public class PostagemController {

	@Autowired
    private PostagemRepository postagemRepository;

	@GetMapping
    public ResponseEntity <List<Postagem>> getAll(){
        return ResponseEntity.ok(postagemRepository.findAll());
    }
    
        
    }

    

	

