package com.hackathonteam2.recomovie.movie.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hackathonteam2.recomovie.movie.service.TMDBService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieRestController {

    private final TMDBService tmdbService;

    @GetMapping("/get-all-data")
    public String getAllData() throws JsonProcessingException {
        return tmdbService.getByPeriod("2024-01-15", "2024-01-15").toString();
    }

}
