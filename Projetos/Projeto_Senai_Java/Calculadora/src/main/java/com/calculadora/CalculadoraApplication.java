package com.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main
@SpringBootApplication
public class CalculadoraApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculadoraApplication.class, args);

        System.out.println("Acesse: http://localhost:8080"); // Local do arquivo 
    }

}
