package com.SistemaVendas.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class VendaProduto {

    private Integer idVendaProduto;
    private Integer idProduto;
    private Integer idVenda;
    private Integer Quantidade;
    private Double ValorUnitario;
    private Double Desconto;
}
