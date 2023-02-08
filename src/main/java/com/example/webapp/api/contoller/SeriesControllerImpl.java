package com.example.webapp.api.contoller;

import com.example.webapp.api.model.SerieResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeriesControllerImpl implements SeriesController {

    @Override
    public ResponseEntity<SerieResponse> buscarSeries() {
        return ResponseEntity.ok(new SerieResponse(1,"Game of thrones"));
    }

    @Override
    public String criarSeries() {
        return "a criacao de series esta funcionando";
    }

    @Override
    public String atualizarSeries() {
        return "a atualizaçao de series esta funcionando";
    }

    @Override
    public String deletarSeries() {
        return "a delecao de series esta funcionando";
    }
}

