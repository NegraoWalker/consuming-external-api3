package com.walker.consumingexternalapi3.controller;

import com.walker.consumingexternalapi3.client.CepClient;
import com.walker.consumingexternalapi3.client.dto.CepDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CepController {
    private final CepClient cepClient;

    public CepController(CepClient cepClient) {
        this.cepClient = cepClient;
    }

    @GetMapping("/{cep}")
    public ResponseEntity<CepDto> cep(@PathVariable String cep){
        return ResponseEntity.status(200).body(cepClient.findByCep(cep).getBody());
    }
}
