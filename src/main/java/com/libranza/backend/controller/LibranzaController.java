package com.libranza.backend.controller;

import com.libranza.backend.model.SimulacionRequest;
import com.libranza.backend.model.SimulacionResponse;
import com.libranza.backend.service.LibranzaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/libranza")
@CrossOrigin(origins = "*")
public class LibranzaController {

    private final LibranzaService libranzaService;

    public LibranzaController(LibranzaService libranzaService) {
        this.libranzaService = libranzaService;
    }

    @PostMapping("/simular")
    public SimulacionResponse simular(@RequestBody SimulacionRequest request) {
        return libranzaService.simular(
                request.getMonto(),
                request.getTasaAnual(),
                request.getPlazo()
        );
    }
}