package com.SistemaVendas.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {

    private Integer idCliente;
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private Integer cpf;
    private Integer rg;
    private String Email;
    private String Sexo;
}


