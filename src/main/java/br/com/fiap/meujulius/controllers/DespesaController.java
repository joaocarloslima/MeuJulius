package br.com.fiap.meujulius.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.meujulius.models.Despesa;
import java.math.BigDecimal;
import java.time.LocalDate;


@RestController
public class DespesaController {

    @GetMapping("/api/despesas")
    public Despesa show(){
        return new Despesa(new BigDecimal(100), LocalDate.now(), "cinema");
    }
    
}
