package com.example.webapp.api.contoller;

import com.example.webapp.api.model.SerieResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/series")
public interface SeriesController {

@PostMapping("criar")
    String criarSeries();

@PutMapping("atualizar")
    String atualizarSeries();

    @GetMapping(value ="buscar",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    ResponseEntity<SerieResponse> buscarSeries();

@DeleteMapping("deletar")
    String deletarSeries();

}



