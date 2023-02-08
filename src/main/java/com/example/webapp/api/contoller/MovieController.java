package com.example.webapp.api.contoller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public interface MovieController {

    @PostMapping("criar")
    String criarMovies();

    @PutMapping("atualizar")
        String atualizarMovies();

@GetMapping("buscar")
    String buscarMovies();

@DeleteMapping("deletar")
    String deletarMovies();}

