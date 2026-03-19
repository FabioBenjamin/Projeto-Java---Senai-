package com.SistemaVendas.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cidade {

    private Integer idCidade;
    private Integer idEstado;
    private String nomeCidade;

}
