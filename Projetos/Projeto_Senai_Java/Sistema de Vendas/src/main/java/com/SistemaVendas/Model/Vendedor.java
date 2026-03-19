package com.SistemaVendas.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Vendedor {
    private int id;
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;
    private LocalDate dataContrato;

}
