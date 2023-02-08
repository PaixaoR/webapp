package com.example.webapp.api.contoller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieControllerImpl implements MovieController {


    @Override
    public String buscarMovies() {
        return "a busca de movies esta funcionando";
    }

    @Override
    public String criarMovies() {
        return "a criacao de movies esta funcionando";
    }

    @Override
    public String atualizarMovies() {
        return "a atualizaçao de movies esta funcionando";
    }

    @Override
    public String deletarMovies() {
        return "a delecao de Movies esta funcionando";
    }
}




