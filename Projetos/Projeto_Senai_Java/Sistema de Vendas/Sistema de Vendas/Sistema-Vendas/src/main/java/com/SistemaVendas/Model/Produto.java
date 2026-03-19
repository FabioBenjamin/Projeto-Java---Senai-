package com.SistemaVendas.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Produto {

    private Integer idProduto;
    private String nomeProduto;
    private String descricao;
    private Double ValorCusto;
    private Double ValorVenda;

}
