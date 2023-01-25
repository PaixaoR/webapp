package com.example.webapp.api.contoller;

import com.example.webapp.api.model.SerieResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeriesControllerImpl implements SeriesController {
    @Override
    public ResponseBody<SerieResponse> buscarSeries() {
        return new SerieResponse(1,"Game of thrones");
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
