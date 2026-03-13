package com.calculadora.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.calculadora.model.*;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.util.Map;

@RestController
public class CalculadoraController {

    @PostMapping("/calcular")
    public Map<String, Object> calcular(@RequestBody Map<String, String> corpo) {

        // Recebe a string vinda do Js
        String expressao = corpo.get("expressao");
        
        try {
            // ExpressionBuilder monta a conta
            Expression e = new ExpressionBuilder(expressao).build();
            
            double resultado = e.evaluate();

            // Retorna o resultado para o Js
            return Map.of("resultado", resultado);

        }
        // Tratamento de erro 
        catch (Exception e) {
            return Map.of("resultado", "Erro matemático");
        }
    }
}