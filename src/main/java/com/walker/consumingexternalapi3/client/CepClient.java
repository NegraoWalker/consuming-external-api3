package com.walker.consumingexternalapi3.client;

import com.walker.consumingexternalapi3.client.dto.CepDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CepClient",url = "https://viacep.com.br/")
public interface CepClient {
    @GetMapping("/ws/{cep}/json/")
    ResponseEntity<CepDto> findByCep(@PathVariable String cep);
}
