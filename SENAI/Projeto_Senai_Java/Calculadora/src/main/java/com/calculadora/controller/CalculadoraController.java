package main.java.com.calculadora.controller;

import java.util.Map;

@RestController
public class CalculadoraController {

    @PostMapping("/calcular") // Define que este metodo vai ser executado
    public Map<String, Object>
    calcular(@RequestBody Map<String, String>corpo) {

        String expressao = corpo.get("expressao"); // Recebe do Js
        double resultado = 0;

        // Verifição de expressão
        try {
            if (expressao.contains("+")) {
                String[] partes = expressao.split("\\+");
                // Conversão de String para Real
                resultado = new soma(Double.parseDouble(partes[0]), Double.parseDouble(partes[1])).executar();

            } else if (expressao.contains("-")) {
                String[] partes = expressao.split("-");
                // Conversão de String para Real
                resultado = new Subtracao(Double.parseDouble(partes[0]), Double.parseDouble(partes[1])).executar();

            } else if (expressao.contains("*")) {
                String[] partes = expressao.split("\\*");
                // Conversão de String para Real
                resultado = new Multiplicacao(Double.parseDouble(partes[0]), Double.parseDouble(partes[1])).executar();

            } else if (expressao.contains("/")) {
                String[] partes = expressao.split("/");
                // Conversão de String para Real
                resultado = new Divisao(Double.parseDouble(partes[0]), Double.parseDouble(partes[1])).executar();
            }

            // Retorna para o Js
            return Map.of("resultado", resultado);

        }

        // Tratamento de erro
        catch (Exception e) {
            return Map.of("resultado", "Erro");

        }
    }
}