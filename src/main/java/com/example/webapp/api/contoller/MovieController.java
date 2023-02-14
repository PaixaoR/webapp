package com.example.webapp.api.contoller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/movies")
public interface MovieController {

    @PostMapping("criar")
    String criarMovies();

    @PutMapping("atualizar")
    String atualizarMovies();

    @GetMapping(value ="buscar",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    String buscarMovies();

    @DeleteMapping("deletar")
    String deletarMovies();
}

