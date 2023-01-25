package com.example.webapp.api.contoller;

import com.example.webapp.api.model.SerieResponse;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/series")
public interface SeriesController {

    @GetMapping("/buscar")
    ResponseBody<SerieResponse>   buscarSeries();
    @PostMapping("/criar")
    String criarSeries();
    @PutMapping("/atualizar")
    String atualizarSeries();
    @DeleteMapping("/deletar")
    String deletarSeries();
}
